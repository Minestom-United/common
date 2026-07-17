plugins {
    `java-library`
    `maven-publish`
}

group = "dev.minestom-united.common"
version = getVersionForSubProject(project)

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }

    repositories {
        maven {
            name = "MinestomUnitedRepository"
            val isSnapshot = version.toString().contains("-SNAPSHOT")
            url = uri(
                if (isSnapshot)
                    "https://repo.minestom-united.dev/snapshots"
                else "https://repo.minestom-united.dev/releases"
            )

            var u = System.getenv("REPO_USERNAME")
            var p = System.getenv("REPO_PASSWORD")

            if (u == null || u.isEmpty()) {
                u = "no-value-provided"
            }
            if (p == null || p.isEmpty()) {
                p = "no-value-provided"
            }

            val user = providers.gradleProperty("MinestomUnitedRepositoryUsername").orElse(u).get()
            val pass = providers.gradleProperty("MinestomUnitedRepositoryPassword").orElse(p).get()

            credentials {
                username = user
                password = pass
            }
            authentication {
                create<BasicAuthentication>("basic") {

                }
            }
        }
    }
}
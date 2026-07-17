plugins {
    `java-library`
    `maven-publish`
    id("com.vanniktech.maven.publish")
}

group = "dev.minestom-united.common"
version = getVersionForSubProject(project)

java {
    withSourcesJar()
    withJavadocJar()
}

mavenPublishing {
    coordinates("dev.minestom-united.common", project.name, version as String?)

    publishToMavenCentral()
    signAllPublications()

    pom {
        name = project.name
        description = project.description
        url = "https://github.com/Minestom-United/common"

        licenses {
            license {
                name = "MIT"
                url = "https://github.com/Minestom-United/common/blob/master/LICENSE"
            }
        }

        developers {
            developer {
                id = "Foxikle"
                url = "https://github.com/Foxikle"
            }

            developer {
                id = "TropicalShadow"
                url = "https://github.com/TropicalShadow"
            }

            developer {
                id = "Webhead1104"
                url = "https://github.com/Webhead1104"
            }
        }

        issueManagement {
            system = "Github"
            url = "https://github.com/Minestom-United/common/issues"
        }

        scm {
            url.set("https://github.com/Minestom-United/common")
            connection.set("scm:git:git://github.com/Minestom-United/common.git")
            developerConnection.set("scm:git:git@github.com:Minestom-United/common.git")
        }
    }
}
import org.gradle.api.Project

fun getVersionForSubProject(project: Project): String {
    val version: String = project.findProperty("${project.name}-version") as String?
        ?: throw NullPointerException("Could not find version for ${project.name}")
    return version
}
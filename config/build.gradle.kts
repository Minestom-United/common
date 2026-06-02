plugins {
    id("publish-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":codec"))
    compileOnly(libs.minestom)
    compileOnly(libs.minimessage)
    compileOnly(libs.logging.api)

}
plugins {
    id("publish-conventions")
}

description = "A simple config library"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":codec"))
    compileOnly(libs.minestom)
    compileOnly(libs.minimessage)
    compileOnly(libs.logging.api)
}

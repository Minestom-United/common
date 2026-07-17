plugins {
    id("publish-conventions")
}

description = "A simple config library"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":codec"))
    api(libs.logging.api)
}

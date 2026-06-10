plugins {
    id("publish-conventions")
}

description = "Some utilities for Minestom codecs"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":codec"))
    compileOnly(libs.minestom)
    compileOnly(libs.minimessage)
}

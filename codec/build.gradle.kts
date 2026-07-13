plugins {
    id("publish-conventions")
}

description = "A library to get Minestom codecs everywhere"

repositories {
    mavenCentral()
}

dependencies {
    api(libs.jetbrainsAnnotations)
    api(libs.gson)
    api(libs.adventure)
    api(libs.adventure.nbt)
}

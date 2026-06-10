plugins {
    id("publish-conventions")
}

description = "A library to get Minestom codecs everywhere"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(libs.minestom)
}

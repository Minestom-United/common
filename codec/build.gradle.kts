plugins {
    id("publish-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(libs.minestom)
}
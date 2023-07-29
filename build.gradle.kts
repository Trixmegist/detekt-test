plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("io.gitlab.arturbosch.detekt") version "1.23.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
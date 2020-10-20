plugins {
    kotlin("jvm") version "1.4.0"
    application
    id("org.openjfx.javafxplugin") version "0.0.9"
}
group = "city.windmill"
version = "1.0-SNAPSHOT"

val tornadofx_version: String by rootProject

repositories {
    mavenCentral()
}

application {
    mainClassName = "com.example.MainKt"
}

javafx {
    version = "11.0.2"
    modules = listOf("javafx.controls", "javafx.graphics")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("no.tornado:tornadofx:$tornadofx_version")

    testImplementation(kotlin("test-junit"))

    implementation(project("sp-api"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}
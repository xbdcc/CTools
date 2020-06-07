import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.72"
}

allprojects {
    repositories {
        mavenCentral()
    }
}
// Top-level build.gradle
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48")
    }
}

plugins {
    id("com.google.dagger.hilt.android") version "2.48" apply false
    id("org.jetbrains.kotlin.android") version "1.9.21" apply false
}

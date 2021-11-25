buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
        classpath(kotlin("gradle-plugin", version = "1.5.31"))
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

plugins {
    application
    id("org.graalvm.buildtools.native") version "0.9.28"
}

repositories {
    mavenCentral()
}

dependencies {
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("io.github.limo520.graalvmdemo.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

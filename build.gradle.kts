plugins {
    kotlin("jvm") version "1.9.20"
    id("io.ktor.plugin") version "2.3.12"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.2.23") // Add this line
    implementation("io.ktor:ktor-server-core:2.3.12") // Core functionalities, including Application
    implementation("io.ktor:ktor-server-netty:2.3.12") // For the Netty engine
    implementation("io.ktor:ktor-server-content-negotiation:2.3.12") // For content negotiation
    implementation("io.ktor:ktor-serialization:2.3.12") // Optional, for JSON serialization
    testImplementation("io.ktor:ktor-server-tests:2.3.12") // For testing Ktor routes
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.12")
    implementation("ch.qos.logback:logback-classic:1.2.10")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "MainKt" // Ensure the Main-Class is set here
    }
}

application {
    mainClass.set("MainKt")
}
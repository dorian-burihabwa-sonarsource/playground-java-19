plugins {
    id("java")
    id("org.sonarqube") version "3.5.0.2730"
}

group = "org.sonar.java.nineteen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

sonarqube {
    properties {
        property ("sonar.projectKey", "dorian-burihabwa-sonarsource_playground-java-19")
        property ("sonar.organization", "dorian-burihabwa-sonarsource")
        property ("sonar.host.url", "https://sonarcloud.io")
    }
}
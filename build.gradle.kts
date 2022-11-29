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
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("org.assertj:assertj-core:3.23.1")
}

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("--enable-preview")
}

tasks.withType<Test>() {
    useJUnitPlatform()
    jvmArgs = listOf("--enable-preview")
}

tasks.withType<JavaExec>() {
    jvmArgs = listOf("--enable-preview")
}



sonarqube {
    properties {
        property ("sonar.projectKey", "dorian-burihabwa-sonarsource_playground-java-19")
        property ("sonar.organization", "dorian-burihabwa-sonarsource")
        property ("sonar.host.url", "https://sonarcloud.io")
    }
}
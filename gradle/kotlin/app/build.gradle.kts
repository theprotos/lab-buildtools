
plugins {
    application // <1>
}

repositories {
    mavenCentral() // <2>
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1") // <3>

    implementation("com.google.guava:guava:30.1-jre") // <4>
}

application {
    mainClass.set("demo.App") // <5>
}

tasks.test {
    useJUnitPlatform() // <6>
}

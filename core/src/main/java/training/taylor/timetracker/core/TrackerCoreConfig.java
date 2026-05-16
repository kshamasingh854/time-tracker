<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>training.taylor.time-tracker</groupId>
    <artifactId>time-tracker-parent</artifactId>
    <packaging>pom</packaging>
    <version>0.5.0-SNAPSHOT</version>

    <name>Time Tracker (Parent)</name>

    <properties>
        <spring.version>5.3.30</spring.version>
        <java.version>17</java.version>
        <junit.version>4.13.2</junit.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.release>17</maven.compiler.release>
    </properties>

    <modules>
        <module>core</module>
        <module>web</module>
    </modules>

    <build>
        <pluginManagement>
            <plugins>

                <!-- Modern Compiler Plugin -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.11.0</version>
                    <configuration>
                        <release>${java.version}</release>
                    </configuration>
                </plugin>

            </plugins>
        </pluginManagement>
    </build>

</project>

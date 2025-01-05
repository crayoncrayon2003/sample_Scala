# Root Dir
```
cd 90_Maven/sample1
```

# Make MavenProject
```
mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=helloworld \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
```

# Edit pom.xml
```
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>helloworld</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <scala.version>2.13.6</scala.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.scala-lang</groupId>
            <artifactId>scala-library</artifactId>
            <version>${scala.version}</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>net.alchim31.maven</groupId>
                <artifactId>scala-maven-plugin</artifactId>
                <version>4.4.0</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>

```

# Edit dir
## delete default dir
```
rm -R helloworld/src
```
## mkdir sample dir
```
mkdir -p helloworld/src/main/scala/com/example
```

# Create .Scala
helloworld/src/main/scala/com/example/App.scala
```
package com.example

object App {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
  }
}
```


# Make JarFile
```
mvn compile
```

# Run
```
mvn exec:java -Dexec.mainClass=com.example.App
```


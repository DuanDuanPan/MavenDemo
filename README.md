# MavenDemo
demos about maven

>
quick start 

1.generate project struct

```
mvn archetype:generate -DgroupId=com.cssrc.study.maven \ -DartifactId=simple-weather \ -DpackageName=com.cssrc.study.maven \ -Dversion=1.0
```

2.add business code and resources

3.run with Exec plugin

```
mvn install
mvn exec:java -Dexec.mainClass=com.cssrc.study.maven.App
```

4.view dependency about project

```
mvn dependency:resolve

mvn dependency:tree
```

5. add test code and resources

6.run test
```
mvn test
```

7.pack with plugin

```
<plugin>
    <artifactId>maven-assembly-plugin</artifactId>
    <configuration>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
    </configuration>
</plugin>

mvn install assembly:assembly

cd target

java -cp simple-weather-1.0-jar-with-dependencies.jar com.cssrc.study.maven.App
```

# MavenDemo
demos about maven in charpter 5

>
how to generate webapp project

1.generate project struct

```
mvn archetype:generate -DgroupId=com.cssrc.study.maven -DartifactId=simple-web -DpackageName=com.cssrc.study.maven -DarchetypeArtifactId=maven-archetype-webapp
```

2.set jetty plugin

```
<plugins>
    <plugin>
         <groupId>org.mortbay.jetty</groupId>
         <artifactId>maven-jetty-plugin</artifactId>
     </plugin>
</plugins>
```

3.start jetty server

```
mvn jetty:run
```

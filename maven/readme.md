


```
# For windows use cmd, not powershell
mvn archetype:generate -DgroupId=com.demo -DartifactId=productservices -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
```


Update pom
```
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
```

java -cp target\hellomaven-1.0-SNAPSHOT.jar com.demo.App

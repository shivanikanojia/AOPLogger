# Logger With Spring AOP and AspectJ
## How to use
1. Add following Dependency in your pom.xml
    <dependency>
			<groupId>com.inexture</groupId>
			<artifactId>Logger_With_AOP</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>

2. Add Following repository
    <repositories>
		<repository>
			<id>maven-group</id>
			<url>http://192.168.84.1:8081/repository/maven-snapshots/</url>
		</repository>
	</repositories>

3. Add @Logging annotation over a class whose method's logs you want

4.Run your project

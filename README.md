# Logger With Spring AOP and AspectJ
## How to use
1. Add following Dependency in your pom.xml<br/>
  `<dependency>`<br/>
	`<groupId>com.inexture</groupId>` <br/>
	`<artifactId>Logger_With_AOP</artifactId>`<br/>
	`<version>0.0.1-SNAPSHOT</version>`<br/>
    `</dependency>`<br/>

2. Add Following repository<br/>
  `<repositories>`<br/>
	`<repository>`<br/>
		`<id>maven-group</id>`<br/>
		`<url>http://192.168.84.1:8081/repository/maven-snapshots/</url>`<br/>
	`</repository>`<br/>
   `</repositories>`<br/>

3. Add @Logging annotation over a class whose method's logs you want

4.Run your project

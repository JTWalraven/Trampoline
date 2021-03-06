# Trampoline

### Description

Welcome to **Trampoline**.

Are you Admin Spring Boot locally? Are you **tired of that set of scripts**? Relax, Trampoline has come into your life.

The aim is to **help during the course of developing an application based on the paradigm of microservices with _Spring Boot_**. How? Easy, thanks to a **comfortable interface** you can **declare new microservices**, **start instances** and **kill them**.

![Alt text](https://github.com/ErnestOrt/Trampoline/blob/master/TrampolineUI_3_6.png)

Also you will be able to:

* Admin Spring Boot locally
* Use configurable Actuator Endpoints and VM arguments
* Monitor memory usage for each instance, capturing their metrics every 30 seconds
* Monitor instances and trace information at any point in time
* See Git branch and last commit on instances
* Checkout branch, pull code and restart instances with a single mouse click
* Define microservices groups and launch them all with one click

### Requirements

* Java and Apache Maven or Gradle Wrapper
* Include your Gradle Wrapper next to your build files if your choice is Gradle as a Build Tool
* Include Spring Boot Actuator in your microservices
* Set up logging.path and/or logging.file properties in your microservices in order to be able to visualize logs
* Set up Git Info plugin in your microservices to see Git information on deployed instances (see examples provided)

### How do I make it work?

To Admin Spring Boot locally:

1. With the Trampoline project checked out go to the `trampoline` sub-folder
2. Now start `trampoline`, for instance with the well known commands _mvn spring-boot:run_ or _./gradlew (or gradlew.bat) bootRun_
3. Once started go to [localhost:8080](http://localhost:8080)
4. If using Apache Maven then be sure to enter the path to your installation here
5. Go to the _Settings Section_ and add all your microservices
6. Finally you just have to start your instances in the _Instances Section_

### FAQ

* Which build tools are Trampoline compatible with in my microservices?
	
You can use Apache Maven or Gradle Wrapper.

* Can I run it on any OS?

Theoretically yes, but it has only been fully tested on Windows and Mac OS.

* I am working with Spring Boot 1.3 or less and instances do not start

You should add security starter to your microservices `pom.xml`:

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>

```

* What are the plugins I should use to retrieve Git information?

```
"gradle.plugin.com.gorylenko.gradle-git-properties:gradle-git-properties:1.4.17"
```

```
<plugin>
	<groupId>pl.project13.maven</groupId>
	<artifactId>git-commit-id-plugin</artifactId>
	<version>2.2.3</version>
</plugin>
```

* TransportException: <my git repo>.git: Authentication is required but no CredentialsProvider has been registered]

If you don't have git in your local machine you can easily solve it by adding credentials on FetchCommand and PullCommands on GitManager like this:

```
git.fetch().setCredentialsProvider(new UsernamePasswordCredentialsProvider( "user", "password" ) ).setRemoveDeletedRefs(true).call();

git.pull().setCredentialsProvider(new UsernamePasswordCredentialsProvider( "user", "password" ) ).call();
```
Of course, you will have to place your user and password.

* Will I have to enter data all the time?

No, information introduced will be stored in a settings file along with scripts to launch each microservice :grin:. These files are stored in a `trampoline` folder inside your `Documents` folder on Mac and Linux or inside the `Temp` folder on Windows.

### Contributing
Start Admin Spring Boot locally and then click the star button to make the author and his neighbors happy :blush:. Then fork the repository and submit a pull request for whatever change you want to be added to this project.

If you have any questions, just open an issue.

# Enjoy it Folks!

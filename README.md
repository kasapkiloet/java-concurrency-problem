# How to run
Run [RaceTest](https://github.com/kasapkiloet/java-concurrency-problem/blob/main/src/test/java/com/example/project/RaceTest.java) locally or on [jdoodle](https://www.jdoodle.com/ia/10Pe)

# The Fix
Problem is the combination with Enum and UpdatePolicy classes.

Inside RaceTest, replace the line:  

    car.getUpdatePolicy().start(index);  

with:  

    car.start(index);  

and the test starts to succeed.

# Why does the test fail?
That's why you're invited to the repo! Please let me know if you figure it out.

# junit5-jupiter-starter-maven

The `junit5-jupiter-starter-maven` project demonstrates how to execute JUnit Jupiter
tests using Maven.

Please note that this project uses the [Maven Wrapper](https://github.com/apache/maven-wrapper).
Thus, to ensure that the correct version of Maven is used, invoke `mvnw` instead of `mvn`.

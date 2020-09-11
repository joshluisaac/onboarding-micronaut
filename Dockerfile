FROM openjdk:14-alpine
COPY build/libs/onboarding-micronaut-*-all.jar onboarding-micronaut.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "onboarding-micronaut.jar"]
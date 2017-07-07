steps to start:

1. Start mongodb
cd jhipster_project/uaa/src/main/docker
sudo docker-compose -f mongodb.yml up -d

2. Start service registry
cd jhipster_project/uaa/src/main/docker
sudo docker-compose -f jhipster-registry.yml up -d

3. Start UAA
./mvnw

4. Start apigateway
./mvnw

5. Start microservice(Spring)
mvn spring-boot:run

6. Start play-service(PlayFramework)
./sbt run

Refer https://github.com/archisoftconsulting/How-to-OAuth2, on how to generate and consume protected service.

How to Check docker status
sudo docker ps
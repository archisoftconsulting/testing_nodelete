steps to start:

1. Start mongodb<br>
cd jhipster_project/uaa/src/main/docker<br>
sudo docker-compose -f mongodb.yml up -d<br>

2. Start service registry<br>
cd jhipster_project/uaa/src/main/docker<br>
sudo docker-compose -f jhipster-registry.yml up -d<br>

3. Start UAA
./mvnw

4. Start apigateway
./mvnw

5. Start sidecar(spring)
mvn spring-boot:run

6. Start microservice(Spring)
mvn spring-boot:run

7. Start play-service(PlayFramework)
./sbt run

Refer https://github.com/archisoftconsulting/How-to-OAuth2, on how to generate and consume protected service.

How to Check docker status
sudo docker ps

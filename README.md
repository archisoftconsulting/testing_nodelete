# Steps to start:

## 1. Start mongodb
```
cd /uaa/src/main/docker
sudo docker-compose -f mongodb.yml up -d
```

## 2. Start service registry
```
cd /uaa/src/main/docker
sudo docker-compose -f jhipster-registry.yml up -d
```
## 3. Start UAA(OAuth2)
```
cd uaa
./mvnw
```
## 4. Start apigateway
```
cd apigateway
./mvnw
```

## 5. Start sidecar(spring protect any rest any language)
```
cd sidecar
mvn spring-boot:run
```

## 6. Start microservice(Spring)
```
cd microservice
mvn spring-boot:run
```

## 7. Start play-service(PlayFramework)
```
cd play-service
./sbt run
```

<br>
Refer https://github.com/archisoftconsulting/How-to-OAuth2, on how to generate and consume protected service.

How to Check docker status<br>
sudo docker ps

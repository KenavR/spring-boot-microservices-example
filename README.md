# spring-boot-microservices-example
This implementation includes a simple example for a spring boot microservice structure and a cross service REST request using RestTemplate.
The registration at Eureka works as intended but the request produces an error.

![eureka](https://raw.githubusercontent.com/KenavR/spring-boot-microservices-example/master/eureka.png)

## Start
1. Start GatewayApplication
2. Start PublicAPIApplication
3. Start MyServiceApplication
4. Access http://localhost:2222/service/test

## Error
This produces the following error
```
  Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed;
  nested exception is org.springframework.web.client.ResourceAccessException: I/O error on POST request for "http://MY-SERVICE/test": MY-SERVICE;
  nested exception is java.net.UnknownHostException: MY-SERVICE] with root cause
```

## Stackoverflow Question
http://stackoverflow.com/questions/37159662/microservices-resttemplate-unknownhostexception

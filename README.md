# Rabbit MQ Workqueues
Implementação do Work queues do Rabbit MQ


### Execução

1. Utilize o comando abaixo executar os receptores
```
spring-boot:run -Dspring.profiles.active=work-queues,receiver
```

2. Utilize o comando abaixo executar o fornecedor
```
spring-boot:run -Dspring.profiles.active=work-queues,sender
```

Obs.: Rode o receptor antes do fornecedor

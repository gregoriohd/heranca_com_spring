# Aplicando heranca com @MappedSuperclass jpa
Projeto de como aplicar heranca em entidade jpa

## DOC
http://localhost:8080/swagger-ui/index.html

## POST

http://localhost:8080/carro

```
{
  "id": 0,
  "marca": "string",
  "modelo": "string",
  "ano": 0,
  "quantidadePortas": 0
}
```

http://localhost:8080/moto

```
{
  "id": 0,
  "marca": "string",
  "modelo": "string",
  "ano": 0,
  "temSidecar": true
}
```

## GET - Retorna lista de carro ou moto

http://localhost:8080/carro

http://localhost:8080/moto
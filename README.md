# CapitoleChallengeJava
Challenge técnico Java - Capitole Consulting

Para poder cumplir con el requerimiento, decidí diseñar la API utilizando una arquitectura de Ports & Adapters, que nos permita tener un bajo acoplamiento.

Utilicé los siguientes componentes:

H2

JPA

mapStruct

Lombok

flyway

OpenAPI

Swagger


En la clase de repository realicé dos formas de acceder a la consulta, la primera (y la más fácil) fue utilizar un Query SQL tradicional para poder seleccionar la información solicitada. Tambien está codificado la misma consulta pero con JPA Named Queries, ya que la consulta se podria realizar de distintas maneras.


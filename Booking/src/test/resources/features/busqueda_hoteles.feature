# language: es

Característica: Busqueda de hoteles
Yo como usuario de booking
Quiero realizar la busqueda de hoteles

  Escenario: Busqueda de un grupo de hoteles
    Dado que el usuario Pedro navega en la pagina de booking
    Cuando intenta realizar consulta de un hotel Cartagena
    Entonces deberia ver la lista de hoteles disponibles

  Escenario: Resultados de busqueda de hoteles organizada por casas y apartamentos
    Dado que el usuario Pedro navega en la pagina de booking
    Cuando intenta realizar consulta de un hotel Cartagena
    Y intenta realizar consulta de un alojamiento tipo casa
    Entonces deberia ver la lista de hoteles organizados por casas
    
  Escenario: Resultados de busqueda de hoteles organizada por precio
    Dado que el usuario Pedro navega en la pagina de booking
    Cuando intenta realizar consulta de un hotel Cartagena
    Y intenta realizar consulta por precio más bajo
    Entonces deberia ver la lista de hoteles organizados por precio

  Escenario: Busqueda de disponibilidad de hoteles
    Dado que el usuario Pedro navega en la pagina de booking
    Cuando intenta realizar consulta de un hotel Cartagena
    Y intenta revisar la disponibilidad
    Entonces deberia ver la disponibilidad del hotel

  Escenario: Busqueda de hoteles modificando criterios de busqueda
    Dado que el usuario Pedro navega en la pagina de booking
    Cuando intenta realizar consulta de un hotel Cartagena
    Y modifica las fechas de busqueda
    Entonces deberia ver la lista de hoteles disponibles

# language: es

Característica: Consulta en booking
  Yo como usuario
  Quiero consultar en la pagina de booking

  Escenario:Login de usuario
    Dado que el usuario ingresa a la pagina de booking
    Cuando intenta iniciar sesion
    Entonces debera observar que se muestra la pagina de inicio de sesion

  Escenario: Busqueda de vuelos ida y vuelta
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de vuelos
    Y selecciona los criterios de busqueda con opcion de vuelos de ida y vuelta
    Entonces debera observar los vuelos disponibles en las fechas seleccionadas

  Escenario: Busqueda de vuelos solo ida
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de vuelos
    Y selecciona los criterios de busqueda con opcion de ida
    Entonces debera observar los vuelos disponibles en las fechas seleccionadas

  Escenario: Busqueda de vuelos multiples destinos
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de vuelos
    Y selecciona los criterios de busqueda con opcion de multiples destinos
    Entonces debera observar los vuelos disponibles en las fechas seleccionadas

  Escenario: Busqueda de vuelos directos solo ida
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de vuelos
    Y selecciona los criterios de busqueda con opcion de ida
    Y selecciona la opcion de vuelos directos
    Entonces debera observar los vuelos directos disponibles en las fechas seleccionadas

  Escenario: Busqueda de vuelos directos ida y vuelta
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de vuelos
    Y selecciona los criterios de busqueda con opcion de ida y vuelta
    Y selecciona la opcion de vuelos directos
    Entonces debera observar los vuelos directos disponibles en las fechas seleccionadas

  Escenario: Busqueda de vuelos directos multiples destinos
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de vuelos
    Y selecciona los criterios de busqueda con opcion de multiples destinos
    Y selecciona la opcion de vuelos directos
    Entonces debera observar los vuelos directos disponibles en las fechas seleccionadas

  Escenario: Busqueda de alquiler de coches para devolver en el mismo lugar
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de alquiler de cohes
    Y selecciona los criterios de busqueda con opcion de devolver en el mismo lugar
    Entonces debera observar los coches disponibles en las fechas seleccionadas

  Escenario: Busqueda de alquiler de coches para devolver en otro lugar
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de alquiler de cohes
    Y selecciona los criterios de busqueda con opcion de devolver en otro lugar
    Entonces debera observar los coches disponibles en las fechas seleccionadas

  Escenario: Busqueda de alquiler de coches para devolver en el mismo lugar con edad menor a 30
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de alquiler de cohes
    Y selecciona los criterios de busqueda con opcion de devolver en el mismo lugar
    Y selecciona  la edad del conductor
    Entonces debera observar los coches disponibles en las fechas seleccionadas

  Escenario: Busqueda de alquiler de coches para devolver en otro lugar con edad menor a 30
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de alquiler de cohes
    Y selecciona los criterios de busqueda con opcion de devolver en otro lugar
    Y selecciona  la edad del conductor
    Entonces debera observar los coches disponibles en las fechas seleccionadas

  Escenario: Busqueda de atracciones turisticas
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de atracciones turisitcas
    Y busca por la ciudad Medellin
    Entonces debera observar los atracciones turisiticas de la ciudad de Medellin

  Escenario: Filtro de tours de atracciones turisticas
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de atracciones turisitcas
    Y busca por la ciudad Medellin
    Y selecciona la categoria Tours
    Entonces debera observar los tours de la ciudad de Medellin

  Escenario: Filtro de actividades de atracciones turisticas
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de atracciones turisitcas
    Y busca por la ciudad Medellin
    Y selecciona la categoria actividades
    Entonces debera observar los tours de la ciudad de Medellin

  Escenario: Filtro de atracciones turisticas por precio
    Dado que el usuario ingresa a la pagina de booking
    Cuando selecciona la opcion de atracciones turisitcas
    Y busca por la ciudad Medellin
    Y selecciona el rango de precios 0 - 87360
    Entonces debera observar los atracciones turisiticas de ese rango de precio

# Proyecto de automatización de Booking serenity-cucumber-gradle-screenplay

Un proyecto donde se muestra la implementación de automatización y de pruebas manuales con el uso del patrón serenity screenplay con cucumber y gradle.

La implementación de automatización se encuentra alojada en la carpeta Booking, la implemnetación de pruebas manuales se encuntra contemplada en la carpeta
Booking_Manual.

Las pruebas se ejecutan contra la página web de Booking.

# Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface)

# La estructura completa del proyecto es la siguiente:

+ model
    Clases que usan el patrón object builder o relcionadas con el modelo de dominio
    
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
    
+ interacion
    Clases que representan las interacciones directas con la interfaz de usuario
    
+ user_interface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
    
+ questions
    Objectos usados para consultar acerca del estado de la aplicación
    
Requerimientos
Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.

# Ejecución pruebas automatizadas

Para ejecutar el proyecto automatizado utilizar el runner BusquedaDeHoteles con los siguientes comandos según navegador chrome o firefox:

Chrome
clean test aggregate -Dcontext=chrome -Dwebdriver.driver=chrome 

Firefox
clean test aggregate -Dcontext=firefox -Dwebdriver.driver=firefox 

Se generará el reporte en la carpeta /target/site/serenity/

# Ejecución de pruebas manuales

Para ejecutar el proyecto de pruebas manuales utilizar el runner ConsultarBooking directamente o con el siguiente comando

clean test aggregate

# apiRest_Terminal

<b>Ejecucion</b>
Para una correcta ejecicion del programa debe tener instalado JDk 17 y postman en su computador.

<b>Configurar postman</b>
A continuacion debe configurar los metodos y pegar la url indicada para ver o enviar la informacion en el postman

Metodo: GET
URL: localhost:8080/api/terminal/verDestinos
Funcion: Ver destinos

Metodo: POST
URL: localhost:8080/api/terminal/crearDestino
Funcion: Crear destino


Sintaxis


{
        "lugar": "Armenia",
        "tiempo": 70
}

Metodo: GET
URL: localhost:8080/api/pasajeros/verPasajeros
Funcion: Ver pasajeros

Metodo: GET
URL: localhost:8080/api/bus/verBuses
Funcion: Ver buses

Metodo: POST
URL: localhost:8080/api/bus/crearBus
Funcion: Crear bus


Sintaxis


{
        "marca": "Bolivariano",
        "destino": {
            "id": "1",
            "lugar": "Bogota",
            "tiempo": 60.0
        },
        "pasajeros":
        null,
        "hora": "8:00AM",
        "capacidad": 5
}

Metodo: GET
URL: localhost:8080/api/viajes/verViajes
Funcion: Ver viajes

Metodo: POST
URL: localhost:8080/api/viajes/crearViaje
Funcion: Crear viaje


Sintaxis


{ 
        "id": "4",
        "marca": "Chino",
        "destino": {
            "id": "4",
            "lugar": "Buga",
            "tiempo": 90.0
        },
        "pasajeros":
        [
            {
                "id": "1",
                "nombre": "Carlos",
                "identificacion": 123,
                "telefono": 313
            },
            {
                "id": "2",
                "nombre": "Fabio",
                "identificacion": 456,
                "telefono": 313
            },
            {
                "id": "3",
                "nombre": "Mario",
                "identificacion": 789,
                "telefono": 313
            }
        ],
        "hora": "11:00AM",
        "capacidad": 4
}

<b>Logica</b>
Es una terminal que inicialmente se ejecuta con 4 destinos, 4 buses y 9 pasajeros disponibles, los buses contienen su lista de pasajeros que inicialmente es null y el destino, por ende, al crear un viaje solo debo pasarle un bus con una lista de pasajeros, y al crearlo segun el id de los pasajeros del bus, estos se eliminan de la lista de pasajeros disponibles del terminal y lo mismo pasa con los buses, pero esos datos quedan guardados en el registro de viajes

#Test alta de usuarios
curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "mcastrol", "nom": "Marcela","cognoms":"Castro León","email":"mcastrol@gmail.com"}' http://localhost:8080/usuari
curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "nico", "nom": "nico","cognoms":"Hernández","email":"nico"}' http://localhost:8080/usuari
curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "kyla", "nom": "kyla","cognoms":"Hernández","dataNaixement":"2017-10-10"}' http://localhost:8080/usuari
#Test modificación
curl -i -X PUT -H "Content-Type:application/json" -d '{"codUsuari": "mcastrol", "nom": "Marcela","cognoms":"Castro León","email":"mcastrol@gmail.com","adreça":"Sabadell" }' http://localhost:8080/usuari/1
#Test Obtener todos los datos
curl -i -X GET http://localhost:8080/usuari
#Test Obtener los datos de 1 usuario
curl -i -X GET http://localhost:8080/usuari/1
#Test modificar un atributo
curl -i -X PATCH -H "Content-Type:application/json" -d '{"adreça":"Carrer xxxx Sabadell" }' http://localhost:8080/usuari/1
#Test Lista de funciones disponibles 
curl -i -X GET http://localhost:8080/usuari/search
#Test Buscar por email
curl -i -X GET  http://localhost:8080/usuari/search/findByEmail?email=mcastrol@gmail.com
#Test Borrar por email
curl -i -X GET  http://localhost:8080/usuari/search/deleteByEmail?email=mcastrol@gmail.com
#Test Borrar por id
curl -i -X DELETE  http://localhost:8080/usuari/2


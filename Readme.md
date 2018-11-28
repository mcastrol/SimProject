# ** Serveis i Multimedia SIM - Project Mòdul AOS **



El cas pràctic consisteix en l'anàlisi, disseny i desenvolupament d'un servei web ReST que s'utilitzarà per a registrar l’usuari i un bug del test d'un joc. Les operacions necessàries seran: 1). Donar d’alta d'un nou usuari en la plataforma. Les dades necessàries seran Nom, cognom, data de naixement i correu electrònic (obligatoris), país naixement, país de residència i adreça (opcional). L'operació retornarà la identificació de l'usuari. 

This application have
* Usuari application serves from
http://localhost:808/usuari 

**Configurar**
- Conectarse a Mysql
- Crear BD 
CREATE DATABASE aos
- Crear usuario gimbernatsim
- Configurar fichero src/main/resources/application.properties

spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/aos
spring.datasource.username=gimbernatsim
spring.datasource.password=gimbernat`_


**Como Iniciar**
    Run Aplication
    
**Operaciones disponibles**

- Alta de un usuari
	POST 		
	    Parámetros de entrada (Json)    String  CodUsuari;
                                        String  nom;
                                        String  cognoms;
                                        String  dataNaixement;
                                        String  email;
                                        String  paisDeNaixement;
                                        String  paisDeResidencia;
                                        String  Adreça;  
	    Salida:    (Json)               Json http://localhost:808/usuari/{id usuari}
	                            
	    Ejemplo: 
	     **curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "mcastrol", "nom": "Marcela","cognoms":"Castro León","email":"mcastrol@gmail.com"}' http://localhost:8080/usuari
	     **curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "nico", "nom": "nico","cognoms":"Hernández","email":"nico"}' http://localhost:8080/usuari
         **curl -i -X POST -H "Content-Type:application/json" -d '{"codUsuari": "kyla", "nom": "kyla","cognoms":"Hernández","dataNaixement":"2017-10-10"}' http://localhost:8080/usuari

- Modificar un usuari
	PUT 	
	    Parámetros de entrada (Json)    String  CodUsuari;
                                        String  nom;
                                        String  cognoms;
                                        String  dataNaixement;
                                        String  email;
                                        String  paisDeNaixement;
                                        String  paisDeResidencia;
                                        String  Adreça;  
                                        {id usuari}
	    Salida:    (Json)               http://localhost:808/usuari/{id usuari}

	    Ejemplo: 
	     **curl -i -X PUT -H "Content-Type:application/json" -d '{"codUsuari": "mcastrol", "nom": "Marcela","cognoms":"Castro León","email":"mcastrol@gmail.com","Adreça":"Sabadell" }' http://localhost:8080/usuari/1**

- Obtener todos los usuarios	
    GET 	
        Parámetros de entrada: NONE	
        Salida:  (Json)                  Lista de  {<usuaris>}
        Ejemplo: **curl -i -X GET http://localhost:8080/usuari**

	
- Modificar un atributo de un usuario	
    PATCH 	
	    Parámetros de entrada (Json)    String  CodUsuari;
                                        String  nom;
                                        String  cognoms;
                                        String  dataNaixement;
                                        String  email;
                                        String  paisDeNaixement;
                                        String  paisDeResidencia;
                                        String  Adreça;  
                                        {id usuari}	
	    Salida:    (Json)               http://localhost:808/usuari/{id usuari}
        Ejemplo: 
        **curl -i -X PATCH -H "Content-Type:application/json" -d '{"Adreça":"Carrer xxxx Sabadell" }' http://localhost:8080/usuari/1**

- Buscar functiones disponibles

    GET search 	
        Parámetros de entrada: NONE	
        Salida:     Lista de funciones disponibles
        Ejemplo: **curl -i -X GET http://localhost:8080/usuari/search**
                
- Encontrar por email 	
    GET /search/findByEmail 	
        Parámtros de Entrada    String email 	
	    Salida:    (Json)               Json http://localhost:808/usuari/{id usuari}
        Ejemplo: **curl -i -X GET  http://localhost:8080/usuari/search/findByEmail?email=mcastrol@gmail.com**
        
- Eliminar por email 	
    GET  /search/deleteByEmail	
        Parámetros de Entrada    String email 	
	    Salida:     
        Ejemplo: **curl -i -X GET  http://localhost:8080/usuari/search/deleteByEmail?email=mcastrol@gmail.com**


- Eliminar por id 	
    DELETE 	
        Parametros de Entrada    NONE 	
	    Salida:     
        Ejemplo: **curl -i -X DELETE  http://localhost:8080/usuari/1**



**References**

https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-mapping-many-to-one-using-annotations-1.html



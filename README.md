PASOS PARA INICIAR APLICACION

EJECUTAR DESDE LA RAIZ DEL PROYECTO 

EJECUTAR 
mvn clean install PARA OBTENER JAR
PARA DOCKERIZAR JAR EJECUTAR 
docker build -t prueba .
docker run -e DATABASE_SERVER=jdbc:h2:mem:maeldung -dp 8080:8080 prueba

SE EJECUTARA LA APLICACION DESDE DOCKER
************
ENTRAR AL SIGUIENTE LINK : http://localhost:8080/h2
    CONECTAR
    driverclass : org.h2.Driver
    JDBC Url : jdbc:h2:~/maeldung
    User Name: sa

CREAR TABLA TASA E INICIAR DATOS
EJECUTAR SIGUIENTES QUERIES(COPIAR  Y PEGAR)

DROP TABLE IF EXISTS Tasa;
CREATE TABLE Tasa(
id varchar(10) NOT NULL,
monedaOrigen varchar(10) ,
monedaDestino varchar(10) ,
tasa Decimal(5,2),
PRIMARY KEY (id)
);


insert into Tasa (id, monedaOrigen,monedaDestino,tasa)values(1,'soles','dolar', 0.27 );
insert into Tasa (id, monedaOrigen,monedaDestino,tasa)values(2,'soles','euro', 0.25 );

insert into Tasa (id, monedaOrigen,monedaDestino,tasa)values(3, 'dolar','soles', 3.70 );
insert into Tasa (id, monedaOrigen,monedaDestino,tasa)values(4, 'dolar','euro', 0.93 );

insert into Tasa (id, monedaOrigen,monedaDestino,tasa)values(5,'euro','soles', 3.99 );
insert into Tasa (id, monedaOrigen,monedaDestino,tasa)values(6,'euro','dolar', 1.08 );


// DESPUES EJECUTAR EL FRONT ENTRAR AL LINK http://localhost:3000/  la contrasena es 123

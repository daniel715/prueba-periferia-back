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

select * from usuario;

DROP TABLE IF EXISTS Usuario;
CREATE TABLE Usuario(
                     idusuario  int NOT NULL,
                     nombre varchar(10) ,
                     email varchar(50) ,
                     password varchar(100),
                     PRIMARY KEY (idusuario)
);
insert into Usuario (idusuario, nombre,email,password)values(1,'admin','admin', '$2a$10$RXWPzQOx4jbgSyUCiWQpTOwlqzFmcj9CnJF8wwJnR8loxe4om42Aq' );
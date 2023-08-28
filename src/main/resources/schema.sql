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

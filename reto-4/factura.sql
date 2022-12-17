CREATE TABLE FACTURA(
    fac_id int PRIMARY KEY,
    fac_nomre_empresa varchar(255),
    fac_fecha DATETIME,
    fac_ciudad varchar(255),
    cli_id int,
    FOREIGN KEY (cli_id) REFERENCES CLIENTE (cli_id)
);
INSERT INTO FACTURA VALUES (1,'tienda unaleña','2021-08-25','bogota',1);
INSERT INTO FACTURA VALUES (2,'tienda unaleña','2021-08-26','bogota',2);
INSERT INTO FACTURA VALUES (3,'tienda unaleña','2021-08-27','bogota',3);

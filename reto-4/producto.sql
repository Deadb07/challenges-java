CREATE TABLE PRODUCTO ( 
    pro_id int PRIMARY KEY,
    pro_nombre varchar (255),
    pro_precio int,
    pro_descripcion LONGTEXT,
    pro_fecha_vencimiento DATE
);
INSERT INTO PRODUCTO values (1,'galletas unaleñas',1200,'galletas unaleñas de chocolate','2021-10-25');
INSERT INTO PRODUCTO values (2,'agua unaleña',2500,'agua manantial unaleña','2021-11-25');
INSERT INTO PRODUCTO values (3,'gaseosa unaleña',3500,'gaseosa unaleña de manzana','2021-08-20');
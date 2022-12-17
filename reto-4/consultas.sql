Select 'Consulta 1';
SELECT  pro_nombre FROM PRODUCTO ORDER BY pro_nombre;
Select 'Consulta 2';
SELECT  p.pro_nombre
FROM PRODUCTO P
INNER JOIN PRODUCTO_FACTURA PF
ON (P.pro_id = PF.pro_id)
INNER JOIN FACTURA F
ON (PF.fac_id = F.fac_id)
INNER JOIN CLIENTE C
ON (C.cli_id = F.cli_id)
WHERE C.cli_nombre = 'maria';
Select 'Consulta 3';
SELECT  C.cli_nombre
FROM CLIENTE C
INNER JOIN FACTURA F
ON (C.cli_id = F.cli_id)
INNER JOIN PRODUCTO_FACTURA PF
ON (PF.fac_id = F.fac_id)
WHERE PF.pro_id = (
SELECT  pro_id
FROM PRODUCTO
WHERE pro_nombre = 'galletas unaleñas');
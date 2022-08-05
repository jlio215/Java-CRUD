SELECT "Consulta 1";
SELECT Vehiculo.nombreFabricante
FROM Vehiculo
ORDER BY Vehiculo.nombreFabricante;

SELECT "Consulta 2";
SELECT nombreFabricante, precioUnitario, anioConstruccion 
	FROM vehiculo
	JOIN bicicleta
	ON idBicicleta= idVehiculo and anioConstruccion>=2019
    ORDER BY Vehiculo.nombreFabricante;

SELECT "Consulta 3";    
SELECT nombreFabricante
	FROM  motocicleta m
	JOIN proveedor p ON m.idProveedor = p.idProveedor
    JOIN vehiculo v ON  idVehiculo = idMotocicleta
    WHERE p.nombre like '%Auteco%';
    
SELECT "Consulta 4";
SELECT nombreFabricante
	FROM intencioncompra i
    JOIN vehiculo v
    ON i.idVehiculo= v.idVehiculo
    WHERE aliasCliente LIKE '%lucky%'
    order by nombreFabricante;
    
SELECT "Consulta 5";
SELECT  c.aliasCliente, nombres, apellidos
	FROM cliente c 
    JOIN intencioncompra i ON c.aliasCliente = i.aliasCliente
    JOIN vehiculo v ON i.idVehiculo = v.idVehiculo
    WHERE nombreFabricante LIKE '%Yeti%';

SELECT "Consulta 6";
SELECT COUNT(*)
	FROM bicicleta
	WHERE anioConstruccion >= 2019;
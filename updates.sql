UPDATE Bicicleta SET anioConstruccion= 2017
	WHERE idBicicleta=1;
    
UPDATE cliente SET celular= 3115678432
	WHERE aliasCliente="ninja";

DELETE FROM IntencionCompra
	WHERE aliasCliente="green" AND idVehiculo =2;

DELETE FROM Proveedor WHERE idProveedor LIKE '%6%';

SET SQL_SAFE_UPDATES=0;

INSERT INTO `vehiculo`(`idVehiculo`,`nombreFabricante`,`precioUnitario`) VALUES(1, 'Cannondale', 1200000);
INSERT INTO `bicicleta`(`idBicicleta`,`anioConstruccion`)VALUES(1, 2020);
-- TODO las otras bicicletas


INSERT INTO `proveedor`(`idProveedor`,`nombre`,`direccion`,`telefono`)VALUES(1, 'Auteco', 'calle 7 No. 45-17', '05713224459');
-- TODO los otros proveedores


INSERT INTO `vehiculo`(`idVehiculo`,`nombreFabricante`,`precioUnitario`)VALUES(6, 'Starker', 4200000);
INSERT INTO `motocicleta`(`idMotocicleta`,`autonomia`,`idProveedor`)VALUES(6, 18, 1);
-- TODO

INSERT INTO `cliente`(`aliasCliente`,`nombres`,`apellidos`) VALUES ('lucky', 'pedro', 'perez');
-- TODO

INSERT INTO `intencioncompra`(`idIntencionCompra`,`aliasCliente`,`idVehiculo`,`fecha`)VALUES(1, 'lucky',1, '2017-10-25 20:00:00');
-- TODO
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (1, "Cannondale", 1200000);
INSERT INTO Bicicleta (idBicicleta, anioConstruccion) VALUES (1, 2020);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (2, "Trek", 1450000);
INSERT INTO Bicicleta (idBicicleta, anioConstruccion) VALUES (2, 2019);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (3, "Yeti", 2000000);
INSERT INTO Bicicleta (idBicicleta, anioConstruccion) VALUES (3, 2020);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (4, "Fuji", 950000);
INSERT INTO Bicicleta (idBicicleta, anioConstruccion) VALUES (4, 2021);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (5, "Bmc", 1950000);
INSERT INTO Bicicleta (idBicicleta, anioConstruccion) VALUES (5, 1018);

INSERT INTO Proveedor (idProveedor, nombre, direccion, telefono) VALUES (1, "Auteco", "calle 7 No. 45-17", "05713224459");
INSERT INTO Proveedor (idProveedor, nombre, direccion, telefono) VALUES (2, "Hitachi", "calle 19 No. 108-26", "05714223344");
INSERT INTO Proveedor (idProveedor, nombre, direccion, telefono) VALUES (3, "Bosch", "carrera 68 No. 26-45", "05715678798");
INSERT INTO Proveedor (idProveedor, nombre, direccion, telefono) VALUES (4, "Teco", "calle 77 No. 68-33", "05712213243");
INSERT INTO Proveedor (idProveedor, nombre, direccion, telefono) VALUES (5, "General Electric", "calle 29 No. 26-12", "05717239919");

INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (6, "Starker", 4200000);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (7, "Lucky Lion", 5600000);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (8, "Be Electric", 4600000);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (9, "Aima", 8000000);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (10, "Mec de Colombia", 5900000);
INSERT INTO Vehiculo (idVehiculo, nombreFabricante, precioUnitario) VALUES (11, "Atom Electric", 4500000);

INSERT INTO Motocicleta (idMotocicleta, autonomia, idProveedor) VALUES (6, 18 , 1);
INSERT INTO Motocicleta (idMotocicleta, autonomia, idProveedor) VALUES (7, 14 , 2);
INSERT INTO Motocicleta (idMotocicleta, autonomia, idProveedor) VALUES (8, 26 , 1);
INSERT INTO Motocicleta (idMotocicleta, autonomia, idProveedor) VALUES (9, 36 , 3);
INSERT INTO Motocicleta (idMotocicleta, autonomia, idProveedor) VALUES (10, 20 , 4);
INSERT INTO Motocicleta (idMotocicleta, autonomia, idProveedor) VALUES (11, 12 , 5);

INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("lucky", "Pedro", "Perez");
INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("malopez", "Maria", "Lopez");
INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("diva", "Ana", "Diaz");
INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("dreamer", "Luis", "Rojas");
INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("ninja", "Andres", "Cruz");
INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("neon", "Nelson", "Ruiz");
INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("rose", "Claudia", "Mendez");
INSERT INTO Cliente (aliasCliente, nombres, apellidos) VALUES ("green", "Jorge", "Rodriguez");

INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (1, "lucky", 1, '2017-10-25 20:00:00');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (2, "lucky", 2, '2019-03-15 18:30:00');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (3, "lucky", 6, '2019-05-20 20:30:00');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (4, "malopez", 1, '2018-05-20 20:30:00');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (5, "malopez", 6, '2020-01-20 20:30:00');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (6, "diva", 3, '2019-05-20 20:30:00');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (7, "diva", 4, '2018-06-22 21:30:00');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (8, "diva", 7, '2020-03-17 15:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (9, "dreamer", 7, '2020-03-17 15:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (10, "dreamer", 8, '2020-04-10 18:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (11, "ninja", 9, '2020-02-17 20:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (12, "ninja", 6,  '2020-02-20 16:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (13, "ninja", 10, '2020-03-27 18:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (14, "rose", 11, '2020-03-20 21:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (15, "green", 3, '2020-01-10 17:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (16, "green", 2, '2020-02-15 20:30:20');
INSERT INTO IntencionCompra (idIntencionCompra, aliasCliente, idVehiculo, fecha) VALUES (17, "green", 5, '2020-03-17 18:30:20');

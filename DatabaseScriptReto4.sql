
-- -----------------------------------------------------
-- Schema ecodosruedas
-- -----------------------------------------------------
-- DROP SCHEMA IF EXISTS `ecodosruedas` ;

-- -----------------------------------------------------
-- Schema ecodosruedas
-- -----------------------------------------------------
-- CREATE SCHEMA IF NOT EXISTS `ecodosruedas` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
-- USE `ecodosruedas` ;

-- -----------------------------------------------------
-- Table `ecodosruedas`.`Vehiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Vehiculo` (
  `idVehiculo` INT NOT NULL,
  `nombreFabricante` VARCHAR(20) NOT NULL,
  `precioUnitario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idVehiculo`));


-- -----------------------------------------------------
-- Table `ecodosruedas`.`Bicicleta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bicicleta` (
  `idBicicleta` INT NOT NULL,
  `anioConstruccion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idBicicleta`),
  CONSTRAINT `fk_Bicicleta_Vehiculo`
    FOREIGN KEY (`idBicicleta`)
    REFERENCES `Vehiculo` (`idVehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `ecodosruedas`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Proveedor` (
  `idProveedor` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProveedor`));


-- -----------------------------------------------------
-- Table `ecodosruedas`.`Motocicleta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Motocicleta` (
  `idMotocicleta` INT NOT NULL,
  `autonomia` INT NOT NULL,
  `idProveedor` INT NOT NULL,
  PRIMARY KEY (`idMotocicleta`),
  CONSTRAINT `fk_Motocicleta_Vehiculo`
    FOREIGN KEY (`idMotocicleta`)
    REFERENCES `Vehiculo` (`idVehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Motocicleta_Proveedor`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `Proveedor` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `ecodosruedas`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cliente` (
  `aliasCliente` VARCHAR(20) NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `celular` VARCHAR(20) NULL,
  `password` DECIMAL(8) NULL,
  `fechaNacimiento` DATETIME NULL,
  PRIMARY KEY (`aliasCliente`));

-- -----------------------------------------------------
-- Table `ecodosruedas`.`IntencionCompra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `IntencionCompra` (
  `idIntencionCompra` INT NOT NULL,
  `aliasCliente` VARCHAR(20) NOT NULL,
  `idVehiculo` INT NOT NULL,
  `fecha` DATETIME NOT NULL,
  PRIMARY KEY (`idIntencionCompra`),
  CONSTRAINT `fk_IntencionCompra_Cliente`
    FOREIGN KEY (`aliasCliente`)
    REFERENCES `Cliente` (`aliasCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_IntencionCompra_Vehiculo`
    FOREIGN KEY (`idVehiculo`)
    REFERENCES `Vehiculo` (`idVehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

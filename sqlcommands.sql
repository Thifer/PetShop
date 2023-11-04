CREATE TABLE `petshop`.`pets` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Type` VARCHAR(45) NOT NULL,
  `BirthDate` DATE NULL,
  `Commands` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

CREATE TABLE `petshop`.`packanimals` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Type` VARCHAR(45) NOT NULL,
  `BirthDate` DATE NULL,
  `Commands` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

INSERT INTO `petshop`.`pets` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Fido', 'Dog', '2020-01-01', 'Sit,Stay,Fetch');
INSERT INTO `petshop`.`pets` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Whiskers', 'Cat', '2019-05-15', 'Sit,Pounce');
INSERT INTO `petshop`.`pets` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Hammy', 'Hamster', '2021-03-10', 'Roll,Hide');
INSERT INTO `petshop`.`pets` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Buddy', 'Dog', '2018-12-10', 'Sit,Paw,Bark');

INSERT INTO `petshop`.`packanimals` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Thunder', 'Horse', '2015-07-21', 'Trot, Canter, Gallop');
INSERT INTO `petshop`.`packanimals` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load');
INSERT INTO `petshop`.`packanimals` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Eeyore', 'Donkey', '2017-09-18', 'Walk, Carry Load, Bray');
INSERT INTO `petshop`.`packanimals` (`Name`, `Type`, `BirthDate`, `Commands`) VALUES ('Storm', 'Horse', '2014-05-05', 'Trot, Canter');

CREATE TABLE `petshop`.`humanfriends` AS SELECT * FROM `petshop`.`packanimals` WHERE Type='Horse' OR Type='Donkey';

DELETE FROM `petshop`.`packanimals` WHERE TYPE = 'Camel';
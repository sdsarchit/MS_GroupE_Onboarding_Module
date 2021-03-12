-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema MS_Training
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema MS_Training
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `MS_Training` DEFAULT CHARACTER SET utf8 ;
USE `MS_Training` ;

-- -----------------------------------------------------
-- Table `MS_Training`.`OnboardeeDetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MS_Training`.`OnboardeeDetails` (
  `OnboardeeID` INT NOT NULL,
  `OnboardeeName` VARCHAR(45) NULL,
  `Date_of_Birth` VARCHAR(45) NULL,
  `Phone Number` VARCHAR(45) NULL,
  `Email` VARCHAR(45) NULL,
  `HighestQualifications` VARCHAR(45) NULL,
  PRIMARY KEY (`OnboardeeID`),
  UNIQUE INDEX `OnboardeeID_UNIQUE` (`OnboardeeID` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `MS_Training`.`OnboardeeRequirement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MS_Training`.`OnboardeeRequirement` (
  `DemandID` INT NOT NULL,
  `Location` VARCHAR(45) NULL,
  `Skills` VARCHAR(45) NULL,
  `OnboardeeID` INT NOT NULL,
  `Onboarding_Start_Date` VARCHAR(55) NULL,
  `ETA_for_Completion` VARCHAR(55) NULL,
  `BGC_Check_Status` VARCHAR(45) NULL DEFAULT 'Pending',
  `Onboarding_Status` VARCHAR(45) NULL DEFAULT 'Pending',
  `Created At` TIMESTAMP(20) NULL,
  `Modified Time` TIMESTAMP(20) NULL,
  PRIMARY KEY (`DemandID`),
  INDEX `OnboardeeID_idx` (`OnboardeeID` ASC),
  CONSTRAINT `OnboardeeID`
    FOREIGN KEY (`OnboardeeID`)
    REFERENCES `MS_Training`.`OnboardeeDetails` (`OnboardeeID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

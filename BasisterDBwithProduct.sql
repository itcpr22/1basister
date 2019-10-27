-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.26-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for liadocactivity
CREATE DATABASE IF NOT EXISTS `liadocactivity` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `liadocactivity`;

-- Dumping structure for table liadocactivity.producttable
CREATE TABLE IF NOT EXISTS `producttable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` text NOT NULL,
  `quant` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table liadocactivity.registrationtable
CREATE TABLE IF NOT EXISTS `registrationtable` (
  `FirstName` varchar(255) NOT NULL DEFAULT '0',
  `LastName` varchar(255) NOT NULL DEFAULT '0',
  `Username` varchar(255) NOT NULL DEFAULT '0',
  `Pass` varchar(255) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

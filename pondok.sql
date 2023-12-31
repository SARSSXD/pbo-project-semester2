-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.28-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for pondok
CREATE DATABASE IF NOT EXISTS `pondok` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `pondok`;

-- Dumping structure for table pondok.matpel
CREATE TABLE IF NOT EXISTS `matpel` (
  `id_matpel` int(20) NOT NULL AUTO_INCREMENT,
  `nama_matpel` varchar(100) NOT NULL,
  `waktu` varchar(20) NOT NULL,
  PRIMARY KEY (`id_matpel`)
) ENGINE=InnoDB AUTO_INCREMENT=2004 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table pondok.matpel: ~4 rows (approximately)
INSERT INTO `matpel` (`id_matpel`, `nama_matpel`, `waktu`) VALUES
	(2000, 'Fiqih', '10.40-11.30'),
	(2001, 'Teosofi', '9.00-10.40'),
	(2002, 'SPI', '12.20-14.00'),
	(2003, 'PKN', '06.30-08.00');

-- Dumping structure for table pondok.nilai
CREATE TABLE IF NOT EXISTS `nilai` (
  `id_nilai` int(11) NOT NULL AUTO_INCREMENT,
  `NISN` int(20) NOT NULL,
  `id_matpel` int(20) NOT NULL,
  `id_ustad` int(20) NOT NULL,
  `UAS` int(11) NOT NULL,
  `UTS` int(11) NOT NULL,
  PRIMARY KEY (`id_nilai`),
  KEY `NISN` (`NISN`),
  KEY `ID Matpel` (`id_matpel`),
  KEY `ID Ustad` (`id_ustad`),
  CONSTRAINT `nilai_ibfk_1` FOREIGN KEY (`NISN`) REFERENCES `santri` (`NISN`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nilai_ibfk_2` FOREIGN KEY (`id_ustad`) REFERENCES `ustad` (`id_ustad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nilai_ibfk_3` FOREIGN KEY (`id_matpel`) REFERENCES `matpel` (`id_matpel`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2003 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table pondok.nilai: ~1 rows (approximately)
INSERT INTO `nilai` (`id_nilai`, `NISN`, `id_matpel`, `id_ustad`, `UAS`, `UTS`) VALUES
	(1, 220605147, 2001, 1107111, 85, 80);

-- Dumping structure for table pondok.santri
CREATE TABLE IF NOT EXISTS `santri` (
  `NISN` int(20) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(100) NOT NULL,
  `tanggal_lahir` int(11) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Kelas` varchar(20) NOT NULL,
  PRIMARY KEY (`NISN`)
) ENGINE=InnoDB AUTO_INCREMENT=1234567891 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table pondok.santri: ~6 rows (approximately)
INSERT INTO `santri` (`NISN`, `Nama`, `tanggal_lahir`, `Alamat`, `Kelas`) VALUES
	(220605146, 'Uqie', 230404, 'Malang', 'A'),
	(220605147, 'Rama', 130302, 'Bali', 'A'),
	(220605148, 'Javier', 220703, 'Pasuruan', 'A'),
	(220605149, 'Doni', 260502, 'Sidoarjo', 'B'),
	(220605150, 'Rafi', 220603, 'Batu', 'B'),
	(220605151, 'Leri', 240503, 'Surabaya', 'B');

-- Dumping structure for table pondok.user
CREATE TABLE IF NOT EXISTS `user` (
  `id_user` varchar(50) NOT NULL,
  `password` char(32) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Dumping data for table pondok.user: 1 rows
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id_user`, `password`, `username`) VALUES
	('admin', '123', 'Administrator');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table pondok.ustad
CREATE TABLE IF NOT EXISTS `ustad` (
  `id_ustad` int(20) NOT NULL,
  `nama_ustad` varchar(100) NOT NULL,
  `Kelas` varchar(30) NOT NULL,
  KEY `id_ustad` (`id_ustad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table pondok.ustad: ~6 rows (approximately)
INSERT INTO `ustad` (`id_ustad`, `nama_ustad`, `Kelas`) VALUES
	(1107110, 'Supri', 'A'),
	(1107111, 'Rahman', 'B'),
	(1107112, 'Syauqi', 'C'),
	(1107113, 'Abdul', 'A'),
	(1107114, 'Shomad', 'B'),
	(1107115, 'Rofiq', 'C');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

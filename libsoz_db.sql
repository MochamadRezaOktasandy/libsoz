-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.28-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for libsoz
CREATE DATABASE IF NOT EXISTS `libsoz` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `libsoz`;

-- Dumping structure for table libsoz.buku
CREATE TABLE IF NOT EXISTS `buku` (
  `buku_id` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(50) DEFAULT NULL,
  `pengarang` varchar(50) DEFAULT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  `tahun` int(11) DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `lokasi` varchar(50) DEFAULT NULL,
  `sampul` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`buku_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table libsoz.buku: ~20 rows (approximately)
REPLACE INTO `buku` (`buku_id`, `judul`, `pengarang`, `penerbit`, `tahun`, `kategori`, `lokasi`, `sampul`) VALUES
	(1, 'Matahari', 'Tere Liye', 'Gramedia Pustaka Utama', 2019, 'Fiksi', NULL, NULL),
	(2, 'Laskar Pelangi', 'Andrea Hirata', 'Bentang Pustaka', 2005, 'Fiksi', NULL, NULL),
	(3, 'Bumi Manusia', 'Pramoedya Ananta Toer', 'Hasta Mitra', 1980, 'Fiksi', NULL, NULL),
	(4, 'Ayat-Ayat Cinta', 'Habiburrahman El Shirazy', 'Republika Penerbit', 2004, 'Fiksi', NULL, NULL),
	(5, 'Sang Pemimpi', 'Andrea Hirata', 'Bentang Pustaka', 2006, 'Fiksi', NULL, NULL),
	(6, 'Harry Potter and the Sorcerer\'s Stone', 'J.K. Rowling', 'Bloomsbury Publishing', 1997, 'Fantasi', NULL, NULL),
	(7, 'Gadis Pantai', 'Pramoedya Ananta Toer', 'Hasta Mitra', 1985, 'Fiksi', NULL, NULL),
	(8, 'Dilan: Dia adalah Dilanku tahun 1990', 'Pidi Baiq', 'Dar! Mizan', 2014, 'Fiksi', NULL, NULL),
	(9, 'Negeri 5 Menara', 'Ahmad Fuadi', 'Gramedia Pustaka Utama', 2009, 'Fiksi', NULL, NULL),
	(10, 'Sang Alchemist', 'Paulo Coelho', 'HarperCollins', 1988, 'Fiksi', NULL, NULL),
	(11, 'Ayah', 'Andrea Hirata', 'Bentang Pustaka', 2011, 'Fiksi', NULL, NULL),
	(12, 'Lima Sekawan', 'Enid Blyton', 'Egmont Group', 1942, 'Petualangan', NULL, NULL),
	(13, 'Perahu Kertas', 'Dee Lestari', 'Bentang Pustaka', 2009, 'Fiksi', NULL, NULL),
	(14, 'Laut Bercerita', 'Leila S. Chudori', 'Kepustakaan Populer Gramedia', 2017, 'Fiksi', NULL, NULL),
	(15, 'Sang Pencerah', 'Andrea Hirata', 'Bentang Pustaka', 2005, 'Fiksi', NULL, NULL),
	(16, 'Tenggelamnya Kapal Van Der Wijck', 'Hamka', 'Balai Pustaka', 1938, 'Fiksi', NULL, NULL),
	(17, 'Hujan', 'Tere Liye', 'Gramedia Pustaka Utama', 2014, 'Fiksi', NULL, NULL),
	(18, 'Bumi', 'Tere Liye', 'Gramedia Pustaka Utama', 2004, 'Fiksi', NULL, NULL),
	(19, 'Senja di Jakarta', 'Mochtar Lubis', 'Balai Pustaka', 1950, 'Fiksi', NULL, NULL),
	(20, 'Sitti Nurbaya', 'Marah Rusli', 'Balai Pustaka', 1922, 'Fiksi', NULL, NULL);

-- Dumping structure for table libsoz.member
CREATE TABLE IF NOT EXISTS `member` (
  `username` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `alamat` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table libsoz.member: ~1 rows (approximately)
REPLACE INTO `member` (`username`, `nama`, `tgl_lahir`, `email`, `no_telp`, `alamat`) VALUES
	('1', 'ASDJKASHASDJK', '2023-05-01', 'asdasasasd', '1232121312123', 'asdasdasdasdasdasdasdas');

-- Dumping structure for table libsoz.pinjam
CREATE TABLE IF NOT EXISTS `pinjam` (
  `pinjam_id` int(11) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `buku_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pinjam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table libsoz.pinjam: ~0 rows (approximately)

-- Dumping structure for table libsoz.user
CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(50) NOT NULL,
  `password` char(32) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table libsoz.user: ~5 rows (approximately)
REPLACE INTO `user` (`username`, `password`, `role`) VALUES
	('ammar', 'mars1234', NULL),
	('test1', '12345678', NULL),
	('test123', '12345678', NULL),
	('testttttt', '12345678', NULL),
	('user', '12345678', NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

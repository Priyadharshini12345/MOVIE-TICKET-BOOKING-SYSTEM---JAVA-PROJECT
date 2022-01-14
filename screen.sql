-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2022 at 07:57 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movieticketbooking`
--

-- --------------------------------------------------------

--
-- Table structure for table `screen`
--

CREATE TABLE `screen` (
  `ScreenID` varchar(100) NOT NULL,
  `RegistrationNumber` varchar(100) NOT NULL,
  `CapacityFR` int(11) NOT NULL,
  `CapacityMR` int(11) NOT NULL,
  `CapacityLR` int(11) NOT NULL,
  `PriceFR` int(11) NOT NULL,
  `PriceMR` int(11) NOT NULL,
  `PriceLR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `screen`
--

INSERT INTO `screen` (`ScreenID`, `RegistrationNumber`, `CapacityFR`, `CapacityMR`, `CapacityLR`, `PriceFR`, `PriceMR`, `PriceLR`) VALUES
('1A', 'TNT200', 25, 25, 25, 50, 120, 180),
('1B', 'TNT200', 49, 49, 49, 30, 120, 180),
('M1', 'TNT316', 25, 25, 25, 50, 190, 300),
('M2', 'TNT316', 25, 25, 25, 50, 190, 300),
('P1', 'TNT901', 25, 25, 25, 50, 160, 290),
('P2', 'TNT901', 25, 25, 25, 50, 140, 280),
('S9', 'TNT609', 25, 25, 25, 40, 120, 200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `screen`
--
ALTER TABLE `screen`
  ADD UNIQUE KEY `uk_screen_theatre` (`ScreenID`,`RegistrationNumber`),
  ADD KEY `RegistrationNumber` (`RegistrationNumber`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `screen`
--
ALTER TABLE `screen`
  ADD CONSTRAINT `screen_ibfk_1` FOREIGN KEY (`RegistrationNumber`) REFERENCES `theatre` (`registrationno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

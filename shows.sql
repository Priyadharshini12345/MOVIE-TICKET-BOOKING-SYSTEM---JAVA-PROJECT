-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2022 at 07:56 AM
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
-- Table structure for table `shows`
--

CREATE TABLE `shows` (
  `screenid` varchar(100) NOT NULL,
  `RegistrationNumber` varchar(100) NOT NULL,
  `movie` varchar(100) NOT NULL,
  `showdate` date NOT NULL,
  `showtime` time NOT NULL,
  `capacityfr` int(11) NOT NULL,
  `capacitymr` int(11) NOT NULL,
  `capacitylr` int(11) NOT NULL,
  `showid` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shows`
--

INSERT INTO `shows` (`screenid`, `RegistrationNumber`, `movie`, `showdate`, `showtime`, `capacityfr`, `capacitymr`, `capacitylr`, `showid`) VALUES
('1A', 'TNT200', 'Enthiran', '2022-01-30', '11:30:00', 24, 19, 22, 'S1'),
('1A', 'TNT200', 'Spiderman', '2022-01-08', '16:30:00', 25, 25, 19, 'S2'),
('M1', 'TNT316', 'Spiderman', '2022-01-20', '10:00:00', 25, 25, 25, 'SM1'),
('M1', 'TNT316', 'Enthiran', '2022-01-20', '01:00:00', 25, 25, 25, 'SM2'),
('P1', 'TNT901', 'Spiderman', '2022-01-16', '10:30:00', 25, 25, 22, 'SP1'),
('P1', 'TNT901', 'Spiderman', '2022-01-17', '07:30:00', 25, 25, 25, 'SP2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `shows`
--
ALTER TABLE `shows`
  ADD PRIMARY KEY (`showid`),
  ADD KEY `screenid` (`screenid`),
  ADD KEY `RegistrationNumber` (`RegistrationNumber`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `shows`
--
ALTER TABLE `shows`
  ADD CONSTRAINT `shows_ibfk_1` FOREIGN KEY (`screenid`) REFERENCES `screen` (`ScreenID`),
  ADD CONSTRAINT `shows_ibfk_2` FOREIGN KEY (`RegistrationNumber`) REFERENCES `theatre` (`registrationno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

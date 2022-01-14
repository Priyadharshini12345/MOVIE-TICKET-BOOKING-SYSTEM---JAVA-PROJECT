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
-- Table structure for table `theatre`
--

CREATE TABLE `theatre` (
  `name` varchar(1000) NOT NULL,
  `owner` varchar(1000) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `city` varchar(100) NOT NULL,
  `screens` int(11) NOT NULL,
  `registrationno` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `theatre`
--

INSERT INTO `theatre` (`name`, `owner`, `address`, `city`, `screens`, `registrationno`, `username`) VALUES
('PVR Cinemas', 'K.Velraj', 'No.9, Raja Street, Velachery Main Road', 'Chennai 100', 5, 'TNT200', 'prem73'),
('Mayajaal Cinemas', 'Mithra S', '12, Vallal Street, Siva Nagar, Velachery', 'Chennai', 3, 'TNT316', 'mithra2021'),
('Grand Cinemas', 'Jayashri P', 'No. 8, Gandhi Salai, Velachery', 'Chennai', 5, 'TNT609', 'jaya77'),
('Houseful Cinemas', 'Priyadharshini P', '9, Kamaraj 1st cross street, Avadi', 'Chennai', 3, 'TNT901', 'pjp001');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `theatre`
--
ALTER TABLE `theatre`
  ADD PRIMARY KEY (`registrationno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

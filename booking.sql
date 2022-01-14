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
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `Username` varchar(100) NOT NULL,
  `BookingID` varchar(10) NOT NULL,
  `ShowID` varchar(100) NOT NULL,
  `NoofSeats` int(11) NOT NULL,
  `TotalPrice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`Username`, `BookingID`, `ShowID`, `NoofSeats`, `TotalPrice`) VALUES
('pjp01', '0C9ER', 'S1', 1, 50),
('pjp01', '6TNUQ', 'S2', 3, 540),
('jhanvi13', '7MRY9', 'S1', 3, 540),
('pjp01', 'D1UQX', 'S1', 2, 240),
('pjp01', 'GF8XD', 'S2', 3, 540),
('pjp01', 'M50FM', 'S1', 2, 240),
('jhanvi13', 'UF15T', 'SP1', 3, 870),
('pjp01', 'XQVY1', 'S1', 2, 240);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`BookingID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

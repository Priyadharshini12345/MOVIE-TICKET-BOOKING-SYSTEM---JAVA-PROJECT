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
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Name` varchar(1000) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(1000) NOT NULL,
  `Email` varchar(1000) NOT NULL,
  `Address` varchar(1000) NOT NULL,
  `City` varchar(100) NOT NULL,
  `State` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Name`, `Username`, `Password`, `Email`, `Address`, `City`, `State`) VALUES
('Jhanvi S', 'jhanvi13', 'jsats13', 'jhanvis13@gmail.com', '9, V.O.C. street, Sri Devi Nagar, Avadi', 'Chennai', 'TamilNadu'),
('Priyadharshini', 'pjp01', 'priya382001', 'dharshini.jayashri@gmail.com', 'No. 20, Rajiv Gandhi street, OMR Road', 'Chennai', 'Tamil Nadu'),
('Preethi R', 'preethi02', 'preet0902', 'preethi@gmail.com', 'No.9 Kamaraj Nagar Velachery ', 'Chennai', 'Tamil Nadu'),
('Priyanka', 'priyanka01', 'abcd1234', 'priyanka@gmail.com', '10, Saint street, Adyar', 'Chennai', 'Tamil Nadu'),
('Vinodhini', 'vino95', 'vinoramesh95', 'vino95@gmail.com', '90, Kumaran street, Anna nagar', 'Chennai', 'Tamil Nadu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`Username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

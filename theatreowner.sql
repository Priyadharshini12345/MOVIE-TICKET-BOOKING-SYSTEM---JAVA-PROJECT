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
-- Table structure for table `theatreowner`
--

CREATE TABLE `theatreowner` (
  `name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `theatreowner`
--

INSERT INTO `theatreowner` (`name`, `username`, `Password`) VALUES
('Jayashri P', 'jaya77', 'priya@2001'),
('Mithra S', 'mithra2021', 'mithrasathish22'),
('Priyadharshini P', 'pjp001', 'pri@2001'),
('Premkumar C', 'prem73', 'pjp@2022');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `theatreowner`
--
ALTER TABLE `theatreowner`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

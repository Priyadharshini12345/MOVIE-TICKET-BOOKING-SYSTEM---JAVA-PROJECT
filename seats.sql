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
-- Table structure for table `seats`
--

CREATE TABLE `seats` (
  `SeatNo` varchar(10) NOT NULL,
  `BookingID` varchar(10) NOT NULL,
  `ShowID` varchar(10) NOT NULL,
  `Status` varchar(100) NOT NULL,
  `Row` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seats`
--

INSERT INTO `seats` (`SeatNo`, `BookingID`, `ShowID`, `Status`, `Row`) VALUES
('12A', '7MRY9', 'S1', 'Booked', 'LastRow'),
('12A', '6TNUQ', 'S2', 'Booked', 'LastRow'),
('12A', 'UF15T', 'SP1', 'Booked', 'LastRow'),
('12B', '7MRY9', 'S1', 'Booked', 'LastRow'),
('12B', '6TNUQ', 'S2', 'Booked', 'LastRow'),
('12B', 'UF15T', 'SP1', 'Booked', 'LastRow'),
('12C', '7MRY9', 'S1', 'Booked', 'LastRow'),
('12C', '6TNUQ', 'S2', 'Booked', 'LastRow'),
('12C', 'UF15T', 'SP1', 'Booked', 'LastRow'),
('13A', 'GF8XD', 'S2', 'Booked', 'LastRow'),
('13B', 'GF8XD', 'S2', 'Booked', 'LastRow'),
('13C', 'GF8XD', 'S2', 'Booked', 'LastRow'),
('2A', '0C9ER', 'S1', 'Booked', 'FrontRow'),
('7A', 'M50FM', 'S1', 'Booked', 'MiddleRow'),
('7B', 'M50FM', 'S1', 'Booked', 'MiddleRow'),
('8A', 'XQVY1', 'S1', 'Booked', 'MiddleRow'),
('8B', 'XQVY1', 'S1', 'Booked', 'MiddleRow'),
('9A', 'D1UQX', 'S1', 'Booked', 'MiddleRow'),
('9B', 'D1UQX', 'S1', 'Booked', 'MiddleRow');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `seats`
--
ALTER TABLE `seats`
  ADD UNIQUE KEY `uk_seatno_showid` (`SeatNo`,`ShowID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

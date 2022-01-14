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
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `name` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `cast` varchar(1000) NOT NULL,
  `director` varchar(1000) NOT NULL,
  `producer` varchar(1000) NOT NULL,
  `language` varchar(100) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `teaser` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`name`, `date`, `cast`, `director`, `producer`, `language`, `description`, `teaser`) VALUES
('Enthiran', '2010-09-12', 'Rajinikanth,Ishwarya Rai', 'Shankar', 'Sun Productions', 'Tamil', 'A brilliant scientist creates a humanoid robot to protect mankind, but things go awry when human emotions are programmed and inner turmoil causes the robot to switch sides.', 'https://www.youtube.com/watch?v=PoPv-Ss6YbI'),
('Spiderman', '2002-09-08', 'James Franco', 'Raimi Rai', 'Orion Pictures', 'English', 'Spider-Man is a 2012 American superhero film based on the Marvel Comics character of the same name. Directed by Sam Raimi from a screenplay by David Koepp, it is the first installment in the Spider-Man trilogy, and stars Tobey Maguire as the title character, alongside Willem Dafoe, Kirsten Dunst, James Franco, Cliff Robertson, and Rosemary Harris.', 'https://www.imdb.com/list/ls049852613');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

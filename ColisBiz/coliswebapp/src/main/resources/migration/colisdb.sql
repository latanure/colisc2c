-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 16, 2017 at 05:35 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `colisdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `address_tbl`
--

CREATE TABLE `address_tbl` (
  `PK_ID` int(11) NOT NULL,
  `OBJECT_ADDR_ID` bigint(20) NOT NULL,
  `OBJECT_TYPE` varchar(50) NOT NULL,
  `ADDRESS_TYPE` varchar(50) NOT NULL,
  `ADDR_STREET_1` varchar(250) NOT NULL,
  `ADDR_STREET_2` varchar(250) NOT NULL,
  `ADDR_CITY` varchar(250) NOT NULL,
  `ADDR_STATE` varchar(50) NOT NULL,
  `ADDR_COUNTRY` varchar(50) NOT NULL,
  `ADDR_APT_NUMBER` int(11) NOT NULL,
  `ADDR_PHONE` varchar(50) NOT NULL,
  `ADDR_POSTAL_CODE` varchar(10) NOT NULL,
  `ADDR_FAX` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address_tbl`
--

INSERT INTO `address_tbl` (`PK_ID`, `OBJECT_ADDR_ID`, `OBJECT_TYPE`, `ADDRESS_TYPE`, `ADDR_STREET_1`, `ADDR_STREET_2`, `ADDR_CITY`, `ADDR_STATE`, `ADDR_COUNTRY`, `ADDR_APT_NUMBER`, `ADDR_PHONE`, `ADDR_POSTAL_CODE`, `ADDR_FAX`) VALUES
(41, 0, 'Recipient', 'Residential', '2277 joliette app 305', '', 'Longueuil', 'Qu?bec', 'Canada', 25, '4189993046', 'J4K4Z7', ''),
(42, 0, 'Colis', 'Mall', '405 ste Cath?rine Est', '', 'Montr?al', 'Qu?bec', 'Canada', 269, '5142168375', 'H2L2C4', ''),
(43, 0, 'Colis', 'Home', '4101sheppard Av East app 301', '', 'Toronto', 'Ontario', 'Canada', 123, '6479751078', 'M1S3H3', ''),
(44, 0, 'Recipient', 'Mall', '230 Elizabeth Ave', '', 'St John\'s', 'Terre-Neuve-et-Labrador', 'Canada', 28, '7098648000', 'A1B 3X9', ''),
(45, 0, 'Colis', 'Home', 'Pennsylvanie 19104', '', 'Pennsylvanie', 'Philadelphie', '?tats-Unis', 753, '2403046193', 'None', '');

-- --------------------------------------------------------

--
-- Table structure for table `colis_tbl`
--

CREATE TABLE `colis_tbl` (
  `PK_ID` int(11) NOT NULL,
  `CO_PICTURE_ID` bigint(20) NOT NULL,
  `CO_ADDRESS_ID` bigint(20) NOT NULL,
  `CO_OBJECT` varchar(250) NOT NULL,
  `CO_DESCRIPTION` text NOT NULL,
  `CO_SIZE` smallint(6) NOT NULL,
  `CO_IS_WEIGHT` smallint(6) NOT NULL,
  `CO_IS_RUSH` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Contains all the information about the object to ship';

--
-- Dumping data for table `colis_tbl`
--

INSERT INTO `colis_tbl` (`PK_ID`, `CO_PICTURE_ID`, `CO_ADDRESS_ID`, `CO_OBJECT`, `CO_DESCRIPTION`, `CO_SIZE`, `CO_IS_WEIGHT`, `CO_IS_RUSH`) VALUES
(0, 0, 0, 'CO_OBJECT', 'CO_DESCRIPTION', 0, 0, 0),
(10, 0, 0, 'Lettre', '10 x 24 cm', 0, 10, 1),
(11, 0, 0, 'Ordinateur', '17 pouces', 0, 2, 0),
(12, 0, 0, 'Guitare', 'Accoustique couleur Or cuivre', 0, 4, 1),
(13, 0, 0, 'Canape sectionnel', 'Brun ', 0, 75, 0),
(14, 0, 0, 'Velo', 'pour adulte bleu', 0, 12, 1),
(15, 0, 0, 'Oeuvre d\'art', 'Tabeau peint (image d\'une pomme)', 0, 3, 0);

-- --------------------------------------------------------

--
-- Table structure for table `payment_tbl`
--

CREATE TABLE `payment_tbl` (
  `PK_ID` int(11) NOT NULL,
  `USERID` int(11) NOT NULL,
  `PAYMENT_DATE` datetime NOT NULL,
  `RECEIVED_DATE` datetime NOT NULL,
  `PAYMENT_NUMBER` bigint(20) NOT NULL,
  `PAID_BY` varchar(50) NOT NULL,
  `PAID_TO` varchar(50) NOT NULL,
  `PAID_AMONT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `posts_transactions_tbl`
--

CREATE TABLE `posts_transactions_tbl` (
  `PK_ID` int(11) NOT NULL,
  `COLISID` int(11) NOT NULL,
  `PAYMENT_ID` int(11) NOT NULL,
  `TRIP_ID` int(11) NOT NULL,
  `OWNERID` int(11) NOT NULL,
  `POST_DUE_DATE` date NOT NULL,
  `POST_DUE_TIME` time NOT NULL,
  `IS_POST_EXPIRED` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `post_details_tbl`
--

CREATE TABLE `post_details_tbl` (
  `PK_ID` int(11) NOT NULL,
  `PARENT_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `recipient_tbl`
--

CREATE TABLE `recipient_tbl` (
  `PK_ID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roles_tbl`
--

CREATE TABLE `roles_tbl` (
  `PK_ID` int(11) NOT NULL,
  `ROLE_CAT_ID` bigint(20) NOT NULL,
  `ROLE_NAME` varchar(50) NOT NULL,
  `ROLE_CREATED_DATE` datetime NOT NULL,
  `ROLE_TYPE` varchar(50) NOT NULL,
  `ROLE_CODE` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(45) NOT NULL,
  `student_age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `student_name`, `student_age`) VALUES
(1, 'Alice', 22),
(2, 'Bob', 25),
(3, 'Charlie', 25);

-- --------------------------------------------------------

--
-- Table structure for table `trip_details_tbl`
--

CREATE TABLE `trip_details_tbl` (
  `PK_ID` int(11) NOT NULL,
  `PARENT_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `trip_tbl`
--

CREATE TABLE `trip_tbl` (
  `PK_ID` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `trip_from` varchar(250) NOT NULL,
  `trip_to` varchar(250) NOT NULL,
  `trip_stop_1` varchar(250) NOT NULL,
  `trip_stop_2` varchar(250) NOT NULL,
  `trip_stop_3` varchar(250) NOT NULL,
  `trip_stop_4` varchar(250) NOT NULL,
  `trip_stop_5` varchar(250) NOT NULL,
  `trip_frequency` varchar(50) NOT NULL,
  `trip_container_size` varchar(50) NOT NULL,
  `trip_effective_date` date NOT NULL,
  `trip_expiration_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Holds the departing and destination cities';

--
-- Dumping data for table `trip_tbl`
--

INSERT INTO `trip_tbl` (`PK_ID`, `USER_ID`, `trip_from`, `trip_to`, `trip_stop_1`, `trip_stop_2`, `trip_stop_3`, `trip_stop_4`, `trip_stop_5`, `trip_frequency`, `trip_container_size`, `trip_effective_date`, `trip_expiration_date`) VALUES
(20, 0, 'Longueuil', 'Qu?bec', '', '', '', '', '', 'Hebdomadairement', 'Valise 10kg', '0000-00-00', '0000-00-00'),
(21, 0, 'Sherbrooke', 'toronto', 'Ottawa', '', '', '', '', '2fois/semaine', 'Petite voiture', '0000-00-00', '0000-00-00'),
(22, 0, 'Montr?al', 'Douala', 'France', '', '', '', '', 'Annuellement', 'Bagage d\'avion', '0000-00-00', '2043-01-05'),
(23, 0, 'Toronto', 'Calgary', 'Winnipeg', 'Edmonston', '', '', '', 'Mensuellement', 'Camionnette', '0000-00-00', '0000-00-00'),
(24, 0, 'St Jones', 'Montr?al', 'Edmunston', 'Rimouski', 'Qu?bec', '', '', '1 fois', 'Coffre de Jeep', '0000-00-00', '0000-00-00'),
(25, 0, 'Pennsylvanie', 'Charlevoix', 'Montr?al', '', '', '', '', '1fois', 'voiture 4x4', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `userreviews_tbl`
--

CREATE TABLE `userreviews_tbl` (
  `PK_ID` int(11) NOT NULL,
  `Parent_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users_tbl`
--

CREATE TABLE `users_tbl` (
  `PK_ID` int(11) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(16) NOT NULL,
  `ext` varchar(4) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `status` varchar(1) NOT NULL,
  `profile` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_tbl`
--

INSERT INTO `users_tbl` (`PK_ID`, `fname`, `lname`, `email`, `phone`, `ext`, `mobile`, `status`, `profile`) VALUES
(100, 'Mary', 'Tambo', 'fresneltano@gmail', '12345687', '237', '258794521', 'A', 'ADMIN_ROLE'),
(101, 'Mary', 'Bomba', 'fresneltano@gmail', '12345687', '237', '258794521', 'A', 'ADMIN_ROLE'),
(102, 'Mary', 'Tchoumi', 'fresneltano@gmail', '12345687', '237', '258794521', 'A', 'ADMIN_ROLE');

-- --------------------------------------------------------

--
-- Table structure for table `user_security`
--

CREATE TABLE `user_security` (
  `PK_ID` bigint(20) NOT NULL,
  `USER_ID` bigint(20) NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(250) NOT NULL,
  `PASS_PHRASE` varchar(250) NOT NULL,
  `LAST_PASSWORD_CHANGED` varchar(250) NOT NULL,
  `PASS_EXPIRY_DATE` date NOT NULL,
  `DEFAULT_ADDRESS_ID` bigint(20) NOT NULL,
  `IS_PASSWORD_NEED_RESET` tinyint(1) NOT NULL,
  `ROLE` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address_tbl`
--
ALTER TABLE `address_tbl`
  ADD PRIMARY KEY (`PK_ID`);

--
-- Indexes for table `colis_tbl`
--
ALTER TABLE `colis_tbl`
  ADD PRIMARY KEY (`PK_ID`);

--
-- Indexes for table `payment_tbl`
--
ALTER TABLE `payment_tbl`
  ADD PRIMARY KEY (`PK_ID`),
  ADD UNIQUE KEY `user_id_idx` (`USERID`);

--
-- Indexes for table `posts_transactions_tbl`
--
ALTER TABLE `posts_transactions_tbl`
  ADD PRIMARY KEY (`PK_ID`),
  ADD UNIQUE KEY `colisid_idx` (`COLISID`),
  ADD UNIQUE KEY `payment_id_idx` (`PAYMENT_ID`),
  ADD UNIQUE KEY `user_id_idx` (`OWNERID`);

--
-- Indexes for table `post_details_tbl`
--
ALTER TABLE `post_details_tbl`
  ADD PRIMARY KEY (`PK_ID`),
  ADD UNIQUE KEY `parent_id_idx` (`PARENT_ID`);

--
-- Indexes for table `recipient_tbl`
--
ALTER TABLE `recipient_tbl`
  ADD PRIMARY KEY (`PK_ID`);

--
-- Indexes for table `roles_tbl`
--
ALTER TABLE `roles_tbl`
  ADD PRIMARY KEY (`PK_ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `trip_details_tbl`
--
ALTER TABLE `trip_details_tbl`
  ADD PRIMARY KEY (`PK_ID`),
  ADD UNIQUE KEY `parent_id_idx` (`PARENT_ID`);

--
-- Indexes for table `trip_tbl`
--
ALTER TABLE `trip_tbl`
  ADD PRIMARY KEY (`PK_ID`);

--
-- Indexes for table `userreviews_tbl`
--
ALTER TABLE `userreviews_tbl`
  ADD PRIMARY KEY (`PK_ID`),
  ADD UNIQUE KEY `parent_id_idx` (`Parent_id`);

--
-- Indexes for table `users_tbl`
--
ALTER TABLE `users_tbl`
  ADD PRIMARY KEY (`PK_ID`);

--
-- Indexes for table `user_security`
--
ALTER TABLE `user_security`
  ADD PRIMARY KEY (`PK_ID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `posts_transactions_tbl`
--
ALTER TABLE `posts_transactions_tbl`
  ADD CONSTRAINT `posts_transactions_tbl_ibfk_1` FOREIGN KEY (`colisID`) REFERENCES `colis_tbl` (`PK_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

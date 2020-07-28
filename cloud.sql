-- MySQL dump 10.13  Distrib 5.7.30, for Linux (x86_64)
--
-- Host: localhost    Database: cloud
-- ------------------------------------------------------
-- Server version	5.7.30-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`),
  CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `registration` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('ashwini003','12345'),('samar001','12345'),('sanu001','123456789'),('sid002','123456'),('sonu001','12345');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `card_no` varchar(50) DEFAULT NULL,
  `month_year` varchar(30) DEFAULT NULL,
  `cvv` varchar(5) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  KEY `fk_username_payment` (`username`),
  CONSTRAINT `fk_username_payment` FOREIGN KEY (`username`) REFERENCES `register_service` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES ('2125454756321024','09/35','447','sanu001'),('2154874984464646','06/28','227','sid002'),('4546323485158485','08/26','287','ashwini003'),('4646549841615484','08/29','652','sonu001');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register_service`
--

DROP TABLE IF EXISTS `register_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `register_service` (
  `username` varchar(50) NOT NULL,
  `date_of_registration` date NOT NULL,
  `phone_number` varchar(30) NOT NULL,
  `services` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL,
  `Duration` varchar(30) NOT NULL,
  PRIMARY KEY (`username`,`date_of_registration`,`services`),
  CONSTRAINT `fk_username_register_service` FOREIGN KEY (`username`) REFERENCES `registration` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register_service`
--

LOCK TABLES `register_service` WRITE;
/*!40000 ALTER TABLE `register_service` DISABLE KEYS */;
INSERT INTO `register_service` VALUES ('ashwini003','2019-08-19','9877251654','Saas','8000','three month'),('sanu001','2017-12-17','8697556475','Saas','8547','two month'),('sid002','2019-06-15','9887412551','Paas','8999','five month'),('sonu001','2019-05-18','9845121845','Saas','8999','five month');
/*!40000 ALTER TABLE `register_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registration` (
  `username` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `email_id` varchar(80) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES ('ashwini003','Ashwini Kumar',25,'Bihar','Transgender','ashwini003@gmail.com','12345'),('samar001','Samar',23,'ranchi','Male','sam@gmail.com','12345'),('sanu001','sanu',21,'patna','Male','sanu@gmail.com','123456789'),('sid002','Siddharth',23,'bangalore','Male','sidd@gmail.com','123456'),('sonu001','Sonu Kumar',25,'bangalore','Male','sonu@gmail.com','12345');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-05 16:34:10

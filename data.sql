--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `christianname` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `addressform` varchar(10) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `postcode` varchar(20) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
INSERT INTO `address` VALUES (1,'Müller','Martin','m.m@mueller.de','Herr','08947/453451','0172/44432424','Kaiserstrasse',52,'Kuhdorf','56832','Deutschland','2003-08-14'),(2,'Maier','Karl','karl.maier@web.de','Herr','0721/53535','0165/1234556','Karlstrasse',130,'Karlsruhe','76133','Deutschland','1965-09-23'),(14,'Balfanz','Annika','annika.balfanz@gmx.de','Frau','08356/25763','0176/3465735','Unterer Weg',12,'Musterstadt','12345','Deutschland','1982-10-08'),(20,'Bauer','Markus','markus.bauer@gmx.de','Herr','0721/6538151','0160/34324555','Markstrasse',13,'Karlsruhe','76149','Deutschland','1999-06-01'),(21,'Sommer','Karin','katrin.sommer@web.de','Frau','0685/345678','0179/324414','Heustrasse',34,'Monddorf','68945','Deutchland','2001-12-03');
UNLOCK TABLES;

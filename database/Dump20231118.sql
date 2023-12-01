CREATE DATABASE  IF NOT EXISTS `supermarket` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `supermarket`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: supermarket
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `CustID` varchar(6) NOT NULL,
  `CustTitle` varchar(5) DEFAULT NULL,
  `CustName` varchar(30) NOT NULL,
  `DOB` date DEFAULT NULL,
  `salary` decimal(10,2) NOT NULL,
  `CustAddress` varchar(30) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `Province` varchar(20) DEFAULT NULL,
  `PostalCode` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`CustID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('','','','1997-06-08',5677.00,'','','',''),('C001','Mr','Danapala','1981-02-06',40000.00,'No.20 Walana','Panadura','Western','12500'),('C002','Mr','Gunapala','1982-08-12',40000.00,'No 200, Thalpitiya','Wadduwa','Western','12500'),('C003','Mr','Amarapala','1988-01-02',34000.00,'No 100, Horawala','Matugama','Western','13400'),('C004','Mr','Somapala','1952-01-02',67000.00,'No .10, Ginigama','Galle','Southern','12213'),('C005','Mr','Jinapala','1974-01-08',32000.00,'N0. 34 Ginthota','Aluthgama','Southern','24333'),('C006','Miss','Gnanawathee','1982-01-03',78000.00,'No. 230, Galle Road','Panadura','Western','12500'),('C007','Miss','Amarawathee','1984-05-07',98000.00,'No, Galle Road','Ambalangoda','Southern','43343'),('C008','Ms','Leelawathee','1950-04-08',57000.00,'No 12, Rathnapura Road','Madampe','Sabaragamuwa','32312'),('C009','Ms','Gunawathee','1972-03-09',76000.00,'No122, Anuradhapura Road','Kurunegala','Wayamba','23233'),('C010','Mr','Dayapala','1983-04-09',40000.00,'No. 234, Attidiya Road','Dehiwala','Western','23434'),('C011','Mr','Sangapala','1990-05-09',76000.00,'No. 43, St Peters Road','Negambo','Western','32313'),('C012','Miss','Ariyawathee','1987-08-09',59000.00,'No. 123, Pamunuwa Road','Maharagama','Western','23123'),('C013','Miss','Somawathee','1987-05-03',67000.00,'No. 345, Matugama Road','Kalutara','Western','23233'),('C014','Mr','Somapala','1981-08-09',38000.00,'No. Ragala Road','Walapane','Central','44332'),('C015','Mr','Ariyapala','1986-08-09',76000.00,'No. Kandy Road','Thrincomalee','Eastern','77867'),('C016','Miss','Siriyalatha','1992-02-05',40000.00,'No. Nawala Road','Nugegoda','Western','122323'),('C017','Miss','Premalatha','1980-01-31',76000.00,'No. Maradan kadawala Road','Thrincomalee','Eastern','24545'),('C018','Ms','Chandralatha','1930-12-31',58000.00,'No. New moor Street','Colombo','Western','45656'),('C019','Ms','Karunawathee','1964-01-23',97000.00,'No. Baddegama Road','Galle','Southern','45455'),('C020','Mr','Arunachalam','1983-03-04',58000.00,'No. Diggala Road','Keselwatta','Western','45545'),('C021','Mr','Jinadasa','1980-03-04',65000.00,'No. Kandy Road','Jaffna','Northern','44432'),('C022','Mr','Amaradasa','1993-05-01',40000.00,'No. Katugastota Road','Kandy','Central','23321'),('C023','Mr','Somadasa','1994-01-01',30000.00,'No. Aranayaka Road','Mawenella','Central','78979'),('C024','Ms','Gunalatha','1985-05-06',74000.00,'No. Yatinuwara Sreet','Kandy','Central','78787'),('C025','Ms','Premalatha','1969-03-03',72000.00,'No. Dambulla Road','Anuradhapura','North Western','23430'),('C026','Miss','Gnanalatha','1979-10-15',58000.00,'No. 23, Dankotuwa Road','Nathathandiya','Wayamba','21212'),('C027','Mr','Jayarathne','1978-03-04',40000.00,'N0.340, Arrawala Road','Pannipitiya','Western','12122'),('C028','Mr','Jinasena','1991-03-04',60000.00,'No.40, Dias place','Panadura','Western','12500'),('C029','Mr','Jinadasa','1948-04-03',56000.00,'No.124, Jaffna Road','Rambawa','North Western','34400'),('C030','Mr','Jinasoma','1934-07-08',89000.00,'No.34, Kandy Road','Matale','Central','12333'),('C031','Mr','Amarasena','1981-05-14',58500.00,'No. Kandy Road','Polonaruwa','Eastern','44432'),('C032','Mr','Jinasoma','1988-03-14',67000.00,'No. Kandy Road','Matugama','Western','12333'),('C039','Mr','Nimal','1989-10-15',100000.00,'Panadura','Panaduara','Western','100003'),('c040','Mr','Hiran','1997-05-12',99000.00,'Balumahaara,Gampaha','Gampaha','Western','11066'),('C041','Mr','Sasi','1997-12-12',120000.00,'negobo','gampaha','western','1200'),('C042','Mr','Henarath','1997-05-18',120000.00,'Wliweriya,Gampaha','Gampaha','Western','1064'),('C043','Mr','Senarat','1997-05-19',120000.00,'Wliweriya,Gampaha','Gampaha','Western','10069'),('C044','Mr','sasithaa','1999-05-23',90000.00,'Balummahara.Nedungamuwa','Gampaha','Western','11069'),('C045','Mr','Nipuna','1996-09-23',89000.00,'Miriswatta,Negombo','Negombo','Western','12066'),('C046','Ms','Dilshani','1996-02-28',85000.00,'Delgoda,Gampaha','Gampaha','Western','11022'),('C047','MS','Prasadi','1996-09-30',98765.00,'Weliweriya,Gampaha','Gampaha','Western','12006'),('C048','Mr','Hansaka','0200-12-31',120120.00,'Rathupaswala,Gampaha','Gampha','Western','1023');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `ItemCode` varchar(6) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `PackSize` varchar(20) DEFAULT NULL,
  `UnitPrice` decimal(6,2) NOT NULL,
  `QtyOnHand` int NOT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES ('P001','Keerisamba Retail','1kg',105.00,3000),('P002','Keerisamba 5Kg ','5kg',525.00,200),('P003','Keerisamba 10Kg','10kg',995.00,36),('P004','Keerisamba 50Kg','50kg',4100.00,36),('P005','Red Raw Rice','1kg',60.00,6000),('P006','Red Raw Rice 10Kg Pack','10kg',560.00,300),('P007','Red Raw Rice 50Kg Pack','50kg',5230.00,80),('P008','White Raw Rice 5Kg Pack','5kg',275.00,130),('P009','White Raw Rice 50Kg Pack','50kg',2600.00,13),('P010','Wattana Dhal 500g','500kg',90.00,83),('P011','Wattana Dhal 1Kg','1kg',170.00,40),('P012','Mysoor Dhal 500g','500g',90.00,89),('P013','Mysoor Dhal 1Kg','1Kg',180.00,59),('P014','Orient Green Gram 500g','500g',118.00,39),('P015','Orient Green Gram 1Kg','1kg',220.00,12),('P016','Anchor F/C Milk powder 450g','450g',220.00,93),('P017','Anchor F/C Milk powder 1Kg','1Kg',580.00,40),('P018','Anchor N/F Milk powder 1Kg','1Kg',560.00,33),('P019','Milo Packet 400g','400g',240.00,33),('P020','Lipton Ceylon Tea 100g','100g',107.00,40),('P021','Lipton Ceylon Tea 200g','200g',198.00,40),('P022','Lipton Ceylon Tea 400g','400g',360.00,20),('P023','White Suger 500g','500g',55.00,45),('P024','White Suger 1Kg','1kg',109.00,25),('P025','Astra Margarine 250g','250g',129.00,25),('P026','Astra Margarine 500g','500g',229.00,15),('P027','Rice Noodle 200g','200g',65.00,25),('P028','Rice Noodle 500g','500g',140.00,35),('P029','Red Rice Noodle 500g','500g',150.00,35),('P030','Coka Cola 1.5L','1.5L',160.00,30),('P031','Coka Cola 500ml','500ml',60.00,30),('P032','Pepsi 500ml','500ml',55.00,30),('P033','Pepsi 1.5L','1.5L',160.00,30),('P034','Sprite 500ml','500ml',55.00,30),('P035','Sprite 1.5L','1.5L',160.00,30),('P036','Tomato Sauce Bottle','860g',340.00,30),('P037','Chillie Sauce Bottle','860g',320.00,30),('P038','Raw Chillie 100g','100g',40.00,30),('P039','Raw Chillie 250g','250g',95.00,30),('P040','Raw Chillie 500g','500g',180.00,30),('P041','Goraka 100g','100g',25.00,30),('P042','Sinnamon Stick 100g','100g',25.00,30),('P043','Anchor 400g','400g',425.00,90),('P044','Viva','400g',1000.00,100);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetail` (
  `OrderID` varchar(6) NOT NULL,
  `ItemCode` varchar(6) NOT NULL,
  `OrderQTY` int NOT NULL,
  `Discount` int DEFAULT NULL,
  PRIMARY KEY (`OrderID`,`ItemCode`),
  KEY `ItemCode` (`ItemCode`),
  CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `orders` (`OrderID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`ItemCode`) REFERENCES `item` (`ItemCode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
INSERT INTO `orderdetail` VALUES ('D001','P001',3,0),('D001','P002',5,0),('D001','P003',8,0),('D001','P006',10,0),('D002','P002',4,0),('D002','P003',4,0),('D002','P008',3,0),('D002','P010',12,0),('D002','P012',3,0),('D003','P001',9,0),('D003','P004',6,0),('D003','P016',70,0),('D004','P002',12,0),('D004','P005',7,0),('D004','P008',10,0),('D004','P013',9,0),('D004','P015',5,0),('D004','P016',8,0),('D004','P020',5,0),('D004','P021',2,0),('D004','P022',3,0),('D004','P024',4,0),('D005','P001',6,0),('D005','P003',8,0),('D005','P007',90,0),('D006','P003',9,0),('D006','P020',8,0),('D007','P020',10,0),('D008','P001',3,0),('D009','P002',2,0),('D009','P003',2,0),('D009','P005',2,0),('D009','P007',9,0),('D009','P008',2,0),('D009','P010',9,0),('D009','P023',5,0),('D010','P010',6,0),('D010','P012',3,0),('D010','P014',6,0),('D010','P015',6,0),('D010','P016',5,0),('D010','P040',3,0),('D010','P041',2,0),('D012','P001',2,0),('D012','P003',4,0),('D013','P005',4,0),('D013','P009',8,0),('D014','P006',9,0),('D014','P009',4,0),('D014','P019',3,0),('D014','P020',7,0),('D014','P021',3,0),('D014','P025',6,0),('D015','P021',8,0),('D015','P022',3,0),('D015','P027',4,0),('D015','P029',5,0),('D015','P032',41,0),('D015','P034',5,0),('D015','P036',6,0),('D015','P038',4,0),('D016','P001',3,0),('D016','P003',10,0),('D016','P007',3,0),('D016','P009',19,0),('D016','P011',7,0),('D017','P001',12,0),('D017','P004',4,0),('D017','P007',7,0),('D017','P009',5,0),('D017','P010',5,0),('D017','P012',4,0),('D017','P019',4,0),('D018','P001',4,0),('D018','P003',4,0),('D018','P005',3,0),('D018','P010',3,0),('D018','P026',9,0),('D019','P009',2,0),('D019','P010',3,0),('D019','P018',1,0),('D019','P019',8,0),('D019','P031',3,0),('D020','P001',12,0),('D020','P004',9,0),('D020','P006',12,0),('D020','P019',12,0),('D021','P001',12,0),('D021','P003',4,0),('D021','P012',2,0),('D021','P041',10,0),('D022','P003',5,0),('D022','P012',2,0),('D022','P028',7,0),('D022','P031',3,0),('D022','P032',3,0),('D022','P034',5,0),('D022','P041',7,0),('D023','P001',1,0),('D023','P002',3,0),('D023','P006',8,0),('D023','P009',3,0),('D023','P012',3,0),('D023','P014',4,0),('D023','P019',3,0),('D023','P022',4,0),('D023','P023',3,0),('D023','P036',45,0),('D024','P006',4,0),('D024','P011',3,0),('D024','P012',2,0),('D024','P023',3,0),('D024','P029',3,0),('D024','P031',3,0),('D024','P034',3,0),('D024','P036',4,0),('D024','P037',5,0),('D024','P042',23,0),('D025','P001',12,0),('D025','P002',23,0),('D025','P003',34,0),('D025','P010',2,0),('D025','P014',4,0),('D026','P003',2,0),('D026','P004',4,0),('D026','P006',34,0),('D026','P007',34,0),('D026','P009',3,0),('D026','P015',5,0),('D026','P019',4,0),('D027','P002',9,0),('D027','P018',1,0),('D027','P019',9,0),('D027','P021',3,0),('D027','P023',3,0),('D027','P024',4,0),('D027','P027',9,0),('D027','P028',3,0),('D027','P031',23,0),('D028','P002',23,0),('D028','P004',3,0),('D028','P006',9,0),('D028','P009',4,0),('D028','P012',2,0),('D028','P025',4,0),('D028','P034',4,0),('D028','P036',5,0),('D029','P004',4,0),('D029','P012',34,0),('D029','P013',3,0),('D029','P019',2,0),('D030','P001',12,0),('D030','P003',3,0),('D030','P005',5,0),('D030','P006',6,0),('D030','P007',7,0),('D030','P008',8,0),('D030','P009',9,0),('D031','P003',3,0),('D031','P004',5,0),('D031','P006',6,0),('D031','P010',10,0),('D031','P013',2,0),('D031','P015',4,0),('D031','P017',45,0),('D032','P002',4,0),('D032','P005',5,0),('D032','P023',3,0),('D032','P031',3,0),('D032','P034',4,0),('D032','P035',5,0),('D032','P039',4,0),('D032','P040',4,0),('D032','P041',3,0),('D033','P017',6,0),('D033','P021',2,0),('D033','P024',4,0),('D033','P026',6,0),('D033','P029',8,0),('D033','P032',3,0),('D033','P035',5,0),('D033','P036',5,0),('D033','P039',5,0),('D034','P001',9,0),('D034','P003',3,0),('D034','P005',5,0),('D034','P008',4,0),('D034','P009',9,0),('D034','P012',7,0),('D034','P017',5,0),('D034','P018',9,0),('D034','P021',7,0),('D034','P024',4,0),('D034','P027',8,0),('D035','P011',35,0),('D035','P014',2,0),('D035','P015',4,0),('D035','P016',5,0),('D035','P017',6,0),('D035','P018',6,0),('D035','P020',6,0),('D036','P014',6,0),('D036','P022',6,0),('D036','P023',10,0),('D036','P026',9,0),('D036','P027',2,0),('D036','P028',6,0),('D037','P028',2,0),('D037','P030',6,0),('D037','P039',12,0),('D037','P042',5,0),('D038','P012',9,0),('D038','P013',6,0),('D038','P028',7,0),('D038','P034',6,0),('D039','P002',2,0),('D039','P006',8,0),('D039','P017',12,0),('D039','P019',7,0),('D039','P023',6,0),('D039','P034',3,0),('D040','P002',6,0),('D040','P011',8,0),('D040','P012',9,0),('D040','P013',3,0),('D040','P014',2,0),('D040','P015',1,0),('D040','P016',2,0),('D040','P022',4,0),('D041','P011',7,0),('D041','P031',6,0),('D041','P032',5,0),('D042','P002',9,0),('D042','P003',3,0),('D042','P004',3,0),('D042','P011',8,0),('D043','P001',2,0),('D043','P002',4,0),('D043','P004',3,0),('D043','P005',1,0),('D043','P009',5,0),('D044','P012',6,0),('D044','P013',7,0),('D044','P014',8,0),('D045','P021',9,0),('D045','P022',6,0),('D045','P023',5,0),('D045','P024',4,0),('D045','P025',3,0),('D045','P026',3,0),('D046','P011',2,0),('D046','P012',2,0),('D046','P013',1,0),('D046','P014',7,0),('D046','P015',6,0),('D046','P016',8,0),('D046','P017',7,0),('D046','P018',6,0),('D046','P019',5,0),('D047','P023',4,0),('D047','P024',3,0),('D047','P025',4,0),('D047','P026',5,0),('D048','P024',3,0),('D048','P025',3,0),('D048','P026',7,0),('D048','P027',9,0),('D048','P028',8,0),('D049','P016',5,0),('D049','P017',7,0),('D049','P018',5,0),('D050','P013',8,0),('D050','P014',2,0),('D050','P015',2,0),('D050','P016',3,0),('D061','p043',20,0),('D063','p043',10,0),('D066','P044',20,0);
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail_v3`
--

DROP TABLE IF EXISTS `orderdetail_v3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetail_v3` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Discount` double DEFAULT NULL,
  `OrderQTY` int NOT NULL,
  `ItemCode` varchar(6) NOT NULL,
  `OrderID` varchar(6) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKt2suvqq58reje6lvitwitgvwy` (`ItemCode`),
  KEY `FKbnkuu7hhtjkksqv7atu4r108c` (`OrderID`),
  CONSTRAINT `FKbnkuu7hhtjkksqv7atu4r108c` FOREIGN KEY (`OrderID`) REFERENCES `orders` (`OrderID`),
  CONSTRAINT `FKt2suvqq58reje6lvitwitgvwy` FOREIGN KEY (`ItemCode`) REFERENCES `item` (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail_v3`
--

LOCK TABLES `orderdetail_v3` WRITE;
/*!40000 ALTER TABLE `orderdetail_v3` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetail_v3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `OrderID` varchar(6) NOT NULL,
  `OrderDate` date DEFAULT NULL,
  `CustID` varchar(6) NOT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `CustID` (`CustID`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`CustID`) REFERENCES `customer` (`CustID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES ('D001','2008-02-05','C001'),('D002','2008-02-15','C001'),('D003','2008-02-20','C001'),('D004','2008-02-28','C001'),('D005','2008-03-20','C001'),('D006','2008-04-10','C001'),('D007','2008-05-10','C001'),('D008','2008-06-20','C001'),('D009','2008-08-12','C001'),('D010','2008-09-20','C001'),('D011','2008-02-06','C002'),('D012','2008-02-16','C002'),('D013','2008-02-20','C002'),('D014','2008-03-16','C002'),('D015','2008-04-15','C002'),('D016','2008-08-26','C002'),('D017','2008-02-16','C003'),('D018','2008-03-26','C003'),('D019','2008-06-11','C003'),('D020','2008-09-26','C003'),('D021','2008-11-26','C003'),('D022','2008-01-11','C004'),('D023','2008-07-21','C004'),('D024','2008-09-11','C004'),('D025','2008-11-11','C005'),('D026','2008-12-14','C005'),('D027','2008-12-28','C005'),('D028','2008-11-29','C005'),('D029','2008-11-30','C005'),('D030','2008-01-11','C006'),('D031','2008-02-23','C006'),('D032','2008-02-27','C006'),('D033','2008-02-28','C006'),('D034','2008-03-23','C006'),('D035','2008-04-17','C006'),('D036','2008-05-05','C006'),('D037','2008-08-27','C006'),('D038','2008-10-27','C006'),('D039','2008-12-22','C006'),('D040','2008-12-29','C006'),('D041','2008-02-21','C007'),('D042','2008-03-22','C007'),('D043','2008-04-11','C007'),('D044','2008-05-12','C007'),('D045','2008-06-13','C008'),('D046','2008-07-13','C008'),('D047','2008-07-11','C008'),('D048','2008-07-30','C009'),('D049','2008-07-11','C009'),('D050','2008-08-12','C009'),('D051','2008-08-13','C009'),('D052','2008-08-13','C009'),('D053','2008-08-27','C010'),('D054','2008-09-12','C010'),('D055','2008-09-22','C010'),('D056','2008-09-23','C010'),('D057','2008-09-24','C010'),('D058','2008-09-25','C010'),('D059','2008-09-23','C011'),('D060','2008-10-07','C012'),('D061','2023-08-16','c024'),('D063','2023-08-19','c016'),('D066','2023-08-23','C013');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-18 13:01:37

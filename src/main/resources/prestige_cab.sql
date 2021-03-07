
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";



DROP TABLE IF EXISTS `categories`;
CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;


INSERT INTO `categories` (`id`, `name`) VALUES
(1, '4x4 suv'),
(2, 'berline'),
(3, 'citadine'),
(4, 'monospace'),
(5, 'sport'),
(6, 'utilitaire');


DROP TABLE IF EXISTS `vehicules`;
CREATE TABLE IF NOT EXISTS `vehicules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(1000) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `price` int(11) NOT NULL,
  `image_1` varchar(250) NOT NULL,
  `image_2` varchar(250) NOT NULL,
  `image_3` varchar(250) NOT NULL,
  `category` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `category` (`category`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;


INSERT INTO `vehicules` (`id`, `name`, `description`, `price`, `image_1`, `image_2`, `image_3`, `category`) VALUES
(1, 'Fiche technique Mercedes Classe GLS GLS 400d 4Matic 9G-Tronic Executive (Tout-Terrain)', 'Tout-Terrain - 4roues permanent - Diesel - \r\nBoîte automatique, 9 vitesses - 0 cv - 330 ch / 243 kW \r\nConsommation mixte: 7,5 L/100 km \r\nAutonomie moyenne: 1 200 km \r\nDimensions (L x l x h): 5,207 m x 1,999 m x 1,823 m\r\n\r\n110 000 km', 67000, 'gle-1.jpg', 'gle-2.jpg', 'gle-3.jpg', 1),
(2, 'Fiche technique Peugeot 5008 1.6i THP 165 EAT6 Crossway (Tout-Terrain)', 'Tout-Terrain - Traction avant - Essence - \r\nBoîte automatique, 6 vitesses - 9 cv - 165 ch / 121 kW \r\nConsommation mixte: 6,1 L/100 km \r\nAutonomie moyenne: 918 km \r\nDimensions (L x l x h): 4,641 m x 1,844 m x 1,640 m\r\n\r\n2017\r\n\r\n80 000 km', 34000, '5008-1.jpg', '5008-2.jpg', '5008-3.jpg', 1),
(3, 'Fiche technique Porsche Macan Turbo 3.0 440 ch BVA PDK (Tout-Terrain)', 'Tout-Terrain - Transmission intégrale débrayable - Essence - \r\nBoîte séquentielle, 7 vitesses - 33 cv - 440 ch / 324 kW \r\nConsommation mixte: 9,8 L/100 km \r\nAutonomie moyenne: 765 km \r\nDimensions (L x l x h): 4,684 m x 1,926 m x 1,624 m\r\n\r\n2018\r\n\r\n140 000 km', 50000, 'macan-1.jpg', 'macan-2.jpg', 'macan-3.jpg', 1),
(4, 'Fiche technique Audi A4 Allroad Quattro 40 TDI 190 Quattro S-Tronic 7 Avus (Break)', 'Break - 4roues permanent - Diesel - \r\nBoîte automatique, 7 vitesses - 10 cv - 190 ch / 140 kW \r\nConsommation mixte: 5,2 L/100 km \r\nAutonomie moyenne: 1 115 km \r\nDimensions (L x l x h): 4,762 m x 1,847 m x 1,493 m\r\n\r\n2015\r\n\r\n120 000 km', 20000, 'a4-1.jpg', 'a4-2.jpg', 'a4-3.jpg', 2),
(5, 'Fiche technique BMW Série 3 320d 163ch EfficientDynamics Edition BVA8 Business Design (4p.)', 'Berline - Propulsion arrière - Diesel - \r\nBoîte automatique, 8 vitesses - 9 cv - 163 ch / 120 kW \r\nConsommation mixte: 4,3 L/100 km \r\nAutonomie moyenne: 1 326 km \r\nDimensions (L x l x h): 4,633 m x 0,000 m x 1,429 m\r\n\r\n2017\r\n\r\n140 000 km', 45000, 's3-1.jpg', 's3-2.jpg', 's3-3.jpg', 2),
(6, 'Fiche technique Mercedes Classe C C 180 d 122ch AMG Line (4p.)', 'Berline - Propulsion arrière - Diesel - \r\nBoîte manuelle, 6 vitesses - 7 cv - 122 ch / 90 kW \r\nConsommation mixte: 4,2 L/100 km \r\nAutonomie moyenne: 1 571 km \r\nDimensions (L x l x h): 4,686 m x 1,832 m x 1,445 m\r\n\r\n2018\r\n\r\n50 000 km', 40000, 'c-1.jpg', 'c-2.jpg', 'c-3.jpg', 2),
(7, 'Fiche technique Peugeot 208 1.2i 12V 100 PureTech BVM6 Active (5p.)', 'Citadine - Traction avant - Essence - \r\nBoîte manuelle, 6 vitesses - 5 cv - 100 ch / 74 kW \r\nConsommation mixte: 4,2 L/100 km \r\nAutonomie moyenne: 1 048 km \r\nDimensions (L x l x h): 4,055 m x 1,745 m x 1,430 m\r\n\r\n2020\r\n\r\n30 000 km', 20000, '208-1.jpg', '208-2.jpg', '208-3.jpg', 3),
(8, 'Fiche technique Renault Clio 1.0i 12V TCe 100 Business (5p.)', 'Citadine - Traction avant - Essence - \r\nBoîte manuelle, 5 vitesses - 5 cv - 100 ch / 74 kW \r\nConsommation mixte: 4,4 L/100 km \r\nAutonomie moyenne: 955 km \r\nDimensions (L x l x h): 4,050 m x 1,798 m x 1,440 m\r\n\r\n2019\r\n\r\n15 000 km', 25000, 'clio-1.jpg', 'clio-2.jpg', 'clio-3.jpg', 3),
(9, 'Fiche technique Volkswagen Polo 1.2 TSI 90 BlueMotion Technology DSG7 (5p.)', 'Citadine - Traction avant - Essence - \r\nBoîte séquentielle, 7 vitesses - 5 cv - 90 ch / 66 kW \r\nConsommation mixte: 4,9 L/100 km \r\nAutonomie moyenne: 918 km \r\nDimensions (L x l x h): 3,987 m x 1,698 m x 1,488 m\r\n\r\n2020\r\n\r\n8 000 km', 26000, 'polo-1.jpg', 'polo-2.jpg', 'polo-3.jpg', 3),
(10, 'Fiche technique Volkswagen Golf Sportsvan 1.2 TSI 85 BlueMotion Technology TrendLine (Monospace)', 'Monospace - Traction avant - Essence - \r\nBoîte manuelle, 5 vitesses - 5 cv - 85 ch / 63 kW \r\nConsommation mixte: 5,0 L/100 km \r\nAutonomie moyenne: 1 000 km \r\nDimensions (L x l x h): 4,338 m x 1,807 m x 1,578 m\r\n\r\n2016 \r\n\r\n110 000 km', 25000, 'golf7-1.jpg', 'golf7-2.jpg', 'golf7-3.jpg', 4),
(11, 'Fiche technique Opel Zafira 1.6 CDTI 136 BlueInjection Innovation (Monospace)', 'Monospace - Traction avant - Diesel - \r\nBoîte manuelle, 6 vitesses - 7 cv - 134 ch / 99 kW \r\nConsommation mixte: 4,5 L/100 km \r\nAutonomie moyenne: 1 289 km \r\nDimensions (L x l x h): 4,666 m x 1,884 m x 1,660 m\r\n\r\n2016\r\n\r\n130 000 km', 22000, 'zafira-1.jpg', 'zafira-2.jpg', 'zafira-3.jpg', 4),
(12, 'Fiche technique Aston Martin DB11 5.2i V12 Biturbo 601 BVA (Coupé)', 'Coupé - Propulsion arrière - Essence - \r\nBoîte automatique, 8 vitesses - 53 cv - 601 ch / 442 kW \r\nConsommation mixte: 11,4 L/100 km \r\nAutonomie moyenne: 684 km \r\nDimensions (L x l x h): 4,739 m x 1,940 m x 1,279 m\r\n\r\n2017\r\n\r\n40 000 km', 110000, 'db11-1.jpg', 'db11-2.jpg', 'db11-3.jpg', 5),
(13, 'Fiche technique Ferrari 812 SuperFast 6.5i V12 800 BVA (Coupé)', 'Coupé - Propulsion arrière - Essence - \r\nBoîte séquentielle, 7 vitesses - 81 cv - 800 ch / 588 kW \r\nConsommation mixte: 14,9 L/100 km \r\nAutonomie moyenne: 617 km \r\nDimensions (L x l x h): 4,657 m x 1,971 m x 1,276 m\r\n\r\n2015\r\n\r\n30 000 km', 120000, '812-1.jpg', '812-2.jpg', '812-3.jpg', 5),
(14, 'Fiche technique Lamborghini Huracan 5.2i V10 LP 610-4 BVA Avio (Coupé)', 'Coupé - 4roues permanent - Essence - \r\nBoîte séquentielle, 7 vitesses - 54 cv - 610 ch / 449 kW \r\nConsommation mixte: 12,5 L/100 km \r\nAutonomie moyenne: 640 km \r\nDimensions (L x l x h): 4,459 m x 1,924 m x 1,165 m\r\n\r\n2017\r\n\r\n50 000 km', 110000, 'lp610-1.jpg', 'lp610-2.jpg', 'lp610-3.jpg', 5),
(15, 'Fiche technique Porsche Cayman 3.8i 385 GT4 (Coupé)', 'Coupé - Propulsion arrière - Essence - \r\nBoîte manuelle, 6 vitesses - 28 cv - 385 ch / 283 kW \r\nConsommation mixte: 10,3 L/100 km \r\nAutonomie moyenne: 524 km \r\nDimensions (L x l x h): 4,438 m x 1,817 m x 1,266 m\r\n\r\n2015\r\n\r\n30 000 km', 80000, 'cayman gt4-1.jpg', 'cayman gt4-2.jpg', 'cayman gt4-3.jpg', 5),
(19, 'Fiche technique Opel Vivaro Cabine Approfondie 2700 C1 2.0 CDTI 115 Pack Clim (Fourgon)', 'Fourgon - Traction avant - Diesel - \r\nBoîte manuelle, 6 vitesses - 7 cv - 115 ch / 84 kW \r\nConsommation mixte: 8,4 L/100 km \r\nAutonomie moyenne: 1 071 km \r\nDimensions (L x l x h): 4,782 m x 1,904 m x 1,955 m\r\n\r\n2013\r\n\r\n120 000 km', 5000, 'vivaro-1.jpg', 'vivaro-2.jpg', 'vivaro-3.jpg', 6),
(20, 'Fiche technique Peugeot Boxer 335 L3H3 1.5 BlueHDi 130 Pro (Fourgon)', 'Fourgon - Traction avant - Diesel - \r\nBoîte manuelle, 6 vitesses - 7 cv - 130 ch / 96 kW \r\nConsommation mixte: 6,0 L/100 km \r\nAutonomie moyenne: 1 500 km \r\nDimensions (L x l x h): 5,998 m x 2,050 m x 2,760 m\r\n\r\n2009\r\n\r\n130 000 km', 4500, 'boxer-1.jpg', 'boxer-2.jpg', 'boxer-3.jpg', 6),
(21, 'Fiche technique Volkswagen Caddy 1.2 TSI 84 Conceptline (Combiné)', 'Combiné - Traction avant - Essence - \r\nBoîte manuelle, 5 vitesses - 5 cv - 84 ch / 62 kW \r\nConsommation mixte: 6,1 L/100 km \r\nAutonomie moyenne: 902 km \r\nDimensions (L x l x h): 4,408 m x 1,793 m x 1,822 m\r\n\r\n2013\r\n\r\n140 000 km', 5500, 'caddy-1.jpg', 'caddy-2.jpg', 'caddy-3.jpg', 6);


ALTER TABLE `vehicules`
  ADD CONSTRAINT `items_ibfk_1` FOREIGN KEY (`category`) REFERENCES `categories` (`id`);
COMMIT;


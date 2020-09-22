DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS client;


CREATE TABLE `client` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `client_id` int NOT NULL,
  `address` varchar(250) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`client_id`) REFERENCES `client` (`id`)
);
CREATE TABLE customer (
	idCustomer BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	firstname VARCHAR(50) NOT NULL,
	gender CHAR(1),
	address VARCHAR(255),
	birthdate DATETIME
) ENGINE=InnoDB DEFAULT CHARSET=utf-8;
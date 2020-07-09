CREATE TABLE IF NOT EXISTS customer (
	idCustomer BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	firstname VARCHAR(50) NOT NULL,
	ssn VARCHAR(15),
	age INT(10),
	gender CHAR(1),
	address VARCHAR(255),
	birthdate DATE
) ENGINE=InnoDB;

INSERT INTO customer (firstname, ssn, age, gender, address, birthdate) VALUES ('fulano de tal', '0987654321-01', 25, 'M', 'RUA DO CONCRETO, N 25', '1990/05/09');

INSERT INTO customer (firstname, ssn, age, gender, address, birthdate) VALUES ('fulano de tal 2', '123456789-09', 20, 'F', 'RUA DAS FLORES, N 15', '1995/10/05');
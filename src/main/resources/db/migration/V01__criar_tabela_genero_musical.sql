CREATE TABLE genero_musical(
	id BIGINT(4) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO genero_musical (nome) VALUES ('GOSPEL');
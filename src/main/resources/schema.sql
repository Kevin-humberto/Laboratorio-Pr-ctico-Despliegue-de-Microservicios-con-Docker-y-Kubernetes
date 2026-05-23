CREATE TABLE IF NOT EXISTS personas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO personas (nombre, apellido, email) VALUES ('Kevin', 'Huaman Vilcapuma', 'kevin.huaman.vilcapuma@vallegrande.edu.pe');
INSERT INTO personas (nombre, apellido, email) VALUES ('Maria', 'Gomez', 'maria@vallegrande.edu.pe');
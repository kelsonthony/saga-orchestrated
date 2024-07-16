CREATE TABLE `order` (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         product VARCHAR(255) NOT NULL,
                         quantity INT NOT NULL,
                         status VARCHAR(255) NOT NULL
);
CREATE DATABASE users_demo_db;
USE users_demo_db;
CREATE TABLE IF NOT EXISTS users
( id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    phone VARCHAR(128) NOT NULL,
    email VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
)
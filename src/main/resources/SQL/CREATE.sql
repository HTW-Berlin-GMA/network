create table user (
    UserID LONG NOT NULL PRIMARY KEY,
    username VARCHAR(128) NOT NULL,
    firstname VARCHAR(128),
    surname VARCHAR(128),
    birthdate DATE NOT NULL,
    eMailAddress VARCHAR(256) NOT NULL,
    telefon VARCHAR(16),
    address VARCHAR(256),
    housenumber VARCHAR(8),
    postCode VARCHAR(8),
    city VARCHAR(85)
);
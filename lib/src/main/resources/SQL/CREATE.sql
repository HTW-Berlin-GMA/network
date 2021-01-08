CREATE TABLE models (
    id integer not null PRIMARY KEY,
    name json not null,
    type text not null,
    description text,
);

CREATE TABLE user
(
    id uuid NOT NULL PRIMARY KEY,
    username character varying(64) NOT NULL,
    prename character varying(64),
    surname character varying(128),
    street character varying(128),
    housnumber character varying(8),
    postcode character varying(16),
    city character varying(128),
    country character varying(128),
    birthdate date,
    registration_date timestamp with time zone,
    interests json,
    favorites json,
    participatedactions json
);

CREATE TABLE actions_neighbourhood
(
    id uuid NOT NULL PRIMARY KEY,
    name text NOT NULL,
    activities text[] NOT NULL,
    dateBegin date,
    dateEnd date,
    duration long,
    owner uuid not null,
    isCompleted boolean,
    helper uuid
);

CREATE TABLE actions_freedom
(
    id uuid NOT NULL PRIMARY KEY,
    name text NOT NULL,
    activities text[] NOT NULL,
    dateBegin date,
    dateEnd date,
    duration long,
    owner uuid not null,
    numberOfParticipants integer,
    maximalNumberOfParticipants integer,
    listParticipants json,
    mapParticipants json
);

ALTER TABLE models
    ADD CHECK ( type IN (
        'User',
        'Action',
        'Storage'
    ) );


ALTER TABLE actions_neighbourhood
    ADD CONSTRAINT owner FOREIGN KEY ( owner )
        REFERENCES users ( users.id );

ALTER TABLE actions_freedom
    ADD CONSTRAINT owner FOREIGN KEY ( owner )
        REFERENCES users ( users.id );

ALTER TABLE actions_neighbourhood
    ADD CONSTRAINT helper FOREIGN KEY ( helper )
        REFERENCES users ( users.id );

________________________________________________________

CREATE TABLE models(id integer not null PRIMARY KEY, name json not null, type text not null, description text);

CREATE TABLE users(id uuid NOT NULL PRIMARY KEY, username character varying(64) NOT NULL, prename character varying(64), surname character varying(128), street character varying(128), housnumber character varying(8), postcode character varying(16), city character varying(128), country character varying(128), birthdate date, registration_date timestamp with time zone, interests json, favorites json, participatedactions json);

CREATE TABLE actions_neighbourhood (id uuid NOT NULL PRIMARY KEY,name text NOT NULL,activities text[] NOT NULL,dateBegin date,dateEnd date,duration text,owner uuid not null,isCompleted boolean,helper uuid);

CREATE TABLE actions_freedom(id uuid NOT NULL PRIMARY KEY,name text NOT NULL,activities text[] NOT NULL,dateBegin date,dateEnd date,duration text,owner uuid not null,numberOfParticipants integer,maximalNumberOfParticipants integer,listParticipants json,mapParticipants json);

ALTER TABLE models ADD CHECK(type IN('User','Action','Storage'));

ALTER TABLE actions_neighbourhood ADD CONSTRAINT owner FOREIGN KEY (owner) REFERENCES users (id);

ALTER TABLE actions_freedom ADD CONSTRAINT owner FOREIGN KEY (owner) REFERENCES users (id);

ALTER TABLE actions_neighbourhood ADD CONSTRAINT helper FOREIGN KEY (helper) REFERENCES users (id);

CREATE TABLE TODO (
    id   LONG         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    done boolean default false
);

INSERT INTO todo (name, description)
VALUES ('learn spring', 'chapter one');
INSERT INTO todo (name, description)
VALUES ('learn spring', 'chapter two');
INSERT INTO todo (name, description)
VALUES ('learn spring', 'chapter three');
INSERT INTO todo (name, description)
VALUES ('learn spring', 'chapter four');
INSERT INTO todo (name, description)
VALUES ('learn spring', 'chapter five');
INSERT INTO todo (name, description)
VALUES ('learn spring', 'chapter six');
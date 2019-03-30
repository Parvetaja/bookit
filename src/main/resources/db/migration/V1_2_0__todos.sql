CREATE TABLE todos (
    id   long         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    description varchar(255) not null,
    done boolean default false
);

insert into todos (name, description) values ( 'jooksma', '10 km');
insert into todos (name, description) values ( 'kodutoo', 'Tehisintellekt');
insert into todos (name, description) values ( 'kodutoo2', 'asdasd');
insert into todos (name, description) values ( 'Noud', 'pese neid');
insert into todos (name, description) values ( 'Tangi', 'oma auto');
insert into todos (name, description) values ( 'korista', 'tuba');

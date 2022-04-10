CREATE TABLE IF NOT EXISTS movies(
    id Int AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(50) NOT NULL ,
    minutes INT NOT NULL ,
    genre VARCHAR(50) NOT NULL
);

insert into movies(name, minutes, genre) values
    ('Dark Knighht', 152, 'ACTION'),
    ('Memento',113,'THRILLER'),
    ('Matrix',136,'ACTION');
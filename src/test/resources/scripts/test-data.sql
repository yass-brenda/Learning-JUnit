CREATE TABLE IF NOT EXISTS movies(
    id Int AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(50) NOT NULL ,
    minutes INT NOT NULL ,
    genre VARCHAR(50) NOT NULL,
    director VARCHAR(50) NOT NULL
);

insert into movies(name, minutes, genre,director) values
    ('Dark Knighht', 152, 'ACTION','Ulisses'),
    ('Memento',113,'THRILLER','Ulisses'),
    ('Matrix',136,'ACTION','Ulisses');
CREATE TABLE usuarios (
                          id bigint not null AUTO_INCREMENT,
                          login VARCHAR(100) NOT NULL,
                          password VARCHAR(255) NOT NULL UNIQUE,

                          primary key(id)
);
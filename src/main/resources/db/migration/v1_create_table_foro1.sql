CREATE TABLE topico (
    id bigint not null AUTO_INCREMENT,
    titulo VARCHAR(50) not null,
    mensaje varchar(60) not null,
    fecha_creacion date,
    status varchar(20) not null,
    autor varchar(50) not null,
    curso varchar(50) not null,
    primary key(id)
);

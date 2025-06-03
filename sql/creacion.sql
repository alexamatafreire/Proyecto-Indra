use master;
go
if db_id('Eventos_sostenibles') is not null
drop database Eventos_sostenibles;
go
create database Eventos_sostenibles
go
use Eventos_sostenibles;
create table ubicaciones (
    codigo char(5) primary key,
    nombre varchar(50) not null,
    online bit not null,
    direccion varchar(100) null
);
create table organizadores (
    nombre varchar(50) primary key,
    correo varchar(30) not null,
);
create table telefonos_organizador (
    organizador varchar(50) not null,
    telefono char(9) not null,
    primary key (organizador, telefono),
    foreign key (organizador) references organizadores(nombre)
);
create table eventos (
    codigo char(5) primary key,
    nombre varchar(50) not null,
    fecha datetime not null,
    duracion time not null,
    ubicacion char(5) not null,
    tipo varchar(25) not null,
    organizador varchar(50) not null,
    foreign key (ubicacion) references ubicaciones(codigo),
    foreign key (organizador) references organizadores(nombre)
);
create table usuarios (
    correo varchar(30) primary key,
    contraseña varchar(50) not null,
    nombre varchar(50) not null
);
create table asistentes (
    evento char(5) not null,
    usuario varchar(30) not null,
    primary key (evento, usuario),
    foreign key (evento) references eventos(codigo),
    foreign key (usuario) references usuarios(correo)
);
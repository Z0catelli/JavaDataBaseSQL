create database Pessoa;
use Pessoa;

create table Pessoa (
codigo int auto_increment primary key,
nome varchar (100) not null,
numero varchar (11),
email varchar (50));

select * from Pessoa;

insert into Pessoa values 
(codigo,"Gabriela", "11999999999", "gabriela@email.com"),
(codigo,"Gabriel", "11999999999", "gabriel@email.com"),
(codigo,"Vinicius", "11999999999", "vinicius@email.com"),
(codigo,"Joao", "11999999999", "joao@email.com"),
(codigo,"Raphaela", "11999999999", "raphaela@email.com");
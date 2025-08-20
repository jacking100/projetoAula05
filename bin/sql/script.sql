create database bd_projetoaula05;

use bd_projetoaula05;

create table pessoa(
	id           int           auto_increment,
	nome         varchar(100)  not null,
	cpf          varchar(14)   not null,
	primary key(id)
);

insert into pessoa(nome, cpf) values('Ana Paula', '123.456.789-00');
insert into pessoa(nome, cpf) values('Pedro Paulo', '321.654.987-00');

select id,nome, cpf
from pessoa
order by id;
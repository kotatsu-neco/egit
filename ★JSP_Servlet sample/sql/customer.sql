drop table customer if exists;

create table customer (
	id int auto_increment primary key, 
	login varchar(100) not null unique, 
	password varchar(100) not null
);

insert into customer(login, password) values('ayukawa', 'SweetfishRiver1');
insert into customer(login, password) values('samejima', 'SharkIsland2');
insert into customer(login, password) values('wanibuchi', 'CrocodileChasm3');
insert into customer(login, password) values('ebihara', 'ShrimpField4');
insert into customer(login, password) values('kanie', 'CrubBay5');

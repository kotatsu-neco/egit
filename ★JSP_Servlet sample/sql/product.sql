drop table product if exists;

create table product (
	id int auto_increment primary key, 
	name varchar(100) not null, 
	price int not null
);

insert into product(name, price) values('まぐろ', 100);
insert into product(name, price) values('サーモン', 100);
insert into product(name, price) values('えび', 100);
insert into product(name, price) values('いか', 100);
insert into product(name, price) values('えんがわ', 100);
insert into product(name, price) values('あなご', 100);
insert into product(name, price) values('たまご', 100);
insert into product(name, price) values('ほたて', 100);
insert into product(name, price) values('赤貝', 100);
insert into product(name, price) values('つぶ貝', 100);
insert into product(name, price) values('サラダ軍艦', 150);
insert into product(name, price) values('ねぎとろ軍艦', 150);
insert into product(name, price) values('ねぎとろ巻', 150);
insert into product(name, price) values('アボガド巻', 150);
insert into product(name, price) values('トロ', 200);
insert into product(name, price) values('いくら', 200);
insert into product(name, price) values('うに', 200);

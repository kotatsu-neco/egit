drop table purchase if exists;

create table purchase (
	id int auto_increment primary key, 
	product_id int not null, 
	product_name varchar(100) not null, 
	product_price int not null, 
	product_count int not null, 
	customer_name varchar(100) not null, 
	customer_address varchar(100) not null
);

create table messages (
	ID BIGINT(20) not null auto_increment,
	TEXT varchar(255),
	primary key(ID)
);

create table persons (
	ID BIGINT(20) not null auto_increment,
	city varchar(255) null default null,
	street varchar(255) null default null,
	zipcode varchar(255) null default null,
	name varchar(255) not null,
	primary key(ID)
);
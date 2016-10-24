--drop table user if exists;

create table user (
	id   integer primary key,
	user_type varchar(15)  not null
);

create table member (
  	user_id   integer primary key,
  	given_name varchar(30)  not null,
  	last_name varchar(30)  not null,
  	phone_number varchar(50)  not null,
  	email  varchar(50)  not null,
  	foreign key (user_id) references public.user(id)
);

create table book (
	id   integer primary key,
	isbn varchar(50) not null,
	title varchar(200) not null,
	author varchar(200) not null
);

create table checkout (
	
    id integer primary key,
	member_id integer not null,
	book_id integer  not null,
	borrowed_date timestamp not null ,
	due_date timestamp not null,
	return_date timestamp,
	foreign key (member_id) references public.member(user_id),
	foreign key (book_id) references public.book(id),
);
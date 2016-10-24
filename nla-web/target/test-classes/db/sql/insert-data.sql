INSERT INTO user VALUES (1, 'staff');
INSERT INTO user VALUES (2, 'member');
INSERT INTO user VALUES (3, 'member');
INSERT INTO user VALUES (4, 'member');
INSERT INTO user VALUES (5, 'member');
INSERT INTO user VALUES (6, 'member');
INSERT INTO user VALUES (7, 'member');
INSERT INTO user VALUES (8, 'member');
INSERT INTO user VALUES (9, 'member');
INSERT INTO user VALUES (10, 'member');

INSERT INTO member VALUES (2,'firstname2', 'lastname2', '0412345672', 'user2@email.com');
INSERT INTO member VALUES (3,'firstname3', 'lastname3', '0412345673', 'user3@email.com');
INSERT INTO member VALUES (4,'firstname4', 'lastname4', '0412345674', 'user4@email.com');
INSERT INTO member VALUES (5,'firstname5', 'lastname5', '0412345675', 'user5@email.com');
INSERT INTO member VALUES (6,'firstname6', 'lastname6', '0412345676', 'user6@email.com');
INSERT INTO member VALUES (7,'firstname7', 'lastname7', '0412345677', 'user7@email.com');
INSERT INTO member VALUES (8,'firstname8', 'lastname8', '0412345678', 'user8@email.com');
INSERT INTO member VALUES (9,'firstname9', 'lastname9', '0412345679', 'user9@email.com');
INSERT INTO member VALUES (10,'firstname10', 'lastname10', '0412345610', 'user10@email.com');

--id,isbn,title,author
INSERT INTO book VALUES (1, 'isbn1', 'title1', 'author1');
INSERT INTO book VALUES (2, 'isbn2', 'title2', 'author2');
INSERT INTO book VALUES (3, 'isbn3', 'title3', 'author3');
INSERT INTO book VALUES (4, 'isbn3', 'title3', 'author3');
INSERT INTO book VALUES (5, 'isbn5', 'title5', 'author5');
INSERT INTO book VALUES (6, 'isbn6', 'title6', 'author6');
INSERT INTO book VALUES (7, 'isbn6', 'title6', 'author6');
INSERT INTO book VALUES (8, 'isbn8', 'title8', 'author8');
INSERT INTO book VALUES (9, 'isbn9', 'title9', 'author9');
INSERT INTO book VALUES (10, 'isbn10', 'title10', 'author10');
INSERT INTO book VALUES (11, 'isbn11', 'title11', 'author11');
INSERT INTO book VALUES (12, 'isbn12', 'title12', 'author12');
INSERT INTO book VALUES (13, 'isbn13', 'title13', 'author13');

--id,member_id,book_id,borrowed_date,due_date,return_date
INSERT INTO checkout VALUES (1, 2, 1, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-15 00:00:00.00'},null);
INSERT INTO checkout VALUES (2, 2, 2, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-15 00:00:00.00'},null);
INSERT INTO checkout VALUES (3, 2, 3, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-15 00:00:00.00'},null);
INSERT INTO checkout VALUES (4, 3, 4, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);
INSERT INTO checkout VALUES (5, 3, 5, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);
INSERT INTO checkout VALUES (6, 4, 6, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);
INSERT INTO checkout VALUES (7, 5, 7, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);
INSERT INTO checkout VALUES (8, 6, 8, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);
INSERT INTO checkout VALUES (10, 8, 10, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);
INSERT INTO checkout VALUES (11, 9, 11, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);
INSERT INTO checkout VALUES (12, 10, 12, {ts '2016-10-01 00:00:00.00'}, {ts '2016-10-31 00:00:00.00'},null);


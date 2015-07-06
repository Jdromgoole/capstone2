SET SCHEMA APP;

CREATE TABLE Musicians 
	(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
	name VARCHAR(40) NOT NULL, 
	age INT NOT NULL,
	location VARCHAR(40) NOT NULL,
	instrument VARCHAR(40) NOT NULL,
	experience INT NOT NULL
	);
	
INSERT INTO MUSICIANS (name, age, location, instrument, experience)  values ('Slash', 25, 'Los Angeles', 'guitar', 5);
INSERT INTO MUSICIANS (name, age, location, instrument, experience)  values ('Flea', 30, 'New York', 'bass', 10);
INSERT INTO MUSICIANS (name, age, location, instrument, experience)  values ('Paul', 26, 'San Francisco', 'bass', 20);
INSERT INTO MUSICIANS (name, age, location, instrument, experience)  values ('Jimi', 27, 'Seattle', 'guitar', 15);
INSERT INTO MUSICIANS (name, age, location, instrument, experience)  values ('Flaco Jimenez', 75, 'San Antonio', 'accordion', 65);
INSERT INTO MUSICIANS (name, age, location, instrument, experience)  values ('Willie Nelson', 82, 'Austin', 'guitar', 75);



update MUSICIANS set theYear = 2009, color = 'Green' where id = 2;

SELECT * FROM musicians;

SELECT * FROM musicians where instrument = 'guitar';


CREATE TABLE app.loginUser
	(id INT ,
	userName VARCHAR(40) NOT NULL,
	email VARCHAR(40) NOT NULL,
	password VARCHAR(40) NOT NULL
	);

INSERT INTO LOGINUSER (userName, email, password) values ('Joe Blow', 'JoeBlow@yawoo.com', 'CatScratchFever');
INSERT INTO LOGINUSER (userName, email, password) values ('Jake Dromgoole', 'jakeDromgoole@123.com', 'abc');
INSERT INTO LOGINUSER (userName, email, password) values ('Ethan Hunt', 'MissionPossible@123.com', 'abc');






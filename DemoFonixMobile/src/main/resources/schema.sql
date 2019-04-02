DROP TABLE IF EXISTS ITEMS;
create table ITEMS (
 	 id long primary key not null,
 	 description varchar(100) not null
);


DROP TABLE IF EXISTS USERS;   
CREATE TABLE USERS (
      ID long NOT NULL AUTO_INCREMENT PRIMARY KEY,
      EMAILADDRESS varchar(50) not null,
      ORIG_AIRP_CODE  varchar(3) not null,
      DEST_AIRP_CODE  varchar(3)  not null,
      FLIGHT_NUMBER varchar(6) not null,
      FLIGHT_DT time not null,
      PRINCE varchar(6) not null
); 
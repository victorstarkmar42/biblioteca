SELECT * FROM DUAL;


alter SESSION set "_ORACLE_SCRIPT" = TRUE;
CREATE USER LIB IDENTIFIED BY "lib";
GRANT "CONNECT" TO "LIB";
GRANT "RESOURCE" TO "LIB";
GRANT UNLIMITED TABLESPACE TO "LIB";
ALTER USER "LIB" ACCOUNT UNLOCK;
COMMIT;



create table libros(
idlibro NUMBER(20,0) GENERATED BY DEFAULT AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER NOCYCLE NOT NULL ENABLE,
autor varchar2(20),
genero varchar(30),
precio number(6,2)
);

insert into libros(autor, genero, precio) values ('Borges','Accion','25.50');

describe libros;

select * from LIB.libros;

drop table LIB.libros; 



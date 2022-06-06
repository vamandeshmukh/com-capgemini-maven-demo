
select current_date;

select current_timestamp;

select 10 + 10;

-- syntax to create table 
-- create table table_name (column_name datatype ... , column_name_2 datatype ...  );

CREATE TABLE emp(eid INT, first_name varchar(10), salary DECIMAL);

COMMIT;
ROLLBACK;

SELECT * FROM emp;

-- syntax to insert records 
-- insert into table_name (list of columns) values (list of values);
INSERT INTO emp (eid, first_name, salary) VALUES (101, 'Sonu', 50000);
INSERT INTO emp (eid, first_name, salary) VALUES (102, 'Monu', 60000);
INSERT INTO emp (eid, first_name, salary) VALUES (103, 'Tonu', 65000);
INSERT INTO emp (eid, first_name, salary) VALUES (104, 'Ponu', 55000);
INSERT INTO emp (eid, first_name, salary) VALUES (105, 'Gonu', 75000);

SELECT * FROM emp;







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

-- syntax for select 
-- select column_names from table_name;
SELECT * FROM emp;
SELECT first_name FROM emp;
SELECT first_name, salary FROM emp;
SELECT eid, first_name, salary FROM emp;

-- emps with salary > 60K
SELECT eid, first_name, salary 
FROM emp 
WHERE salary > 60000
ORDER BY first_name;

-- Constraints in SQL 
-- PK, FK, Check, NN, Unique 

-- emps 

CREATE TABLE emps(eid INT constraint emps_pk primary key, 
				  first_name varchar(10), 
				  salary DECIMAL);

INSERT INTO emps (eid, first_name, salary) VALUES (101, 'Sonu', 50000);
INSERT INTO emps (eid, first_name, salary) VALUES (102, 'Monu', 60000);
INSERT INTO emps (eid, first_name, salary) VALUES (103, 'Ponu', 55000);

COMMIT;

SELECT * FROM emps;

-- try to insert duplicate record 
INSERT INTO emps (eid, first_name, salary) VALUES (102, 'Monu', 60000);

COMMIT;

-- try to insert null pk record 
INSERT INTO emps (eid, first_name, salary) VALUES (null, 'Monu', 60000);

COMMIT;


DROP TABLE emps;


CREATE TABLE deps(did INT constraint deps_pk primary key, 
				  dname varchar(40), 
				  city varchar(40));

COMMIT; 

CREATE TABLE emps(eid INT constraint emps_pk primary key, 
				  first_name varchar(10), 
				  salary DECIMAL, 
				  did INT CONSTRAINT emps_deps_fk 
				  references deps(did)
				 );

COMMIT; 

INSERT INTO deps (did, dname, city) VALUES (10, 'HR', 'Hyderabad');
INSERT INTO deps (did, dname, city) VALUES (20, 'Admin', 'Bengaluru');
INSERT INTO deps (did, dname, city) VALUES (30, 'Marketing', 'Chennai');
INSERT INTO deps (did, dname, city) VALUES (40, 'Development', 'Pune');


COMMIT; 

INSERT INTO emps (eid, first_name, salary, did) VALUES (101, 'Sonu', 50000, 10);
INSERT INTO emps (eid, first_name, salary, did) VALUES (102, 'Monu', 60000, 10);
INSERT INTO emps (eid, first_name, salary, did) VALUES (103, 'Tonu', 55000, 20);
INSERT INTO emps (eid, first_name, salary, did) VALUES (104, 'Ponu', 75000, 30);
INSERT INTO emps (eid, first_name, salary, did) VALUES (105, 'Gonu', 70000, NULL);

COMMIT; 

SELECT * FROM emps;
SELECT * FROM deps;

-- try to insert a wrong record

INSERT INTO emps (eid, first_name, salary, did) VALUES (106, 'Ronu', 50000, 50);

-- functions in SQL 
-- What is the average salary of employees ?
SELECT max(salary) from emps;
SELECT min(salary) from emps;
SELECT round(avg(salary)) from emps;
SELECT sum(salary) from emps;
SELECT UPPER(first_name) from emps;

SELECT salary, salary + 10000  "Hike" from emps;

-- subquery 
-- Which employee has the highest salary?
SELECT first_name, salary from emps 
WHERE salary = (SELECT max(salary) from emps);


COMMIT; 


 
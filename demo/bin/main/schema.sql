create table employee
(
   emp_id integer not null,
   emp_name varchar(255) not null,
   designation varchar(255) not null,
   address varchar(255) not null,
   phone varchar(15) not null,
   primary key(emp_id)
);



create table department
(
   dept_id integer not null,
   dept_name varchar(255) not null,
   dept_loc varchar(255) not null,
   emp_id integer not null,
   primary key(dept_id)
);
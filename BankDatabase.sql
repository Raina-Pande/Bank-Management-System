create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup (formno varchar(20),name varchar(20),father_name varchar(20),dob varchar(20),gender varchar(20),email varchar(30),marital_status varchar(20),address varchar(40),city varchar(20),pincode varchar(20),state varchar(25));

show tables;

select * from signup;

create table  signuptwo(formno varchar(20),guarantor_name varchar(20),guarantors_relation varchar(20),income varchar(20),education varchar(20),occupation varchar(30),pan_number varchar(20),aadhaar_number varchar(20),senior_citizen varchar(20),exisiting_account varchar(20));

select * from signuptwo;

create table signupthree(formno varchar(20),account_type varchar(40),card_number varchar(30),pin varchar(10),facility varchar(100));

select * from signupthree;

create table login(formno varchar(20),cardnumber varchar(30),pin varchar(10));

select * from login;

create table bank(pin varchar(20),date varchar(50),type varchar(20),amount varchar(20));

select * from bank;


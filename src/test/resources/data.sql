DROP TABLE IF EXISTS customer;
CREATE TABLE customer AS SELECT * FROM CSVREAD('classpath:tables/user_visa.csv');
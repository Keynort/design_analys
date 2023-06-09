-- Create the "Customers" table
CREATE TABLE Customers (
  customer_id SERIAL PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  email VARCHAR(100),
  phone_number VARCHAR(20)
);

-- Insert sample data into the "Customers" table
INSERT INTO Customers (first_name, last_name, email, phone_number)
VALUES ('John', 'Doe', 'johndoe@example.com', '1234567890'),
       ('Jane', 'Smith', 'janesmith@example.com', '9876543210');

-- Create the "Accounts" table
CREATE TABLE Accounts (
  account_id SERIAL PRIMARY KEY,
  customer_id INT,
  account_number VARCHAR(20),
  balance DECIMAL(10,2),
  FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);

-- Insert sample data into the "Accounts" table
INSERT INTO Accounts (customer_id, account_number, balance)
VALUES (1, '123456789', 5000.00),
       (2, '987654321', 7500.00);

-- Create the "Transactions" table
CREATE TABLE Transactions (
  transaction_id SERIAL PRIMARY KEY,
  account_id INT,
  transaction_date DATE,
  transaction_type VARCHAR(20),
  amount DECIMAL(10,2),
  FOREIGN KEY (account_id) REFERENCES Accounts(account_id)
);

-- Insert sample data into the "Transactions" table
INSERT INTO Transactions (account_id, transaction_date, transaction_type, amount)
VALUES (1, '2023-01-01', 'Deposit', 1000.00),
       (1, '2023-02-15', 'Withdrawal', 500.00),
       (2, '2023-03-10', 'Deposit', 2000.00),
       (2, '2023-04-20', 'Withdrawal', 1000.00);

-- Create the "Branches" table
CREATE TABLE Branches (
  branch_id SERIAL PRIMARY KEY,
  branch_name VARCHAR(100),
  location VARCHAR(100)
);

-- Insert sample data into the "Branches" table
INSERT INTO Branches (branch_name, location)
VALUES ('Main Branch', 'New York'),
       ('Downtown Branch', 'Chicago');

-- Create the "Employees" table
CREATE TABLE Employees (
  employee_id SERIAL PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  email VARCHAR(100),
  phone_number VARCHAR(20),
  branch_id INT,
  FOREIGN KEY (branch_id) REFERENCES Branches(branch_id)
);

-- Insert sample data into the "Employees" table
INSERT INTO Employees (first_name, last_name, email, phone_number, branch_id)
VALUES ('Mike', 'Johnson', 'mikejohnson@example.com', '1234567890', 1),
       ('Emily', 'Davis', 'emilydavis@example.com', '9876543210', 2);
 CREATE TABLE IF NOT EXISTS mock (id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,  operationid varchar(250), input longvarchar(25000),url varchar(250),method varchar(50), output longvarchar(25000), resources varchar(250), httpStatusCode varchar(250),excludeList varchar(250), availableParamsList varchar(2500) ); 

CREATE TABLE contact(
    id bigserial NOT NULL,
    name varchar(100),
    phone_number varchar(15),
    comments varchar,
    date_of_birth date,
    created_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    deleted_date timestamp,
    PRIMARY KEY(id)
);

INSERT INTO contact(name, phone_number, comments, date_of_birth) VALUES('Andriy Shevchenko', '555-555-5555', 'ACM Player', '1976-09-29');
INSERT INTO contact(name, phone_number, comments, date_of_birth) VALUES('Thierry Henry', '555-555-5555', 'Arsenal Player', '1977-08-17');
INSERT INTO contact(name, phone_number, comments, date_of_birth) VALUES('Lionel Messi', '555-555-5555', 'FC Barcelona Player', '1987-06-24');
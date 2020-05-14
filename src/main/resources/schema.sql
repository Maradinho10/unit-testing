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
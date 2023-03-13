create table CARS
(
    ID            BIGINT auto_increment
        primary key,
    MAKE          VARCHAR(255) not null,
    MODEL         VARCHAR(255) not null,
    YEAR_OF_MADE  VARCHAR(255) not null,
    BODY_TYPE     VARCHAR(255),
    FUEL_TYPE     VARCHAR(255),
    LICENCE_PLATE VARCHAR(255) not null
);


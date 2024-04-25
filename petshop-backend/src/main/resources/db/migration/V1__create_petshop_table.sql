CREATE TABLE IF NOT EXISTS `petshops`.`tb_petshops`
(
    `id`                           BIGINT        NOT NULL AUTO_INCREMENT,
    `name`                         varchar(50)   NOT NULL,
    `distance`                     numeric(5, 2) NOT NULL,
    `small_dog_week_bath_price`    decimal(5, 2) NOT NULL,
    `big_dog_week_bath_price`      decimal(5, 2) NOT NULL,
    `small_dog_weekend_bath_price` decimal(5, 2) NOT NULL,
    `big_dog_weekend_bath_price`   decimal(5, 2) NOT NULL,
    PRIMARY KEY (`id`)
);
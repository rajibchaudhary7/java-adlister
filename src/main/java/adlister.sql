use adlister_db;
create user 'adlister_user'@'localhost' identified by 'password';
select user, host from mysql.user;
GRANT CREATE, ALTER, INSERT, DROP ON adlister_db.* TO 'adlister_user'@'localhost';
SHOW GRANTS for 'adlister_user'@'localhost';
CREATE TABLE users (
                       id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                       username VARCHAR(50) NOT NULL,
                       email  VARCHAR(50) NOT NULL,
                       password VARCHAR(50) NOT NULL,
                       PRIMARY KEY (id)
);
CREATE TABLE ads (
             id INT UNSIGNED NOT NULL AUTO_INCREMENT,
            user_id INT UNSIGNED DEFAULT NULL,
             title  VARCHAR(50) NOT NULL,
            description TEXT NOT NULL,
            PRIMARY KEY (id),
            FOREIGN KEY (user_id) REFERENCES users (id)

    );

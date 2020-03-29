USE mybatis;
DROP TABLE IF EXISTS user;
CREATE TABLE user(
		    id int NOT NULL AUTO_INCREMENT,
        account VARCHAR(20) NULL ,
        passwork VARCHAR(50) NULL,
        perms VARCHAR(20) NOT NULL,
        PRIMARY KEY (id)
    )ENGINE=InnoDB;

INSERT INTO user(account,passwork,perms) VALUES ('Mark','123','user:empl');
INSERT INTO user(account,passwork,perms) VALUES ('bbb','111','user:manager');
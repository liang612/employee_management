use mybatis;
DROP TABLE IF EXISTS employee;
create table employee(
	emplNum integer NOT NULL comment '员工编号',
	emplName char(11) NOT NULL comment '员工姓名',
    duty varchar(11) NOT NULL comment '职务',
    sex char(2) NOT NULL comment '性别',
    age integer NOT NULL comment '年龄',
    address varchar(30) comment '地址',
    CONSTRAINT PRIMARY KEY PK_employee(emplNum)
    );
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (19121401,'邓杰','销售经理','男',23,'湖北');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (19121402,'李娟','大堂经理','女',25,'广州');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032901,'夜青','大堂经理','女',33,'哈尔滨');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032902,'梦雁','大堂经理','男',24,'湘西');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032903,'怀蓝','大堂经理','女',33,'赣州');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032904,'凝文','大堂经理','男',22,'广西');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032905,'飞青','大堂经理','女',34,'广州');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032906,'夏旋','大堂经理','男',28,'河南');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032907,'白亦','大堂经理','女',28,'广州');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032908,'香儿','大堂经理','女',33,'大连');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032909,'芷芹','大堂经理','男',30,'广州');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032910,'忆真','大堂经理','女',29,'内蒙古');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (20032911,'忆真','大堂经理','女',33,'重庆');
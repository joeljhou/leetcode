//
// 
// Salary 表： 
//
// 
//+-------------+----------+
//| Column Name | Type     |
//+-------------+----------+
//| id          | int      |
//| name        | varchar  |
//| sex         | ENUM     |
//| salary      | int      |
//+-------------+----------+
//id 是这个表的主键。
//sex 这一列的值是 ENUM 类型，只能从 ('m', 'f') 中取。
//本表包含公司雇员的信息。
// 
//
// 
//
// 请你编写一个 SQL 查询来交换所有的 'f' 和 'm' （即，将所有 'f' 变为 'm' ，反之亦然），仅使用 单个 update 语句 ，且不产生
//中间临时表。 
//
// 注意，你必须仅使用一条 update 语句，且 不能 使用 select 语句。 
//
// 查询结果如下例所示。 
//
// 
//
// 示例 1: 
//
// 
//输入：
//Salary 表：
//+----+------+-----+--------+
//| id | name | sex | salary |
//+----+------+-----+--------+
//| 1  | A    | m   | 2500   |
//| 2  | B    | f   | 1500   |
//| 3  | C    | m   | 5500   |
//| 4  | D    | f   | 500    |
//+----+------+-----+--------+
//输出：
//+----+------+-----+--------+
//| id | name | sex | salary |
//+----+------+-----+--------+
//| 1  | A    | f   | 2500   |
//| 2  | B    | m   | 1500   |
//| 3  | C    | f   | 5500   |
//| 4  | D    | m   | 500    |
//+----+------+-----+--------+
//解释：
//(1, A) 和 (3, C) 从 'm' 变为 'f' 。
//(2, B) 和 (4, D) 从 'f' 变为 'm' 。 
// 
// 
// Related Topics 数据库 👍 310 👎 0


//There is no code of Java type for this problem

//创建表
//CREATE TABLE `salary`  (
//`id` int(11) NOT NULL,
//`name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//`sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//`salary` int(11) NULL DEFAULT NULL,
//PRIMARY KEY (`id`) USING BTREE
//) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
//插入数据
//INSERT INTO `salary` VALUES (1, 'A', 'm', 2500);
//INSERT INTO `salary` VALUES (2, 'B', 'f', 1500);
//INSERT INTO `salary` VALUES (3, 'C', 'm', 5500);
//INSERT INTO `salary` VALUES (4, 'D', 'f', 500);

update salary
set
    sex = case sex
        when 'm' then 'f'
        when 'f' then 'm' else 'x'
end;
//表: Person 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| id          | int     |
//| email       | varchar |
//+-------------+---------+
//id是该表的主键列。
//该表的每一行包含一封电子邮件。电子邮件将不包含大写字母。
// 
//
// 
//
// 编写一个 SQL 删除语句来 删除 所有重复的电子邮件，只保留一个id最小的唯一电子邮件。 
//
// 以 任意顺序 返回结果表。 （注意： 仅需要写删除语句，将自动对剩余结果进行查询） 
//
// 查询结果格式如下所示。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: 
//Person 表:
//+----+------------------+
//| id | email            |
//+----+------------------+
//| 1  | john@example.com |
//| 2  | bob@example.com  |
//| 3  | john@example.com |
//+----+------------------+
//输出: 
//+----+------------------+
//| id | email            |
//+----+------------------+
//| 1  | john@example.com |
//| 2  | bob@example.com  |
//+----+------------------+
//解释: john@example.com重复两次。我们保留最小的Id = 1。 
// Related Topics 数据库 👍 518 👎 0


//There is no code of Java type for this problem

//自关联匹配email
DELETE p1 from Person p1,Person p2
WHERE
p1.Email = p2.Email
        AND p1.Id > p2.Id;

//暴力破解 delete not in
delete from person where id not in(
    select id from (select min(id) id from person group by email) as keep
)
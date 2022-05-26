//表： Users 
//
// 
//+----------------+---------+
//| Column Name    | Type    |
//+----------------+---------+
//| user_id        | int     |
//| name           | varchar |
//+----------------+---------+
//user_id 是该表的主键。
//该表包含用户的 ID 和名字。名字仅由小写和大写字符组成。
// 
//
// 
//
// 编写一个 SQL 查询来修复名字，使得只有第一个字符是大写的，其余都是小写的。 
//
// 返回按 user_id 排序的结果表。 
//
// 查询结果格式示例如下。 
//
// 
//
// 示例 1： 
//
// 
//输入：
//Users table:
//+---------+-------+
//| user_id | name  |
//+---------+-------+
//| 1       | aLice |
//| 2       | bOB   |
//+---------+-------+
//输出：
//+---------+-------+
//| user_id | name  |
//+---------+-------+
//| 1       | Alice |
//| 2       | Bob   |
//+---------+-------+ 
// Related Topics 数据库 👍 24 👎 0


//There is no code of Java type for this problem

//利用mysql字符串函数
SELECT user_id,
        CONCAT(UPPER(LEFT(NAME,1)),LOWER(SUBSTRING(NAME,2))) as name
FROM users ORDER BY user_id;
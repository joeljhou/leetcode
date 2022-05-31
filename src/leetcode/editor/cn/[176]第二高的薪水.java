//Employee 表：
// 
// 
// 
//+-------------+------+
//| Column Name | Type |
//+-------------+------+
//| id          | int  |
//| salary      | int  |
//+-------------+------+
//id 是这个表的主键。
//表的每一行包含员工的工资信息。
// 
//
// 
//
// 编写一个 SQL 查询，获取并返回 Employee 表中第二高的薪水 。如果不存在第二高的薪水，查询应该返回 null 。 
//
// 查询结果如下例所示。 
//
// 
//
// 示例 1： 
//
// 
//输入：
//Employee 表：
//+----+--------+
//| id | salary |
//+----+--------+
//| 1  | 100    |
//| 2  | 200    |
//| 3  | 300    |
//+----+--------+
//输出：
//+---------------------+
//| SecondHighestSalary |
//+---------------------+
//| 200                 |
//+---------------------+
// 
//
// 示例 2： 
//
// 
//输入：
//Employee 表：
//+----+--------+
//| id | salary |
//+----+--------+
//| 1  | 100    |
//+----+--------+
//输出：
//+---------------------+
//| SecondHighestSalary |
//+---------------------+
//| null                |
//+---------------------+
// 
// 
// 
// Related Topics 数据库 👍 1069 👎 0


//There is no code of Java type for this problem

//限制：limit[offset,] n(offset: 偏移量,跳过几行；n: 取出条数；offset如果不写,相当于limit 0,n)。
SELECT  (
        SELECT
            DISTINCT Salary
        FROM
            Employee
        ORDER BY
            Salary DESC
        LIMIT
            1
        OFFSET
            1
    )
AS SecondHighestSalary;


//解决 “NULL” 问题的另一种方法是使用 “IFNULL” 函数，如下所示
SELECT IFNULL((SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT 1 OFFSET 1 ),
NULL
) AS SecondHighestSalary;
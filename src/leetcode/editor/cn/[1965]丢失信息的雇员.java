//表: Employees 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| employee_id | int     |
//| name        | varchar |
//+-------------+---------+
//employee_id 是这个表的主键。
//每一行表示雇员的id 和他的姓名。
// 
//
// 表: Salaries 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| employee_id | int     |
//| salary      | int     |
//+-------------+---------+
//employee_id is 这个表的主键。
//每一行表示雇员的id 和他的薪水。
// 
//
// 
//
// 写出一个查询语句，找到所有 丢失信息 的雇员id。当满足下面一个条件时，就被认为是雇员的信息丢失： 
//
// 
// 雇员的 姓名 丢失了，或者 
// 雇员的 薪水信息 丢失了，或者 
// 
//
// 返回这些雇员的id employee_id ， 从小到大排序 。 
//
// 查询结果格式如下面的例子所示。 
//
// 
//
// 示例 1： 
//
// 
//输入：
//Employees table:
//+-------------+----------+
//| employee_id | name     |
//+-------------+----------+
//| 2           | Crew     |
//| 4           | Haven    |
//| 5           | Kristian |
//+-------------+----------+
//Salaries table:
//+-------------+--------+
//| employee_id | salary |
//+-------------+--------+
//| 5           | 76071  |
//| 1           | 22517  |
//| 4           | 63539  |
//+-------------+--------+
//输出：
//+-------------+
//| employee_id |
//+-------------+
//| 1           |
//| 2           |
//+-------------+
//解释：
//雇员1，2，4，5 都工作在这个公司。
//1号雇员的姓名丢失了。
//2号雇员的薪水信息丢失了。 
// Related Topics 数据库 👍 23 👎 0


//There is no code of Java type for this problem

//两个表关联,查询只出现一次的

//两个表关联,查询只出现一次的
select * from(
    select employee_id from employees
        union all
    select employee_id from salaries
)as t
group by employee_id
having count(employee_id)=1
order by employee_id;


//姓名丢失了 & 薪水信息丢失了
select s.employee_id from salaries s left join employees e on s.employee_id = e.employee_id where e.name is null
union
select e.employee_id from employees e left join salaries s on e.employee_id = s.employee_id where s.salary is null
order by employee_id;
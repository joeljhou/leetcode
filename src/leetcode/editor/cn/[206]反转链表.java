//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//
// 
// 
// 
// 
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
//
// Related Topics 递归 链表 👍 3960 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // 迭代方式 的链表反转实现
    public ListNode reverseList(ListNode head) {
        // 假设链表为 1→2→3→∅，我们想要把它改成 ∅←1←2←3。
        ListNode prev = null;  // 上一个节点
        ListNode curr = head;  // 当前节点

        // 遍历当前节点
        while (curr != null) {
            ListNode next = curr.next;  // 记录下一个节点
            curr.next = prev;           // 保持当前节点指向上一个节点即可
            prev = curr;  // 更新上一个节点
            curr = next;  // 更新当前节点
        }
        // 遍历结束后，prev 指向了链表的最后一个节点
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

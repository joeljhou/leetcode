import java.util.ArrayList;
import java.util.List;

/**
 * 解决方案
 */
public class Solution {

    // 单链表的定义
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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

    public static void main(String[] args) {

    }

}

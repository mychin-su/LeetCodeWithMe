import java.util.HashMap;
import java.util.Map;

public class Remove_Zero_Sum_Consecutive_Nodes_From_Linked_List_1171 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	// prefixSum = 1

	public static ListNode removeZeroSumSublists(ListNode head) {
		ListNode startnode = new ListNode(0);
		startnode.next = head;
		int prefixsum = 0;
		Map<Integer, ListNode> map = new HashMap<>();
		map.put(prefixsum, startnode);
		while (head != null) {
			prefixsum += head.val;
			map.put(prefixsum, head);
			head = head.next;
		} // map [()]
			// prefixSum = 4
			// head = null
		head = startnode; // head = 0
		prefixsum = 0;
		while (head != null) {
			prefixsum += head.val;
			head.next = map.get(prefixsum).next;
			head = head.next;
		}
		return startnode.next;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(-3);
		ListNode n5 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println(removeZeroSumSublists(n1));
	}
}


public class Reverse_Linked_List_206 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		};

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode currNode = head;
		while (currNode != null && currNode.next != null) {
			ListNode nextNode = currNode.next;
			currNode.next = nextNode.next;
			nextNode.next = head;
			head = nextNode;
		}
		return head;
	}
	
	/*
	 * currNode = 1 
	 * nextNode = 2 
	 * 1 -> 3 
	 * 2 -> 1 
	 * 
	 */

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println(reverseList(n1));
	}

}

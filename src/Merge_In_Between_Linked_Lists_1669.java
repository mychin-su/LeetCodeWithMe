
public class Merge_In_Between_Linked_Lists_1669 {
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

	public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		ListNode prev = list1, temp1 = list1, curr = list1;
		a--; // Adjust a to match zero-based indexing

		// Traverse list1 to find the node at position (a - 1)
		while (temp1 != null && a-- > 0) {
			temp1 = temp1.next;
			prev = temp1;
		}

		temp1 = list1; // Reset temp1 to traverse list1 again

		// Traverse list1 to find the node at position (b + 1)
		while (temp1 != null && b-- > 0) {
			temp1 = temp1.next;
			curr = temp1;
		}
		ListNode temp2 = list2; // Initialize pointer to traverse list2

		// Traverse list2 to find the last node
		while (temp2.next != null) {
			temp2 = temp2.next;
		}
		prev.next = list2;
		temp2.next = curr.next;

		return list1;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(10);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(13);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(9);
		ListNode n6 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		ListNode m1 = new ListNode(6);
		m1.next = new ListNode(9);

		System.out.println(mergeInBetween(n1, 3, 4, m1));
	}
}

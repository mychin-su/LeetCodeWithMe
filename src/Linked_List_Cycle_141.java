
public class Linked_List_Cycle_141 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	
	public boolean hasCycle(ListNode head) {
		ListNode slow_pointer = head, fast_pointer = head;
		while(fast_pointer != null && fast_pointer.next != null) {
			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;
			if(slow_pointer == fast_pointer) {// so sanh 2 node co cung tro vao 1 o nho dia chi hay khong 
				return true;
			} // 1 2 3 4 5 
		}
		return false;
	}
	
	public static void main(String[] args) {
		ListNode root = new ListNode(3);
		root.next = new ListNode(2);
		root.next.next = new ListNode(0);
		root.next = new ListNode(-4);
		
	}
}

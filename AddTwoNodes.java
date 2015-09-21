class ListNode{
	int val;
	ListNode next;
	ListNode(int x)
	{
		val = x;
	}
}

public class AddTwoNodes {
	public static ListNode addTwoList(ListNode l1,ListNode l2){
		ListNode head = new ListNode(0);
		ListNode p1,p2,p3;
		p1 = l1;
		p2 = l2;
		p3 = head;
		int count = 0;
		while ((p1 != null) || (p2 != null)) {
			if (p1 != null) {
				count += p1.val;
				p1 = p1.next;
			}
			if (p2 != null) {
				count += p2.val;
				p2 = p2.next;
			}
			
			p3.next = new ListNode(count % 10);
			p3 = p3.next;
			count = count / 10;
		}
		
		if (count == 1) {
			p3.next = new ListNode(1);
		}
		
		return head.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		
		ListNode l11 = new ListNode(0);
		ListNode l12 = new ListNode(0);
		
		ListNode l111 = new ListNode(4);
		ListNode l222 = new ListNode(6);
		
		l1.next = l11;
		l11.next = l111;
		l2.next = l12;
		l12.next = l222;
		
		ListNode l = addTwoList(l1, l2);
		
		while (l != null) {
			System.out.print(l.val);
			l = l.next;
		}
		
	}
}

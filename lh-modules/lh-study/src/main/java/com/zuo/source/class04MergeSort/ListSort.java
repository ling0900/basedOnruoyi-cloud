package com.zuo.source.class04MergeSort;

/**
 *@Author: lh
 *@CreateTime: 2022-04-27  17:36
 *@Description: TODO
 *@Version: 1.0
 */
public class ListSort {
	
	public class ListNode {
		int val;
		ListNode next;
		
		public ListNode() {
		}
		
		ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	//1.将整个链表对半分为左右
	
	public static ListNode divSort(ListNode head) {
		if (head.next == null) {
			return head;
		}
		
		// 开始分半
		ListNode L = head;
		ListNode R = head;
		ListNode temp = head;
		while (temp.next !=null) {
			R = head.next;
		}
		// 一人一半
		divSort(L);
		divSort(R);
		// merge
		return null;
	}
	
	
	//2.每个单独排序
	//3.然后合并
}

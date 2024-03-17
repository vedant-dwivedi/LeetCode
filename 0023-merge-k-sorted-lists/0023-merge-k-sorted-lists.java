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
    public ListNode mergeKLists(ListNode[] lists) {
         if(lists.length==0){return null;}

        if(lists.length==1){return lists[0];}
        ListNode head=lists[0];
        for (int i=1;i<lists.length;i++){
            head=mergeTwoLists(head,lists[i]);
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;

        while(temp1!=null && temp2!=null){

            if(temp1.val<temp2.val) {
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }

            else{
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }

        if(temp1==null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }

        return head.next;
    }
}
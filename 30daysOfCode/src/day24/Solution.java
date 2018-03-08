package day24;

/**
 * Created by himu on 3/5/2018.
 */
public class Solution {

    public static Node removeDuplicates(Node head){
//        Node temp = head;
//        Node temp2 = temp;
//        if(head == null || head.next ==null) return head;
//
//        while(temp.next != null){
//
//
//            while(temp2 != null && temp2.next != null){
//
//                if(temp.data == temp2.next.data){
//                    Node dup = temp2.next;
//                    temp2.next = temp.next.next;
//
//                }else temp2 = temp2.next;
//
//            }
//
//            temp = temp.next;
//        }
//        return head;


        if(head == null || head.next == null) return head;

        Node temp = head;

        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else temp = temp.next;

        }
        return head;
    }
}

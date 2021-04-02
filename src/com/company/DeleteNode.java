package com.company;

//Runtime: 100.00%
//Memory:  41.64%
public class DeleteNode {

    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode{

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

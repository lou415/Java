public class LinkListApplication {
    public static void main(String[] args) {
        ListNode node1;
        ListNode node2;
        ListNode node3;
        ListNode currNode;

        // creates the nodes. Nothing is linked yet.
        node1 = new ListNode(4);
        node2 = new ListNode(15);
        node3 = new ListNode(2002);

        // linking the nodes now.
        node1.insertNodeAfter(node2);
        node2.insertNodeAfter(node3);

        // now traverse through the linked list and print them out
        currNode = node1;
        while(currNode != null) {
            System.out.println(currNode.getNodeData());
            currNode = currNode.getNext();
        }






    }
}

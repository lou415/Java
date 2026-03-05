public class ListNode {
    private int nodeData;
    private ListNode nextNodeRef;

    public ListNode(){
        this.nodeData = 0;
        this.nextNodeRef = null;
    }

    public ListNode(int nodeData){
        this.nodeData = nodeData;
        this.nextNodeRef = null;
    }

    public int getNodeData(){
        return this.nodeData;
    }

    public ListNode getNext(){
        return this.nextNodeRef;
    }

    public void setNodeData(int dataToSet){
        this.nodeData = dataToSet;
    }

    public void setNext(ListNode reference){
        this.nextNodeRef = reference;
    }

    public void insertNodeAfter(ListNode nodeToInsert){
        nodeToInsert.nextNodeRef = this.getNext();
        this.nextNodeRef = nodeToInsert;
    }
}


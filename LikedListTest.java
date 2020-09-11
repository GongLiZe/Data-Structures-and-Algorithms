
public class LikedListTest {
       //节点
       class Node {
        int data;
        public Node next;
        Node(final int data){
            this.data=data;
        }  
    }
    Node head=null;
    //添加节点
    public void addNode(int d) {
        final Node newNode = new Node(d);
        //判断头是否为空
        if(head==null){
            head=newNode;
            return;
        }
        //如果不是空，就要从头开始，添加到最后
        Node tmp = head;
        while (tmp.next!=null) {
            tmp=tmp.next;
        }
        tmp.next=newNode;

    }
    //删除第几个节点,返回是否成功
    public boolean deleteNode(int index) {
        //超过范围
        if (index<1||index>length()) {
            return false;
        }
        //如果删除第一个点
        if (index==1) {
            head=head.next;
            return true;
        }
        //删除第二个以后的节点curNode
        int i=2;
        Node preNode=head; 
        Node curNode=preNode.next;
        while (curNode!=null) {
            if(i==index){
                preNode.next=curNode.next;
                return true;
            }
            preNode=curNode;
            curNode=curNode.next;
            i++;
        }
        return false;
    }
    //删除节点，把这个节点变成下一个节点,知道节点的名字
    public boolean deleteNodeData(Node n) {
        if (n==null || n.next==null) {
            return false;
        }
        int tmp=n.data;
        n.data=n.next.data;
        n.next.data=tmp;
        n.next=n.next.next;
        return true;
    }
    //输出列表
    public void PrintList() {
        Node tmp = head;
        while (tmp!=null) {
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }
    //计算长度
    public int length() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
    public static void main(final String[] args) {
    LikedListTest mylist = new LikedListTest();
        mylist.addNode(8);
        mylist.addNode(6);
        mylist.addNode(5);
        mylist.addNode(3);
        mylist.addNode(4);
        mylist.PrintList();//打印列表
        System.out.println("---删除第4个后--");
        mylist.deleteNode(4);
        mylist.PrintList();
        System.out.println("------");
       
    }
}

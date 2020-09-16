public class TreesTest {
    public static void main(String[] args) {
        //给树赋值
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        Node node3 = new Node(6);
        Node node4 = new Node(8);
        Node node5 = new Node(10);
        //把树画出来
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        //求和
        System.out.println("树的和为(30):"+sumValues(node1));
    }
    //通过递归求树的和
    static int sumValues(Node root){
        if (root==null) {
           return 0; 
        }
        return root.data+sumValues(root.left)+sumValues(root.right);
    } 
}
class Node{
    int data;
    Node left;
    Node right;
    //构造函数用于赋值 
    Node(int data){
        this.data=data;
    }
}
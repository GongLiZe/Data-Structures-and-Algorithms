public class ArrayStack {
    private int maxSize;//栈大小
    private long[]  stackArray;//数组栈
    private int top;//最上面的数的位置
    //构造函数，赋值
    ArrayStack(int s){
        maxSize=s;
        stackArray = new long[maxSize];
        top=-1;//数组从0开始有值
    }
    //判空
    public boolean isEmpty() {
        return top==-1;
    }
    //判满
    public boolean isFull() {
        return top==maxSize-1;
    }
    //添加
    public void push(long p) {
        stackArray[++top]=p;
    }
    //删除
    public long pop() {
        return stackArray[top--];
    }
    //最顶端的位置
    public long peek() {
        return stackArray[top];
    }
    public static void main(String[] args) {
        ArrayStack mystack = new ArrayStack(20);//实例一个ArrayStack存储结构（对象）
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        while (!mystack.isEmpty()) {
            System.out.println(mystack.pop()+" ");//删除最上面的值，返回那个值
        }
        for (int i=0;i<20;i++) {
            System.out.println(mystack.stackArray[i]);
        }
    }
}

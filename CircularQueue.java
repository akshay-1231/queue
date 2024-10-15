package queueexample;

public class CircularQueue {
	 private int Q[], MaxSize, front,rear;
	 int count;
	 

	    public void create_Queue(int size) {
	    	front=0;
	    	rear=-1;
	    	Q=new int[size];
	      //  tos = -1;//init tos
	        //stack = new int[size];//create stack
	        MaxSize = size;//init MaxSize
	        count=0;
	    }

	   public  void Enqueue(int e) {
	        rear++;
	        rear=(rear+1)%MaxSize;
	        count++;
	        Q[rear] = e;
	        System.out.println("Element " + e + " inserted in quque:");
	    }

	    boolean is_Full() {
	        if (count == MaxSize)
	            return true;
	        else
	            return false;
	    }

	 public   int Dequeue() {
	    	front=(front+1)%MaxSize;
	        int temp = Q[front];
	        count--;
	        return (temp);

	        //return(stack[tos--]);
	    }

	    public  boolean is_Empty() {
	        if (count==0)
	            return true;
	        else
	            return false;
	    }

	  //  int peek() {
	  //      return (stack[tos]);
	 //   }

	    void print_Queue() {//fifo print
	    	int i,c;
	    	i=front;
	    	c=0;
	    	while(c<count) {
	        System.out.println("queue[i]");
	       i=(i+1)%MaxSize;
	       c++;
	        }

	    }

}
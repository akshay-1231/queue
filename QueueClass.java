package queueexample;

public class QueueClass {
	 private int Q[], MaxSize, front,rear;
	 

	    public void create_Queue(int size) {
	    	front=0;
	    	rear=-1;
	    	Q=new int[size];
	      //  tos = -1;//init tos
	        //stack = new int[size];//create stack
	        MaxSize = size;//init MaxSize
	    }

	    void Enqueue(int e) {
	        rear++;
	        
	        Q[rear] = e;
	        System.out.println("Element " + e + " inserted in quque:");
	    }

	    boolean is_Full() {
	        if (rear == MaxSize - 1)
	            return true;
	        else
	            return false;
	    }

	    int Dequeue() {
	        int temp = Q[front];
	        front++;
	        return (temp);

	        //return(stack[tos--]);
	    }

	    boolean is_Empty() {
	        if (front>rear)
	            return true;
	        else
	            return false;
	    }

	  //  int peek() {
	  //      return (stack[tos]);
	 //   }

	    void print_Queue() {//fifo print
	        System.out.println("queue has");
	        for (int i = front; i<=rear; i++) {
	            System.out.print(Q[i]);
	        }

	    }
}

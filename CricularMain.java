package queueexample;

import java.util.Scanner;

public class CricularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CircularQueue obj = new CircularQueue  ();// object created System.out.println("Enter size of stack:");
		int size = sc.nextInt();
		obj.create_Queue(size);
		int ch, e;
		do {
			System.out.println("queue Menu");
			System.out.println("-----------");
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			//System.out.println("3.Peek");
			System.out.println("4.Print all elements");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (obj.is_Full() != true)// not full
				{
					System.out.println("Enter a number:");
					e = sc.nextInt();
					obj.Enqueue(e);
				}

				else
					System.out.println("Stack Full");

				break;
			case 2:
				if (obj.is_Empty() != true)// not empty
				{
					System.out.println("Element poped is " + obj.Dequeue());
				}

				else
					System.out.println("Stack Empty");

				break;
			//case 3:
			//	if (obj.is_Empty() != true)// not empty
			//	{
				//	System.out.println("Element @peek is " + obj.peek());
			//	}

			//	else {
					//System.out.println("Stack Empty");
			//	}

				//break;
			case 4:
				if (obj.is_Empty() != true)// not empty
				{
					System.out.println("Elements in queue are\n");
					obj.print_Queue();
				} else {
					System.out.println("Q Empty");
				}

				break;
			case 0:
				System.out.println("Thanks for using code , coded by amartechnavigator");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;

			}
		} while (ch != 0);
	}
	}



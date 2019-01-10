package training.stack;

public class FixedArray {
	
	private static int top=-1;
	//private String[] arr;
	public static int max;
	public FixedArray(int capacity) {
		
		max=capacity;
		//System.out.println("Max="+capacity);
	}
	
	/*public static void main(String args[])
	{
		String arr[] = new String[10];
		push("lol",arr);
		push("bkc",arr);
		display(arr);
		pop(arr);
		pop(arr);
		pop(arr);
	}*/
	 void push(String input, String arr[])
	{
		if(top==max)
		{
			System.out.println("Stack full");
			return;
		}
		else
		{
			top++;
			arr[top]=input;
		}
	}
	 void pop(String arr[])
	{
		if(top==-1)
		{
			System.out.println("Stack Empty");
			return;
		}
		else
		{
			top--;
		}
	}
	 void display(String arr[])
	{
		for(int i=0;i<=top;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}

package training.stack.networking.Threading;

public class FirstTask implements Runnable{

	int sin;
	int ein;
	int[] data;

	public FirstTask(int sin, int ein, int[] data)
	{
		this.sin = sin;
		this.ein = ein;
		this.data = data;
	}

	public void run()
	{
		//Thread.sleep(1000);
		int sum=0;
		for(int i=sin;i<ein;i++)
		{
			sum = sum+data[i];
		}
		System.out.println("Thread Name"+Thread.currentThread().getName()+" sin="+sin+" ein="+ein+" sum="+sum);
		//System.out.println("Thread id"+Thread.currentThread().getId());
	}

	private void FirstTask(int sin, int ein) {
		// TODO Auto-generated method stub

	}
}

package training.stack.networking.Threading;

import java.util.concurrent.Callable;

public class SecondTask implements Callable{

	int sin;
	int ein;
	int[] data;

	public SecondTask(int sin, int ein, int[] data)
	{
		this.sin = sin;
		this.ein = ein;
		this.data = data;
	}

	public Integer call()
	{
		//Thread.sleep(1000);
		int sum=0;
		for(int i=sin;i<ein;i++)
		{
			sum = sum+data[i];
		}
		System.out.println("Thread Name"+Thread.currentThread().getName()+" sin="+sin+" ein="+ein+" sum="+sum);
		//System.out.println("Thread id"+Thread.currentThread().getId());
		return sum;
	}

	private void SecondTask(int sin, int ein) {
		// TODO Auto-generated method stub

	}
}

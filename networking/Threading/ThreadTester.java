package training.stack.networking.Threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTester {

	public static void main(String[] args) {

		int[] arr = {1,2,4,5,6,7,8,9,11,22,44,55,3,14,15};
		
		/*
		 * Thread thread1 = new Thread(new FirstTask(0,4,arr)); Thread thread2 = new
		 * Thread(new FirstTask(5,9,arr)); Thread thread3 = new Thread(new
		 * FirstTask(10,14,arr));
		 * 
		 * thread1.start(); thread2.start(); thread3.start();
		 */
		
		//create pool
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<Integer> f1 = service.submit(new SecondTask(0,4,arr));
		Future<Integer> f2 = service.submit(new SecondTask(5,9,arr));
		Future<Integer> f3 = service.submit(new SecondTask(10,14,arr));
		
		Integer result1 = null, result2=null, result3=null;
		
		//blocking
		try {
			result1 = f1.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//blocking
		try {
			result2 = f2.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//blocking
		try {
			result3 = f3.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(result1+" "+result2+" "+result3);
		
		/*for(int i=0;i<10;i++)
		{
			Thread thread = new Thread(new FirstTask());
			thread.start();
		}*/
		
		System.out.println("Main Function"+Thread.currentThread().getName());
	}

}

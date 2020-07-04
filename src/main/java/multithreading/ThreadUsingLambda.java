package multithreading;

public class ThreadUsingLambda {

	public void lambdaExp() throws InterruptedException {
		Thread t1 = new Thread(() -> {
			System.out.println("Thread1");
		});

		Thread t2 = new Thread(() -> {
			System.out.println("Thread2");
		});

		t1.start();
		Thread.sleep(300);
		t2.start();
	}

}

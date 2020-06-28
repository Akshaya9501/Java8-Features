package utility;

public class RunnableThread {
	public void callThread() {
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

	public class Thread1 implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 4; i++) {
				System.out.println("hii");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public class Thread2 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 4; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

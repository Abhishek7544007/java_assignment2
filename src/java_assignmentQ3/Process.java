package java_assignmentQ3;

public class Process implements Runnable {

	@Override
	public void run() {
		System.out.println("Processing start " + Thread.currentThread().getName());
		try {
			// Get database connection, delete unused data from DB
			fetchData();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Processing end  " + Thread.currentThread().getName());
	}

	private void fetchData() throws InterruptedException {
		Thread.sleep(5000);
	}

}
package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class methodtry {
	@Test(timeOut = 1000, priority = 1, enabled = false)
	public void TC01() throws InterruptedException {
		Reporter.log("tc01 for dashboard is executed", true);
		Thread.sleep(2000);

	}

	@Test
	public void TC02() {
		Reporter.log("TC02 is login is executed", true);

	}

	@Test
	public void TC03() {
		Reporter.log("TC03 for Buy order is executed", true);
	}

}

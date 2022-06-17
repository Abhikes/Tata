package testCase;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1 {
	@Test
	public void tc1() throws IOException, InterruptedException
	{
		Reporter.log("Hello",true);
		//driver.findElement(By.id("taskSearchControl_field")).sendKeys(d.Excel_Fetch("Sheet1", 1, 1));
		Thread.sleep(3000);
	}

}

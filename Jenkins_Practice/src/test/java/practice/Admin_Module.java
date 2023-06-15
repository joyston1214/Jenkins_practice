package practice;

import static org.testng.Assert.assertFalse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Admin_Module {

	@Test
	public void admin()
	{
		System.out.println("successfully created Admin Module");
		Reporter.log("successfully created Admin Module");
		assertFalse(true, "fail");
	}
}

package practice;

import static org.testng.Assert.assertFalse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login_Module {

	@Test
	public void login()
	{
		System.out.println("Successfully created Login Module");
		Reporter.log("Successfully created Login Module");
		//assertFalse(true, "fail");
	}
}

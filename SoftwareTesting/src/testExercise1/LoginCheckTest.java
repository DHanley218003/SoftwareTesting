package testExercise1;
import junit.framework.TestCase;

public class LoginCheckTest extends TestCase 
{
    public void thisAlwaysPasses() {
        assertTrue(true);
    }
	
	//Test #:
	//Test objective:
	//Input(s):
	//Expected output(s):
	
	//Test #1:
	//Test objective: test userName of < 6 characters
	//Input(s): userName = "usrnm"
	//Expected output(s): false
	
	public void loginCheckTest0001()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertFalse(loginCheckTest.validateUserName("usrnm"));
	}
	
	//Test #2:
	//Test objective: test userName of > 6 and < 15 characters
	//Input(s): userName = "username test"
	//Expected output(s): true
	
	public void loginCheckTest0002()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertTrue( loginCheckTest.validateUserName("username test"));
	}
	
	//Test #3:
	//Test objective: test userName of > 15 characters
	//Input(s): userName = "username test greater than"
	//Expected output(s): false
	
	public void loginCheckTest0003()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertFalse(loginCheckTest.validateUserName("username test greater than"));
	}
}

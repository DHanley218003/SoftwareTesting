package testExercise1;
import junit.framework.TestCase;

public class LoginCheckTest extends TestCase 
{
    public void testThisAlwaysPasses() {
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
	
	public void testvalidateUserName0001()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertFalse(loginCheckTest.validateUserName("usrnm"));
	}
	
	//Test #2:
	//Test objective: test userName of > 6 and < 15 characters
	//Input(s): userName = "username test"
	//Expected output(s): true
	
	public void testvalidateUserName0002()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertTrue( loginCheckTest.validateUserName("username test"));
	}
	
	//Test #3:
	//Test objective: test userName of > 15 characters
	//Input(s): userName = "username test greater than"
	//Expected output(s): false
	
	public void testvalidateUserName0003()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertFalse(loginCheckTest.validateUserName("username test greater than"));
	}
	
	//Test #4:
	//Test objective: test password of < 4 characters
	//Input(s): userName = "pwd"
	//Expected output(s): false
	
	public void testvalidatePassword0001()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertFalse(loginCheckTest.validatePassword("pwd"));
	}
	
	//Test #5:
	//Test objective: test password of > 4 and < 9 characters
	//Input(s): userName = "passwd"
	//Expected output(s): false
	
	public void testvalidatePassword0002()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertTrue(loginCheckTest.validatePassword("passwd"));
	}
	
	//Test #6:
	//Test objective: test password of > 9 characters
	//Input(s): userName = "password test greater than"
	//Expected output(s): false
	
	public void testvalidatePassword0003()
	{
		LoginCheck loginCheckTest = new LoginCheck();
		
		assertFalse(loginCheckTest.validatePassword("password test greater than"));
	}
}

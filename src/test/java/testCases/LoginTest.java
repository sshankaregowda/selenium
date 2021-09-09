package testCases;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void setUp(){
            initialization();
        }

    @Test(priority=1)
    public void loginPageTitleTest(){

        }
}

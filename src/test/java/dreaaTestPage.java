import org.testng.Assert;
import org.testng.annotations.Test;

public class dreaaTestPage {
	dressPageObject dp;
	
	
	
	 public dreaaTestPage(){
		 dp=new dressPageObject();
	 }
	 @Test
	 public void verifyButten(){
		 dp.clickdress();
		 Assert.assertTrue(dp.elementFound(dp.Dressbtn()), "failed");
		 Assert.assertTrue(dp.elementFound(dp.Dressbtn1()), "failed");
		 Assert.assertTrue(dp.elementFound(dp.Dressbtn2()), "failed");
		 Assert.assertTrue(dp.elementFound(dp.Dressbtn3()), "failed");
	 }
	 

}


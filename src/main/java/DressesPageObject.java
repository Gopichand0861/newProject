import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObject extends BasePage {
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dreesestab;
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtheader;
	@FindBys(@FindBy(xpath="//ul[@class='product_list row grid']"))
	private List<WebElement> stProduct;
	
	public DressesPageObject(){
		PageFactory.initElements(driver, this);
	}
	public int getproductNumberFromHeader(){
		String text =txtheader.getText();
		String[]arr=text.split(" ");
		String value =arr[2];
		int number = Integer.parseInt(value);
		return number; 
		//return Integer.parseInt(txtheader.getText().split(" "));
	}
	public int getProductCount(){
		return stProduct.size();
	}

}

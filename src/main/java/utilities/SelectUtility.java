package utilities;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	private static Select sel;
	public static void selectOption(WebElement ele,int optNo) {
		sel=new Select(ele);
		sel.selectByIndex(optNo);
	}
	public static void selectOption(WebElement ele,String optvalue) {
		sel=new Select(ele);
		sel.selectByValue(optvalue);
	}
	public static void selectOptionByVisibleText(WebElement ele,String optText) {
		sel=new Select(ele);
		sel.selectByValue(optText);
	}
	public static void deselectOptionByVisibleText(WebElement ele,String optText) {
		sel=new Select(ele);
		sel.deselectByVisibleText(optText);
	}
	public static void deselectOption(WebElement ele,int optNo) {
		sel=new Select(ele);
		sel.deselectByIndex(optNo);
	}
	public static void deselectOption(WebElement ele,String optvalue) {
		sel=new Select(ele);
		sel.deselectByValue(optvalue);
	}
	public static void deselectAll(WebElement ele) {
		sel=new Select(ele);
		sel.deselectAll();
	}
	public static List<WebElement> getOptions(WebElement ele) {
		sel=new Select(ele);
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		return allSelectedOptions;
	}
}

package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility {
	private static Actions act;
	public static void rightClick(WebDriver wd,WebElement ele) {
		act=new  Actions(wd);
		act.contextClick(ele).build().perform();
	}
	public static void doubleClick(WebDriver wd,WebElement ele) {
		act=new  Actions(wd);
		act.doubleClick(ele).build().perform();
	}
	public static void moveToElement(WebDriver wd,WebElement ele) {
		act=new  Actions(wd);
		act.moveToElement(ele).click().sendKeys(Expected_ExcelData.getData("data", 0, 0)).build().perform();
	}
	public static void dragAndDrop(WebDriver wd,WebElement src,WebElement target) {
		act=new  Actions(wd);
		act.dragAndDrop(src, target).build().perform();
	}
}

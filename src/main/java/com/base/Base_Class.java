package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static void maxi(WebDriver d) {
		d.manage().window().maximize();
	}
	public static void fullScreen(WebDriver d) {
		d.manage().window().fullscreen();
	}
	public static void mini(WebDriver d) {
		d.manage().window().minimize();
	}
	public static void getSize(WebDriver d) {
		d.manage().window().getSize();
	}
	public static void setSize(WebDriver d,Dimension e) {
		d.manage().window().setSize(e);
	}
	public static void url(WebDriver d, String s) {
		d.get(s);
	}

	public static void click(WebElement e) {
		e.click();
	}
	public static void close(WebDriver e) {
		e.close();
	}
	public static void end(WebDriver e) {
		e.quit();
	}

	public static void send_Keys(WebElement e, String a) {
		e.sendKeys(a);
	}

	public static void select_Index(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
	}
	public static void select_Byvalue(WebElement e, String a) {
		Select s = new Select(e);
		s.selectByValue(a);
	}
	public static void select_Byvisible(WebElement e, String a) {
		Select s = new Select(e);
		s.selectByVisibleText(a);
	}
	
	public static void alert_Accept(WebDriver d) {
		Alert a = d.switchTo().alert();
		a.accept();
		
	}
	public static void alert_Dismiss(WebDriver d) {
		Alert a = d.switchTo().alert();
		a.dismiss();
		
	}
	public static void alert_Sendkeys(WebDriver d,String b) {
		Alert a = d.switchTo().alert();
		a.sendKeys(b);
  }
	public static void alert_getText(WebDriver d) {
		Alert a = d.switchTo().alert();
		a.getText();
  }
	
	public static void right_Click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();
	}
	public static void click_Ac(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();
	}
	
	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	
	
	
	
	
	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.navegadorserendipity;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author utpl
 */
public class Navegador {

    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();  // Robot class throws AWT Exception  
        WebDriver driver = new FirefoxDriver();
        driver.get("http://serendipity.utpl.edu.ec/");
        robot.delay(5000);
        //element.sendKeys("java");
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        for (int i = 0; i < list.size(); i++) {
            WebElement element = driver.findElement(By.name("q"));
            String word = list.get(i);
            type(word, element, robot);
            element.submit();
            System.out.println("Page title is: " + driver.getTitle());
            robot.delay(5000);
            JavascriptExecutor jsx = (JavascriptExecutor) driver;
            //int y = 350;
            for (int j = 0; j < 16; j++) {
                jsx.executeScript("window.scrollBy(0, 350)", "");
                robot.delay(2000);
                //y += 350;
            }
            //jsx.executeScript("window.scroll(0, -250);");
            for (int j = 0; j < 120; j++) {
                jsx.executeScript("window.scrollBy(0, -50)", "");
                robot.delay(250);
            }
            jsx.executeScript("window.scroll(0, -50);");
            robot.delay(5000);
            WebElement reset = driver.findElement(By.id("resetBtn"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", reset);
        }
        //jsx.executeScript("window.history.go(-1)");
        //robot.delay(5000);
        driver.quit();

    }

    private static void type(String s, WebElement element, Robot robot) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            element.sendKeys(c + "");
            robot.delay(200);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.navegadorserendipity;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author utpl
 */
public class Navegador {

        
    static List<String> list = new ArrayList<>();
    
    public void Navegador(){
        
    }
    
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();  // Robot class throws AWT Exception  
        WebDriver driver = new FirefoxDriver();
        while(true){
        driver.manage().window().maximize();
        driver.get("https://example1-marlonvinan.c9users.io/example2/");
        robot.delay(10000);
        driver.get("http://serendipity.utpl.edu.ec/");
        robot.delay(5000);
        //element.sendKeys("java");
        list.clear();
        list.add("java");
        list.add("estadistica");
        list.add("física");
        list.add("matematicas");
        list.add("quimica");
        list.add("biología");
        list.add("anatomía");
        list.add("electrónica");
        list.add("finanzas");
        list.add("politica");
        list.add("calculo");
        list.add("analisis de datos");
        list.add("gastronomy");
        list.add("robotica");
        list.add("robotica");
        list.add("fisiologia");
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int value = random.nextInt(list.size());
            System.out.println("aleaotrio: " + value);
            WebElement element = driver.findElement(By.name("q"));
            String word = list.get(value);
            type(word, element, robot);
            element.submit();
            System.out.println("Page title is: " + driver.getTitle());
            robot.delay(5000);
            WebElement txt = driver.findElement(By.className("text-success"));
            int num = 0;
            for (StringTokenizer stringTokenizer = new StringTokenizer(txt.getText()); stringTokenizer.hasMoreTokens();) {
                String token = stringTokenizer.nextToken();
                num = Integer.parseInt(token);
                break;
            }
            int numveces = 0;
            if(num > 16){
                numveces = 16;
            }else if(num > 0 ){
                numveces = num;
            }
            System.out.println(">>>>>>>>>>>>>>>  "+txt.getText());
            JavascriptExecutor jsx = (JavascriptExecutor) driver;
            //int y = 350;
            for (int j = 0; j < numveces; j++) {
                jsx.executeScript("window.scrollBy(0, 350)", "");
                robot.delay(2000);
                //y += 350;
            }
            //jsx.executeScript("window.scroll(0, -250);");
            for (int j = 0; j < numveces*8; j++) {
                jsx.executeScript("window.scrollBy(0, -50)", "");
                robot.delay(250);
            }
            jsx.executeScript("window.scroll(0, -50);");
            
            
            if(num > 0){
                WebElement primer = driver.findElement(By.xpath("//div[@class='span9']"));
                WebElement seg = primer.findElement(By.xpath("//div[@class='span6 thumbnail']"));
                WebElement ter = seg.findElement(By.xpath("//a[@class='fancybox fancybox.iframe']"));
                System.out.println(ter.getAttribute("href"));
                ter.sendKeys("");
                robot.delay(5000);
                driver.get(ter.getAttribute("href"));
                robot.delay(10000);
                driver.navigate().back();
                robot.delay(10000);
            }
            
            
            
            WebElement reset = driver.findElement(By.id("resetBtn"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", reset);
            
        }
        
        }
        //jsx.executeScript("window.history.go(-1)");
        //robot.delay(5000);
        //driver.quit();

    }

    private static void type(String s, WebElement element, Robot robot) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            element.sendKeys(c + "");
            robot.delay(200);
        }
    }

}

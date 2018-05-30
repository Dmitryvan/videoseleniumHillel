import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dmyv on 9/19/16.
 */
public class Ap00 {
    public static void main (String[] args) throws Exception

    {
        WebDriver webDriver = new FirefoxDriver();


        webDriver.get("http://it-ebooks.info/");

        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());

        // find title, click radiobutton
        webDriver.findElement(By.cssSelector("input[value='title']")).click();
        // find search field and clear
        webDriver.findElement(By.id("q")).clear();
        // find search field and enter Automation
        webDriver.findElement(By.id("q")).sendKeys("Automation");
        // tap Search button
        webDriver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(10000);
        webDriver.quit();

       }
    }

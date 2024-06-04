package Pages;

import Framework.Core.CoreObjects;
import Framework.Utilities.ConfigurationReader;
import org.openqa.selenium.By;

public class MainPage extends CoreObjects {

    static By add = By.cssSelector("input[id='add']");
    static By subtract = By.id("subtract");
    static By multiply = By.id("multiply");
    static By divide = By.id("divide");
    static By result = By.cssSelector("#display div");
    static By clear = By.cssSelector("input[value='C']");
    static By equal = By.cssSelector("input[value='=']");
    static String digitTemplate = "input[value='%s']";


    public void openCalculator() {
        driver.get(ConfigurationReader.get("url"));
    }

    public void addNumbers(String numbers) {
        String digit = "";
        int[] num = retrieveNumbers(numbers);

        for (int each : num) {
            digit = String.format(digitTemplate, each);
            driver.findElement(By.cssSelector(digit)).click();
            driver.findElement(add).click();
        }
        driver.findElement(equal).click();
    }

    public void substractNumbers(String numbers) {
        String digit = "";
        int[] num = retrieveNumbers(numbers);

        for (int each : num) {
            digit = String.format(digitTemplate, each);
            driver.findElement(By.cssSelector(digit)).click();
            driver.findElement(subtract).click();
        }
        driver.findElement(equal).click();
    }

    public void multiplyNumbers(String numbers) {
        String digit = "";
        int[] num = retrieveNumbers(numbers);

        for (int each : num) {
            digit = String.format(digitTemplate, each);
            driver.findElement(By.cssSelector(digit)).click();
            driver.findElement(multiply).click();
        }
        driver.findElement(equal).click();
    }

    public void divideNumbers(String numbers) {
        String digit = "";
        int[] num = retrieveNumbers(numbers);

        for (int each : num) {
            digit = String.format(digitTemplate, each);
            driver.findElement(By.cssSelector(digit)).click();
            driver.findElement(divide).click();
        }
        driver.findElement(equal).click();
    }

    public Integer getResult() {
        return Integer.valueOf(driver.findElement(result).getText());
    }

    public static int[] retrieveNumbers(String str) {
        String[] digits = str.split(",");
        int[] n = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            n[i] = Integer.parseInt(digits[i].trim());
        }
        return n;
    }

    public void clearCalculator() {
        driver.findElement(clear).click();
    }
}


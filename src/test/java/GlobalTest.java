import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GlobalTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Desktop\\InegradorII-Testing\\Driver - Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://integrador2.test/login");
    }

    @Test(testName = "Login", priority = 1)
    public void Login() {
        WebElement mail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        mail.sendKeys("rene@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("123456789");
        WebElement button = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[4]/button"));
        button.click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    @Test(testName = "ProductsAdmin", priority = 2)
    public void FunctionsAdmin() {
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div/div[2]/div/a[3]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div/div/table/tbody/tr[1]/td[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[1]/div[1]/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[1]/div[1]/select/option[4]")).click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[1]/div[2]/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[1]/div[2]/select/option[2]")).click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        WebElement nameproduct= driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[2]/input"));
        nameproduct.clear();
        nameproduct.sendKeys("Play Station 5");
        WebElement description= driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[4]/div/div/div[2]/div/p"));
        description.clear();
        description.sendKeys("PlayStation 5 es la primera consola de Sony que incorpora una unidad óptica cuya mecánica de transporte es capaz de leer discos Blu-ray 4K.");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[5]/div[1]/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[5]/div[1]/select/option[4]")).click();
        WebElement price=driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[5]/div[2]/input"));
        price.clear();
        price.sendKeys("3399.90");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[7]/button")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    @Test(testName = "OrdersAdmin", priority = 3)
    public void OrdersAdmin() {
        driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div/div[1]/div[2]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/section[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/form/div[1]/label[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/form/div[2]/button")).click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/form/div[1]/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/form/div[2]/button")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    @Test(testName = "Marcas", priority = 4)
    public void Marcas() {
        driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div/div[1]/div[2]/a[4]")).click();
        WebElement nombre= driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div[2]/form/div[1]/div/div/input"));
        nombre.click();
        nombre.sendKeys("SONY");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div[2]/form/div[2]/button")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div[2]/div/table/tbody/tr[21]/td[2]/div/a[2]")).click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    @Test(testName = "Places", priority = 5)
    public void Places() {
        driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div/div[1]/div[2]/a[5]")).click();
        WebElement nombre= driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div[2]/form/div[1]/div/div/input"));
        nombre.click();
        nombre.sendKeys("CALLAO");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div[2]/form/div[2]/button")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div[2]/div/table/tbody/tr[9]/td[2]/div/a[2]")).click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
    }

    @Test(testName = "Users", priority = 6)
    public void users() {
        driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div/div[1]/div[2]/a[6]")).click();
        WebElement user=driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div/div/div[1]/input"));
        user.sendKeys("prueba");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div/div/table/tbody/tr/td[5]/label[2]/input")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div/div/table/tbody/tr/td[5]/label[1]/input")).click();
    }


    @Test(testName = "RegisterUsers", priority = 7)
    public void RegisterUsers() {
        driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div/div[2]/div/div/div[1]/button/img")).click();
        driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div/div[2]/div/div/div[2]/div/form/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div/div[1]/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div/div[2]/div/a[2]")).click();
        /*Registro*/
        WebElement nombre=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        nombre.sendKeys("integrador");
        WebElement mail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        mail.sendKeys("integrador@gmail.com");
        WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("esconTra45");
        WebElement repass=driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]"));
        repass.sendKeys("esconTra45");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[5]/button")).click();
    }
}



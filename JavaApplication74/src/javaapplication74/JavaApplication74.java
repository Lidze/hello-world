public class WiniumDemo {  
    public static void main(String[] args) throws         MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app","C:\\Windows\\system32\\программа.exe");
        cap.setCapability("launchDelay","5");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9999"),cap);

        WebElement window = driver.findElement(By.className("тут класс нейм программы"));

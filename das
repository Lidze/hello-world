Краткий курс 

1)АТ - основы
пример хром

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Chrome {

    private static WebDriver driver;
    private static WebElement element;

    @BeforeClass
    public static void starterChrome() {
        System.setProperty("webdriver", "C:\\sel\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://habr.com/");
    }
    @Test
    public void test1() {
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/a[2]"));
        element.click();
    }
    @Test
    public void test2(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[3]/div/input"));
        element.sendKeys("lm123123@yandex.ru");
    }
    @Test
    public void test3(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[4]/div/input"));
        element.sendKeys("ildfjajfjs");
    }
    @Test
    public void test4(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[5]/div/input"));
        element.sendKeys("31233123q");
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[6]/div/input"));
        element.sendKeys("31233123q");
    }
    @Test
    public void test5(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[7]/div/label/span[1]"));
        element.click();
    }
    @Test
    public void test6(){
        element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a[2]"));
        element.click();
    }

    @AfterClass
    public static void ret() {
        WebElement exitButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a[1]"));
        exitButton.click();
        driver.quit();
    }
}


пример калькулятор по средствам виниум

public class WiniumDemo {  
    public static void main(String[] args) throws         MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app","C:\\Windows\\system32\\calc.exe");
        cap.setCapability("launchDelay","5");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9999"),cap);

        WebElement window = driver.findElement(By.className("CalcFrame"));

        window.findElement(By.id("132")).click();//2
        window.findElement(By.id("93")).click();//+
        window.findElement(By.id("134")).click();//4
        window.findElement(By.id("92")).click();//*
        window.findElement(By.id("134")).click();//4
        window.findElement(By.id("121")).click();//=

        driver.close();
    }
}


2) Linuх - базовые команды

ls(аналог dir в виндоус) - Выводит список файлов и каталогов по порядку
mkdir - создать папку
rmdir - удалить папку
cd - перейти в выбранный каталог



3)git
первая инициализация репозитория
{
echo "# ddasda" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/Lidze/ddasda.git
git push -u origin master
}

базовые команды:
git add*
git commit -m "комит"
git push -u origin master

скачать репозиторий git clone (ссылка)

4)SQL базовые операторы
 - Операторы описания данных:
CREATE, DROP, ALTER.

 - Операторы манипуляции данными:
INSERT-загрузить 
DELETE-удалить
SELECT-выгрузить
UPDATE-обновить

основы тестирования
        -----регрессионное тестирование - собирательное название для всех видов тестирования программного обеспечения,
направленных на обнаружение ошибок в уже протестированных участках исходного кода.
        -----функциональное тестирование - это тестирование ПО в целях проверки реализуемости функциональных требований,
то есть способности ПО в определённых условиях решать задачи, нужные пользователям. 
        -----Интеграцио́нное тести́рование — одна из фаз тестирования программного обеспечения,
при которой отдельные программные модули объединяются и тестируются в группе.
        -----Нефункциональное тестирование описывает тесты,
необходимые для определения характеристик программного обеспечения, которые могут быть измерены различными величинами.
Приемочное пользовательское тестирование (UAT — User Acceptance Testing) – тестирование, которое проводится конечными пользователями системы с целью принятия решения о внедрении.
        -----Автоматизированное тестирование - это процесс верификации программного обеспечения, при котором основные функции и шаги теста, такие как запуск,
инициализация, выполнение, анализ и выдача результата, выполняются автоматически
        -----Нагрузочное тестирование (англ. load testing) — подвид тестирования производительности,
сбор показателей и определение производительности и времени отклика программно-технической системы или
устройства в ответ на внешний запрос с целью установления соответствия требованиям, предъявляемым к данной системе

методы тестирования 
        Тестирование чёрного ящика или поведенческое тестирование — стратегия (метод) тестирования функционального поведения объекта (программы, системы) с точки зрения внешнего мира, 
при котором не используется знание о внутреннем устройстве тестируемого объекта
        Тестирование белого ящика (англ. white-box testing), также тестирование стеклянного ящика , 
структурное тестирование (англ. structural testing) — тестирование, которое учитывает внутренние механизмы системы или компонента (ISO/IEC/IEEE 24765)[1].






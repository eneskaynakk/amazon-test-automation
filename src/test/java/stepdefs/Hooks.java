package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utility.Driver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void tearDown() {
        if (Driver.getDriver() != null) {
            Driver.closeDriver();
        }
    }
}


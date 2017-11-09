
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import static com.sazzad.initiator.DriverSetup.setup;

@RunWith(Cucumber.class)

@CucumberOptions(
        format= {
                "pretty", "html:reports/test-report"
        },
        glue={
                "classpath:com/sazzad/stepDefinition"
        },
        features = {
                "src/test/resources"
        },
        tags = {
                "@createreport"
        }


)
public class CucumberRunner{
    @BeforeClass
    public static void DriverInitiate()
    {
        setup();
    }
/*        @AfterClass
        public static void DriverQuit(){
               // driver.quit();
        }*/
}

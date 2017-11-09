
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import static com.sazzad.stepDefinitions.DriverSetup.setup;

@RunWith(Cucumber.class)

@CucumberOptions(
        format= {
                "pretty", "html:reports/test-report"
        },
        glue={
                "classpath:com/sazzad/stepDefinitions"
        },
        features = {
                "src/test/resources"
        },
        tags = {
                //"@2+2"
                //"@GoogleCalculatorTest"
                //"@tracker"
               // "@nestingWithoutAllVars"
                //"@test101"
                //"@createreport"
                "@fileWrite"
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

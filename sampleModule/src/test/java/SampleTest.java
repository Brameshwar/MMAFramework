import com.mma.annotations.TestInfo;
import com.mma.core.BaseFrontEndTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SampleTest extends BaseFrontEndTest {

    private final Logger logger = LoggerFactory.getLogger(SampleTest.class);

    @Test
    @TestInfo(
            testId = "TC_001",
            testOwner = "Bramesh",
            testFeature = "Sample",
            testRailIds = "1234"
    )
    public void test(){
        logger.info("testing");
    }

}

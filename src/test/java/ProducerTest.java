// ProducerTest.java

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/broker.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class ProducerTest {

    @Test
    @Scenario("test_cases/orderMessages.json")  //JSON tests file
    public void verifySuccessfulCreationOfOrderDetailsMessageInBroker() throws Exception {

    }
}
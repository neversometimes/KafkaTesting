// ProducerTest.java

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/*  This test scenario requires a Docker container (Compose.kafka-1) to be started and running.
    This container is the kafka broker found at https://localhost:9092 referenced in broker.properties.

    To see all the messages sent (after the test passes), run from CLI:
    % docker exec -it compose-kafka-1 bash
    root@58b8a2936e2: /#  kafka-console-consumer --bootstrap-server kafka:29092 --topic orders --from-beginning

*/


@TargetEnv("kafka_servers/broker.properties")  // the kafka "broker" manages the producer/consumer event streaming
@RunWith(ZeroCodeUnitRunner.class)
public class ProducerTest {

    @Test
    @Scenario("test_cases/orderMessages.json")  //JSON tests file for producer and consumer messages
    public void verifySuccessfulCreationOfOrderDetailsMessageInBroker() throws Exception {

    }
}
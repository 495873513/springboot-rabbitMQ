package dabaojian;

import com.ProviderApplication;
import com.dabaojian.rabbitmqProvider.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class RabbitTest {

    @Autowired
    private WorkQuene workQuene;

    @Autowired
    private HelloWorld helloWorld;

    @Autowired
    private PubSubQueue pubSubQueue;

    @Autowired
    private RoutingQueue routingQueue;

    @Autowired
    private TopicQueue topicQueue;

    @Test
    public void sendHelloWorld(){
        for (int i = 15; i < 20; i++) {
            helloWorld.sendHelloWorld("我是Hello World的第"+i+"消息");
        }
    }

    @Test
    public void sendMessage(){
        for (int i = 0; i < 10; i++) {
            workQuene.sendsendMessage("我是Wrok Quene的第"+i+"消息");
        }
    }

    @Test
    public void pubSubQueue(){
        for (int i = 3; i < 5; i++) {
            pubSubQueue.pubSubMessage("我是PUB/SUB的第"+i+"消息");
        }
    }

    @Test
    public void RouteMessage(){
        for (int i = 0; i < 3; i++) {
            routingQueue.routeMessage("rout1","rout1的第"+i+"条消息");
        }
    }

    @Test
    public void topicMessage(){
        for (int i = 0; i < 3; i++) {
            topicQueue.topicMessage("topics.messages.error","topic的第"+i+"条消息");
        }
    }

}

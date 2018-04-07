package actdoc;

import org.osgl.inject.annotation.Configuration;
import org.osgl.mvc.annotation.GetAction;

import java.util.List;

public class Test {

    @Configuration("greets")
    private List<GreetingService> greetingServices;

    @GetAction("test")
    public Object greetingList() {
        return greetingServices;
    }

}

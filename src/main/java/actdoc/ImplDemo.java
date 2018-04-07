package actdoc;

import act.util.JsonView;
import org.osgl.inject.annotation.Configuration;
import org.osgl.mvc.annotation.GetAction;

import java.util.List;
import java.util.Map;

public class ImplDemo extends ConfigDemoBase {

    @Configuration("greet.default")
    private GreetingService defaultService;

    @Configuration("greet.west")
    private GreetingService westService;

    @Configuration("greet.east")
    private GreetingService eastService;

    @Configuration("greet")
    private Map<String, GreetingService> greetingServiceMap;

    @Configuration("greets")
    private List<GreetingService> greetingServices;

    @GetAction("greet/list")
    @JsonView
    public Object greetingList() {
        return greetingServices;
    }

    @GetAction("greet/all")
    public Object allGreetings() {
        return greetingServiceMap;
    }

    @GetAction("greet")
    public String greetDefault() {
        return defaultService.greet();
    }

    @GetAction("greet/west")
    public String greetWest() {
        return westService.greet();
    }

    @GetAction("greet/east")
    public String greetEast() {
        return eastService.greet();
    }

}

package actdoc;

public class HelloService implements GreetingService {
    @Override
    public String greet() {
        return "Hello";
    }
}

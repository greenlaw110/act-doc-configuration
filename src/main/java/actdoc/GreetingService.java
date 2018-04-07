package actdoc;

public interface GreetingService {
    String greet();

    default String getName() {
        return greet() + " service";
    }
}

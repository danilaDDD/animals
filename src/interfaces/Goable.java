package interfaces;

@FunctionalInterface
public interface Goable {
    double run();

    default double acceleration(){
        return 9.8;
    }
}

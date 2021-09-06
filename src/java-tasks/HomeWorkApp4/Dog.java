package HomeWorkApp4;

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    void run(int length) {
        if (length >= 0 && length <= MAX_RUN_LENGTH) System.out.println("Собака пробежала: " + length );
        else System.out.println("Собака не может пробежать: " + length);
    }

    void swim(int length) {
        if (length >= 0 && length <= MAX_SWIM_LENGTH) System.out.println("Собака проплыла: " + length);
        else System.out.println("Собака не может проплыть: " + length);
    }
}

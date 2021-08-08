package HomeWorkApp4;

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final String name;
    private final int appetite;
    private int saturationFood;
    private final int catFullness;
    private boolean fullness;

    void run(int length) {
        if (length >= 0 && length <= MAX_RUN_LENGTH) System.out.println("Кот пробежал: " + length);
        else System.out.println("Кот не может пробежать: " + length);
    }

    void swim(int length) {
        System.out.println("Кот не умеет плавать!");
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.saturationFood = 0;
        this.fullness = false;
        this.catFullness = this.appetite;
    }

    public int getSaturationFood() {
        return saturationFood;
    }

    public int getCatFullness() {
        return catFullness;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void eat(Plate p) {
        if (this.fullness) {
            return;
        }
        if (p.decreaseFood(this.appetite)) {
            System.out.printf("%s съел %d единиц еды\n", this.name, this.appetite);
            this.saturationFood += this.appetite;
            if (this.saturationFood == this.catFullness) this.fullness = true;
        }
    }



}
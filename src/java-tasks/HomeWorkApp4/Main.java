package HomeWorkApp4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Чучело", 0);
        cat.run(201);
        cat.swim(1);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

        Cat[] pets = {
                new Cat("Барсик", 3),
                new Cat("Мурзик", 4),
                new Cat("Маркиз", 5),
                new Cat("Том", 2),
                new Cat("Кот", 2),
                new Cat("Снежок", 8),
                new Cat("Васька", 9),
                new Cat("Серега", 1)
        };

        System.out.println("Укажите первоначальное количество еды в миске:");
        Plate plate = new Plate(new Scanner(System.in).nextInt());

        for (Cat c : pets) {
            while (!c.isFullness() && plate.getFood() >= c.getAppetite()) {
                c.eat(plate);
                plate.info();
            }

        }
        for (Cat c : pets) {
            if (c.isFullness()) System.out.printf("%s наелся\n", c.getName());
            else System.out.printf("%s остался голодным, ему не хватило %d единиц еды\n", c.getName(), c.getCatFullness() - c.getSaturationFood());
        }

    }
}


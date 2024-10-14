package Animals;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Bowl bowl = new Bowl(5);

        Cat barsik = new Cat("Барсик", 2);
        Cat murzik = new Cat("Мурзик", 3);
        Cat tom = new Cat("Том", 1);


        bobik.run(150);
        bobik.swim(5);


        barsik.run(200);
        barsik.swim(10);

        murzik.run(150);
        murzik.swim(5);

        tom.run(100);
        tom.swim(3);


        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            cat.eat(bowl);
        }


        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            System.out.println(cat.getName() + (cat.isFull() ? " сыт." : " голоден."));
        }


        bowl.addFood(3);
        System.out.println("Добавлено еды в миску. Количество еды в миске: " + bowl.getFoodAmount());


        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            cat.eat(bowl);
        }


        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            System.out.println(cat.getName() + (cat.isFull() ? " сыт." : " голоден."));
        }

        System.out.println("Всего создано животных: " + Animal.getAnimalCount());
    }
}
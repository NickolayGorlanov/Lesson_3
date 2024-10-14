package Animals;

class Cat extends Animal {
    private boolean isFull;
    private int appetite;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Bowl bowl) {
        if (bowl.consumeFood(appetite)) {
            this.isFull = true;
            System.out.println(name + " покушал.");
        } else {
            System.out.println(name + " не может покушать, недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " устал и не может бежать дальше.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}
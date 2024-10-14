package Animals;

class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean consumeFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }
}
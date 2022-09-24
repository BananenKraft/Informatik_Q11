class juice {
    public String fruit;
    public int price;

    public juice(String fruit, int price){
        this.fruit = fruit;
        this.price = price;
    }
    public void displaySelf(){
        System.out.println("I am a " + fruit + ".");
    }
}
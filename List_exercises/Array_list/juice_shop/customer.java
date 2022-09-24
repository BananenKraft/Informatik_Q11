class customer {
    private String name;
    private int age;
    private juice[] cart = new juice[10];
    private int cart_size = 0;

    public customer(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void addToCart(juice juice){
        try {
            cart[cart_size] = juice;
            cart_size++;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Cart is full");
        }
    }
    public void displayCart(){
        for (int i = 0;i<cart_size;i++){
            cart[i].displaySelf();
        }
    }
    public String getName() {
        return name;
    }

}
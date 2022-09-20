class Human {
    public String name;
    public int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    /* s */
    /* My solution didnt use String concatination */
    public void displayInfo(){
        System.out.println("My name is " + this.name + ", and im " + this.age + " years old!");
    }
    /* /s */
    public boolean equals(Human human) {
        if (human == this){
            return true;
        }
        else {
            return false;
        }
    }
}
    
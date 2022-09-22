package ArrayList;
class Human {
    
    private String name;
    private int age;
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
    public boolean true_equals(Human human) {
        if (human == this){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean equals(Human human){
        if (human.getAge() == this.age && human.getName() == this.name) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
  
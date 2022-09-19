class Human {
    public String name;
    public int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Human human) {
        if (human == this){
            return true;
        }
        else {
            return false;
        }
    }
}
    
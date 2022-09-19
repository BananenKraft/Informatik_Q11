
class Main {
    public static void main(String[] args) {
        MyListArray myList = new MyListArray();
         
        myList.push(new Human("Mika", 15));
        myList.push(new Human("Sarah", 16));
        myList.push(new Human("Blomi", 16)); 
        myList.humatAtIndex(0, true);
        
    }
}
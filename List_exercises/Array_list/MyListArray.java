import javax.lang.model.element.Element;

class MyListArray {
    
    public Human[] queue;
    public int count;

    public MyListArray() {
        queue = new Human[5];
        count = 0;
    }

    public void push(Human newhuman) {
        if (count>=queue.length){
            enlargen(1);
        }
        else {
            queue[count] = newhuman;
            this.count++;}
        }

    public void enlargen(int added_size){
        Human[] large_queue = new Human[queue.length+added_size];
        for (int i = 0;i<queue.length;i++){
            large_queue[i] = queue[i];
        }
        this.queue = large_queue;
    }

    public void pop(){
        for (int i = 1;i<=count;i++){
            queue[i-1] = queue[i];
        }
        count--;
    }
    public void displayQueue(){
        for (int i = 0;i<count;i++) {
            System.out.println(queue[i].age + " " + queue[i].name);
        }
    }
    
    public Human humatAtIndex(int index, Boolean print) {
        String[] return_info = new String[2];
        try{
            return_info[0] = String.valueOf(queue[index].age);
            return_info[1] = queue[index].name;}
        catch (NullPointerException e) {
            System.out.println("Cant find that Human!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("List too short");
        }
        catch (Exception e){
            System.out.println(e);
        }
        if (print) {
            System.out.println(return_info[0]);
            System.out.println(return_info[1]);
        }
        return queue[index];
    }
    /*public int searchHuman(Human humanToFind){
        for (Human human : queue) {
            if (human.equals(humanToFind)){
                
            }
        }
    }*/
}     
  

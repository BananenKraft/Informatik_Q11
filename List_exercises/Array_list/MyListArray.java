

class MyListArray {
    
    private Human[] queue;
    private int count;

    public MyListArray(int queue_length) {
        this.queue = new Human[queue_length];
        this.count = 0;
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
            queue[i].displayInfo();
        }
    }
    
    public Human humatAtIndex(int index, Boolean print) {
        String[] return_info = new String[2];
        try{
            return_info[0] = String.valueOf(queue[index].getAge());
            return_info[1] = queue[index].getName();}
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
            queue[index].displayInfo();
        }
        return queue[index];
    }
    public int searchHuman(Human humanToFind){
        for (int i = 0;i<count;i++) {
            if (queue[i].equals(humanToFind)){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(Human human) {
        for (Human waiter : queue){
            if (human.equals(waiter)) {
                return true;
            }
        }
        return false;
    }
    public Human[] getQueue() {
        return queue;
    }
}     
  

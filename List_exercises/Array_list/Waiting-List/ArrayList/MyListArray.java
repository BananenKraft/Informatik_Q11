package ArrayList;
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
            }
        this.count++;
        }
        

    public void enlargen(int added_size){
        Human[] large_queue = new Human[queue.length+added_size];
        for (int i = 0;i<queue.length;i++){
            large_queue[i] = queue[i];
        }
        this.queue = large_queue;
    }

    public Human pop(){
        Human return_human = queue[0];
        for (int i = 1;i<=count;i++){
            queue[i-1] = queue[i];
        }
        count--;
        return return_human;
    }
    public void displayQueue(){
        for (int i = 0;i<count;i++) {
            queue[i].displayInfo();
        }
    }
    
    public Human humanAtIndex(int index /*, Boolean print*/) {
        String[] return_info = new String[2];
        try{
            return_info[0] = String.valueOf(queue[index].getAge());
            return_info[1] = queue[index].getName();}
        /*
        catch (NullPointerException e) {
            System.out.println("Cant find that Human!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("List too short");
        }*/
        catch (Exception e){
            System.out.println(e);
            return null;
        }
        /*
        if (print) {
            queue[index].displayInfo();
        }*/
        return queue[index-1];
    }
    public int searchHuman(Human humanToFind){
        for (int i = 0;i<count;i++) {
            queue[i].displayInfo();
            if (queue[i].equals(humanToFind)){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(Human human) {
        for (int i = 0; i < count; i++){
            if (queue[i].equals(human)) {
                return true;
            }
        }
        return false;
    }
    public boolean alternativeContains(Human human){
        if (searchHuman(human) > -1){
            return true;
        }
        else {
            return false;
        }
    }
    public Human removeAtPosition(int position) {
        Human return_human = queue[position-1];
        for (int i = 0;i<count;i++) {
            if (i>position-1){
                queue[i-1] = queue[i];
            }
        }
        count --;
        return return_human;
    }
    public MyListArray concatenate(MyListArray second_array){
        MyListArray concat_array = new MyListArray(count+second_array.getCount());
        for (int i = 0;i<count;i++){
            concat_array.push(queue[i]);
        }
        for (int i = 0;i<second_array.getCount();i++){
            concat_array.push(second_array.getQueue()[i]);
        }
        return concat_array;
    }
    public Human[] getQueue() {
        return queue;
    }
    public int getCount() {
        return count;
    }
}     
  

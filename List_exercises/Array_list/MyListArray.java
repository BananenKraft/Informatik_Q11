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
}     
  

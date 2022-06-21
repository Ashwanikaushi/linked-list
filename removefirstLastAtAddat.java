public class Main{
    private static class Node{
        int data;
        Node next;
        Node(){
            data = 0;
            next = null;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    
    private static class LinkedList{
        private Node head , tail;
        private int size;

        LinkedList(){
            head = tail = null;
            size = 0;
        }

        public void addFirst(int val) {
            Node node = new Node(val);
            if(this.size == 0){
                this.head = this.tail = node;
            }else{
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

      public int size(){
        return this.size;
      }
      public void display(){
        if(this.size == 0)
        return;
        Node curr = this.head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
      }
      }
      public void removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return;
        }else if(size == 1){
            head = tail = null;
            size = 0;
        }else{
            head = head.next;
            size--;
        }
      }
    public void removeLast(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }else if (size == 1){
            head = tail = null;
            size = 0;
        }else{
            while(curr.next != tail){
                curr = curr.next;
                tail = curr;
                tail.next = null;// curr.next= null also used here
                size--;
            }
        }
    }
    public void removeAt(){
        if(size==0){
            System.out.println("List is empty");
            return;
    }if(idx == 0 ){
        removeFirst();// call remove first
    }else if(idx == size-1){
        removeLast();// call remove last
    }else{
        // set previous node at null and curr node at 0 idx and then traverse them till they reach the given idx
        prev.next = curr.next;
        curr.next = null;// iski marzi h likho ya nahi
        size--;
    }
    }
    public void addAt(){
        // set previous node at null and curr node at 0 idx and then traverse them till they reach the given idx
         if(idx == 0){
            addFirst();// call addfirst
         }else if (idx == size){
            addLast();
         }else{
            while(idx != 0)// traverse kro jab tak idx 0 na ho jaye ya idx pe na pahuch jaye{
                // then create new node 
                // update connections and then size++


            }

         }
    }
    public static void main(){
        LinkedList ll = new LinkedList();
        ll.addFirst(10); // 10
        ll.addFirst(20); // 20 -> 10
        ll.addFirst(30); // 30 -> 20 -> 10
        System.out.println(ll.size());
        ll.display();
    }

}
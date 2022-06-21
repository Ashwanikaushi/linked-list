public class Main{
     public int getNodeAt(int idx){
            if(idx < 0 || idx >= size){
                System.out.println("invalid arguments");
                return -1;
            }
            Node temp = head;
            for(int i = 1; i <= idx; i++){
                temp = temp.data;
            }
            return temp.data;
        }
    public void reverseDataIterative(){
        int left = 0 , right = size-1;

        while(left < right){
            Node lnode = getNodeAt(left);
            Node rnode = getNodeAt(right);

            int temp = lnode.data;
            lnode.data = rnode.data;
            rnode.data = temp;

            left++;
            right--;
        }
    }
}
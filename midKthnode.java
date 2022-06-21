// in questions me size ka use nhi krna h alag sochna h remember.
public class Main{
    public static void Mid(){
        //use fast n slow rule 
        // both fast and slow are on head and then fast move twice and slow moves only one 
        // in case of odd fast.next != null and at this time slow is at mid
        // in case of even fast.next.next != null and at this time slow is at last of first half means at first mid kyuki even me two mid hote h
       Node fast = head , slow = head;
       while(fast.next != null && fast.next.next != null)// ye conditions ulti nhi likhni h nhi to null pointer exception(jab hum null pe pahuch jate h or wha se bhi data lena chahte h tab aata h ye exception) aajayega{
       // agar second mid chahiye to condition hogi if(fast != null)
        fast = fast.next.next;
        slow = slow.next;
       } 
       return slow.data;
    }
    public static void kthnodefromtheEnd(){
//take two var front and curr both put on head and then  give a head start of k jumps (while k != 0) jump to front by loop 
// and then move both simultaneously one by one 
Node curr = head , front = head;

// head start
while(k != 0){
    front = front.next;
    k--;
}
// start the race 
while(front.next != null){
    front = front.next;
    curr = curr.next;
}
return curr.data;
    }
}
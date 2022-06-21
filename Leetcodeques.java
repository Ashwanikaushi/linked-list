public ListNode deleteMiddle(ListNode head){
    if(head.next == null) return null;
    ListNode slow = head , fast = head;
    ListNode prev = null;

    while(fast != null && fast.next != null){
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    pre.next = slow.next;
    slow.next = null;
    return head;
}
public ListNode reverseList(ListNode head){
    ListNode prev = null , curr = head; 
// zero or one ke liye bhi ye loop work kregi or ye pointer iteration pe work kr rhi h
//if not understood view notes of sir 
    while(curr != null){
        ListNode nbr = curr.next;
        curr.next = prev;

        prev = curr;
        curr = nbr;

    }
    return prev;
}
public class solution{
    public ListNode MiddleNode(ListNode head){
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
    public ListNode reverseList(ListNode head){
    ListNode prev = null , curr = head; 
// zero or one ke liye bhi ye loop work kregi or ye pointer iteration pe work kr rhi h
//if not understood view notes of sir 
    while(curr != null){
        ListNode nbr = curr.next;
        curr.next = prev;

        prev = curr;
        curr = nbr;

    }
    return prev;
}// pallindrome ke liye in dono function ki jarurat h

public boolean isPalindrome(ListNode head){
// find mid and then break second list with mid and then reverse the second list
// now two list made (left , right ) now traverse both if (right == null) then this list is palindrome
// for better understanding see notes of sir 
// 1.find mid 2. heading two 3. reverse heading two list 4. traverse 5. fir wapis data thik bhi krna h
// condition while (right != null)
ListNode mid = MiddleNode(head);
ListNode head2 = mid.next;
mid.next = null;

head2 = reverseList(head2);

ListNode left = head , right = head2;
boolean ans = true;
while(right != null){
    if(left.val == right.val){
        left = left.next;
        right = right.next;

    }else{
        ans = false;
        break;
    }
}
head2 = reverseList(head2);
mid.next = head2;

return ans;
}
}
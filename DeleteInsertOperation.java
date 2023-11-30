//For deleting the head node 
//method

private static Node removeshead(Node head) {
    if (head == null) return head;
    head = head.next;
    return head;
}

//To remove the tail/last node in linked List.
 private static Node removeslast(Node head){
        if(head==null||head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
//To remove the position node in linked list
private static Node positiondel(Node head,int k){
        if(head==null||head.next==null) return null;
        if(k==1){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
        prev=temp;
        temp=temp.next;
            
        }
        return head;
    }

//To remove the value node in linked List

    private static Node valuedel(Node head, int v){
        if(head==null||head.next==null) return null;
        if(head.data==v){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==v){
                prev.next=prev.next.next;
                break;
            }
        prev=temp;
        temp=temp.next;
            
        }
        return head;
    }

//Insertion of elements
//To insert the node at begin

    private static Node addhead(Node head,int e){
        Node temp = new Node(e,head);
        return temp;
    }

//to insert at last

  private static Node insertLast(Node head, int val){
        if(head==null)
            return new Node(val);
        Node temp=head; 
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newnode=new Node(val);
        temp.next=newnode;
        return head;
    }

//To insert at given position

  private static Node insertAtk(Node head,int el,int k){
        if(head==null) {
            if(k==1){
                return new Node(el);
            }
            else{
                return head;
            }
        }
        if(k==1){
            return new Node(el,head);
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==k-1){
                Node x=new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

//To insert node before the value

private static Node insertAtval(Node head,int el,int k){
        if(head==null) return null;
        if(head.data==k){
            return new Node(el,head);
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==k){
                Node x=new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

//to print the Linked List
private static void print(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}

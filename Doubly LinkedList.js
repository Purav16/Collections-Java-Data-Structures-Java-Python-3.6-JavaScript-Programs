// Double routing elements
var node = {
  value: val,
  next: null,
  previous: null  
}

// LinkedList Function
function DoublyLinkedList(){
   this.head = null;
}

DoublyLinkedList.prototype.push = function(val){
   var head = this.head,
       current = head,
       previous = head;
  if(!head){
      this.head = {value: val, previous:null, next:null };
  }
  else{
      while(current && current.next){
         previous = current;
         current = current.next;
      }     
     current.next = {value: val, previous:current, next:null}
  }  
}

// Class Object
var dll = new DoublyLinkedList();
dll.push(2);
dll.push(3);
dll.push(4);
dll.push(5);

#Importing queue elements
from collections import deque

#queue element using deque
queue = deque(["One","Two","Three","Four","Five"])
print(queue)

#adding elemetns
queue.append("Appending 1")
queue.append("Appending 2")
print(queue)

#Removing elements using pop method
queue.popleft();
queue.popleft();
#queue.popright() isn't available as queue is first in first out data structure
print(queue)
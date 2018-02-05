#Initializing stack as a list
stack = [1,2,3,4,5,6,7,8,9,"Hello","There"]

#Adding elements to the stack with list methods
stack.append(6)
stack.append(7)
stack.insert(len(stack),"Hie")
print(stack)

#removing last elements using pop method
stack.pop()
stack.pop()
print(stack)

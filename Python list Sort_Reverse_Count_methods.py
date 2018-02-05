#initializing a pythn list with some elements
list1 = [1,2,3,4,5,6,7,8,9,10]

#Adding elements at the end of the list
list1.append(2)
list1.append(3)

#printing the output for goven list
print(list1)

#Adding more elements at a time at the last
list1.extend([1,2])
print(list1)

#Insert at given position
list1.insert(0,0)
print(list1)

#Adding at the first and last indexes
list1.insert(0,1)
list1.insert(len(list1),1)
print(list1)

#Remving a value known element
list1.remove(1)
list1.remove(10)
print(list1)

#Removing last element using POP method
list1.pop()
print(list1)

#Removing more than 1 elements using pop
list1.pop(2)
print(list1)

#getting index of any elements in a list
print(list1.index(8))

#Count of given element
print(list1.count(4))

#sorting using sort() method
list1.append(-1)
list1.append(0)
list1.sort()
print(list1)

#Reversing the list elements
list1.reverse()
print(list1)

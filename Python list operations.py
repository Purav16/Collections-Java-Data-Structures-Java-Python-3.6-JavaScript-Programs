#list operations
power = [1,2,3,4,5,6,7,8,9]
list2 = [x*x for x in power]
print(list2)

#getting values wth both lists
#Square operation within the list with index values
list3 = [[x,x*x] for x in power]
print(list3)

#loops
list4 = [x*x for x in power if x > 4]
print(list4)

#Strip() function
list5 = ['111n111', '111m111' ,'000y000' ,'000x000']
list6 = [element.strip(0,1) for element in list5]
print(list6)

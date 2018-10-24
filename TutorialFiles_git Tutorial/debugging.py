# import math
#
# def sqrt(x):
#
#     assert x > 0, "sqrt(): Trying to find the sqrt of " + str(x)
#
#     return math.sqrt(x)
#
#
# print(sqrt(144))
# print(sqrt(-1))

# x = set([2,4,5,6,7,2,4])
# print("Set is", x, len(x))
#
#
y = [ (x, x**2, x**3) for x in range(20) if x % 3 != 0]

# y2 = []
# for x in range(20):
#     if x % 3 != 0:
#         y2.append((x, x**2, x**3))
#
#
# print(y2)


def next(limit, step):
    i = 1                         # Closure
    while i <= limit:
        yield(i)
        i += step

values = [i+6 for i in range(1,1000000)]

for x in next(100, 6):
    print("X is ", x)

# List Comprehension

# lines = [ line[:-1] for line in lines if line.startswith != '#']




# for name in ['Bob', 'Bill', 'Matilda', 'Mary']:
#       print( name)
#       for num2 in range(3):
#           print("   B", num2)
#       print("   C")
# print("D")


# for num1 in range(3):
#     for num2 in range(4):
#         print("hello", 'there', end = " -- ", sep=";")
#     print()
#
# mpyBy = 6
# for num in [1,2,3,4,5,6,7,8,9,10,11,12]:
#     product = num * mpyBy
#     print(product, end = ' ')

# print ("Nested For loops - Version 5")
#
# for rate in [ 12, 14, 16]:
#     row = 'Rate %-2d:' % (rate)
#
#     for hours in [10, 15, 20, 25]:
#         row = row + '%8d' % (rate * hours)
#
#     print(row)

# Version 1
num_printed_this_line = 0
no_per_line = 1
for x in range(10,55):
    print(x, end= "  ")
    num_printed_this_line += 1

    if num_printed_this_line == no_per_line:
        print()           #end the current line
        num_printed_this_line = 0   # none printed on the new line (yet)
        no_per_line += 1





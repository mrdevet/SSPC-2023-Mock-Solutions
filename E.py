# Get the height and width of the chocolate bar
R, C = [int(x) for x in input().split()]

# Get the size of the chocolate bar
size = R * C

# If the size is even, Alf wins
if size % 2 == 0:
    print("Alf")

# Otherwise, Beata wins
else:
    print("Beata")
from math import sqrt, ceil

# Read the inputs
N, M, K = [int(x) for x in input().split(" ")]

plots = [int(x) for x in input().split(" ")]
circles = [int(x) for x in input().split(" ")]
squares = [int(x) for x in input().split(" ")]

# This lsit holds the radius of the smallest circle 
# that fits around each house
#  - for circles this is just the radius + 1
#  - for squares this is half the length of the diagonal
min_plots = [x + 1 for x in circles]
min_plots += [ceil(x / sqrt(2)) for x in squares]

# Sort the arrays
plots.sort()
min_plots.sort()

# Go through the lists and greedily assign each house to a plot (if possible)
count = 0
j = N - 1  # j is the plot index
for i in range(M + K - 1, -1, -1):  # i is the house index
    # If there are no plots left, end the loop
    if j < 0:
        break

    # If the current house fits in the current plot, count it and go to next plot
    if min_plots[i] <= plots[j]:
        count += 1
        j -= 1

# Print the result
print(count)
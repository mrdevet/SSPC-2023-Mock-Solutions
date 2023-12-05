from math import ceil

# Get the limit
m = int(input())

# List to hold the sums
max_base = ceil(m ** (1 / 3))  # Cubed root of m
sums = []

# Loop through pairs of cubes to find the sums
for i in range(1, max_base):
    i_cubed = i ** 3
    for j in range(i, max_base):
        j_cubed = j ** 3
        sum = i_cubed + j_cubed
        if sum > m:
            break
        sums.append(sum)

# Sort the sums in reverse order
sums.sort(reverse=True)

# Find the biggest bus number
# This will be the highest number that appears multiple times in sums
for i in range(len(sums) - 1):
    if sums[i] == sums[i + 1]:
        print(sums[i])
        break
else:
    # If we get here, no bus numbers were found
    print("none")
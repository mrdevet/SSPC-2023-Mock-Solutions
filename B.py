# Read the inputs
n = int(input())
machines = input()

# Loop through the lecture halls and count the ones she has coffee for
count = 0
coffees_in_hand = 0
for machines_i in machines:
    if machines_i == '1':
        count += 1
        coffees_in_hand = 2

    # Otherwise, check if she has a coffee in her hand
    elif coffees_in_hand > 0:
        count += 1
        coffees_in_hand -= 1

# Print the count
print(count)
# Loop through the test cases
num_tests = int(input())

for i in range(num_tests):
    N = int(input())

    # Find N!
    factorial = 1
    for j in range(2, N + 1):
        factorial *= j

    # Print the last digit of N!
    last_digit = factorial % 10
    print(last_digit)
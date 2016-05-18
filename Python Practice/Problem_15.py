def numCombinations(n, k):
    print((factorial(n)/(factorial(k)))/factorial(n-k))

def factorial(num):
    prod = 1
    while num > 1:
        prod *= num
        num -= 1
    return prod

numCombinations(20*2, 20)
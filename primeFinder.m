function ans = primeFinder(number)

ansArr = [];

for n = 2:number
    if mod(number, n) == 0
        ansArr = [ansArr, n];
    end
end

mask = isprime(ansArr);

ans = max(ansArr(mask));

end

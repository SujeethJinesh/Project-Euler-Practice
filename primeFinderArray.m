function factors = primeFinderArray(number)

ansArr = [];

for n = 2:number
    if mod(number, n) == 0
        ansArr = [ansArr, n];
    end
end

factors = ansArr;

end
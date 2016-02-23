function difference = sumSquareDifference(number)

sumEachSquared = 0;

for n = 1:number
    
    sumEachSquared = sumEachSquared + n.^2;
end

sumTotalSquared = 0;

for m = 1:number
    
    sumTotalSquared = sumTotalSquared + m;
    
end

sumTotalSquared = sumTotalSquared.^2;

difference = abs(sumEachSquared - sumTotalSquared);

end
function ans = thousandDigitProd(num, desiredDigitLength)

ans = [];

ans = thousandDigitProdHelper(num, desiredDigitLength);

end

function ans = thousandDigitProdHelper(num, desiredDigitLength)

num = num2str(num);

if length(num) < desiredDigitLength
    
    ans = [];
    
else
    
    ans = [thousandDigitProdHelper(num(2:end), desiredDigitLength) product(num(1:desiredDigitLength))]
    
end

max(ans)

end

function result = product(num)

newNum = [];

for n = 1:length(num)
    
    newNum = [newNum str2num(num(n))];
    
end

result = prod(newNum);

end
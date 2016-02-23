function output = largestPalindromProduct

%first find palindromes less than 999*999

palindromes = [];

for n = 999*999:-1:810000
    if isPalindrome(n) & primeFinder(n) <= 999
        [factor1, factor2] = primeFinderArray(n);
        
        if factor1 > 0 & factor2 > 0
            palindromes = [palindromes, n];
        end
        
    end
end

output = max(palindromes);

end

function logical = isPalindrome(num)

num = num2str(num);

logical = false;

beg = num(3:-1:1);

ending = num(4:6);

if beg == ending
    logical = true;
end

end

function [factor1, factor2] = primeFinderArray(number)

factor1 = 0;
    
factor2 = 0;

ansArr = [];

for n = 2:number
    if mod(number, n) == 0
        ansArr = [ansArr, n];
    end
end

if length(ansArr(ansArr >= 900 & ansArr <= 999)) == 2

    ansArr = ansArr(ansArr >= 900 & ansArr <= 999);
    
    factor1 = ansArr(1);
    
    factor2 = ansArr(2);
    
end

end
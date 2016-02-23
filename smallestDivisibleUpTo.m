%ridiculously inefficient, don't actually use for anything practical

function output = smallestDivisibleUpTo(number)

n = number;

while ~checkMod(n, number)
    n = n + number;
end

output = n;

end

function logical = checkMod(n, number)

array = [];

logical = false;

for m = 1:number
    if mod(n, m) ~= 0
        break;
    else
        logic = true;
    end
    array = [array logic];
end

logical = sum(array) == number;

end
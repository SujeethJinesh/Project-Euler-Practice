function out = xPrime(number)

prime = 2;

count = 0;

while count < number
    
    if isprime(prime)
        count = count + 1;
    end
    prime = prime + 1;
end

out = prime - 1;

end
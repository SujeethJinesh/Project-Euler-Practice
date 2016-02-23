function p = primeGenerator(upto)

if upto < 2
  p = zeros(1,0,class(upto)); 
  return
elseif isfloat(upto) && upto > flintmax(class(upto))
  warning(message('MATLAB:primes:NGreaterThanFlintmax'));
  upto = flintmax(class(upto));  
end
upto = floor(upto);
p = true(1,double(ceil(upto/2)));
q = length(p);
if (isa(upto,'uint64') || isa(upto,'int64')) && upto > flintmax
  ub = 2.^(nextpow2(upto)/2);  %avoid casting large (u)int64 to double
else
  ub = sqrt(double(upto));
end
for k = 3:2:ub
  if p((k+1)/2)
     p(((k*k+1)/2):k:q) = false;
  end
end
p = cast(find(p)*2-1,class(upto));
p(1) = 2;



%uses sieve of Eratosthenes, inefficient
% 
% 
% firstPrime = 2;
% 
% secondPrime = 3;
% 
% list = [firstPrime secondPrime];
% 
% for n = 5:upto
%     log = [];
%     for m = 1:length(list)
%         if mod(n,list(m)) ~= 0
%             log = [log true];
%         else
%             log = [log false];
%         end
%     end
%     if sum(log) == length(list)
%         list = [list, n];
%     end
% end

end
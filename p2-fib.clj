; basic fib series, using memoized recursion
(defn fib
  [n]
  (if (= n 1)
    1
    (if (= n 2)
      2
      (+ (fib-memo (dec n)) (fib-memo (dec (dec n)))))))
 
; memoized for speed
(def fib-memo (memoize fib))
 
; By considering the terms in the Fibonacci sequence whose values do not exceed MAX, 
; find the sum of the even-valued terms.
(defn fib_even_sum
   [max]
   (loop [sum 2
          n 2
          lastFib 2]
     (println 'fib_even_sum' sum n lastFib)
     (let [n (+ n 3)
             lastFib (fib-memo n)]
     (if (> lastFib max)
       sum
       (recur (+ sum lastFib) n lastFib)))))

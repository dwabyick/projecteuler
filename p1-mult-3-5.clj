; Find the sum of all the multiples of 3 or 5 below num
(defn mult_3_5 
  [num]
    (loop [i 3
           result 0]
      (if (< i num)
        (if (or (= (mod i 3) 0) (= (mod i 5) 0))
          (recur (+ i 1) (+ result i))
          (recur (+ i 1) result))
    result)))

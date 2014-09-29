; Sum It All Up - Easy
; Write a function which returns the sum of a sequence of numbers.
; tags - seqs
; restricted -
(ns offline-4clojure.p24
  (:use clojure.test))

(def __
;; your solution here
)


(defn -main []
  (are [x] x
(= (apply + [1 2 3]) 6)
(= (apply + (list 0 -2 5 5)) 8)
(= (apply + #{4 2 1}) 7)
(= (apply + '(0 0 -1)) -1)
(= (apply + '(1 10 3)) 14)
))

; Reverse a Sequence - Easy
; Write a function which reverses a sequence.
; tags - seqs:core-functions
; restricted - reverse:rseq
(ns offline-4clojure.p23
  (:use clojure.test))

(defn reverselist [col]
  (if (empty? col)
      []
      (conj (reverselist (rest col)) (first col))
    )
;; your solution here
)
(reverselist '(1 2 3 4 5))
(defn -main []
  (are [x] x
(= (reverselist [1 2 3 4 5]) [5 4 3 2 1])
(= (reverselist (sorted-set 5 7 2 7)) '(7 5 2))
(= (reverselist [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
))

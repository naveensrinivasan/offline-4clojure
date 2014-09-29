; Nth Element - Easy
; Write a function which returns the Nth element from a sequence.
; tags - seqs:core-functions
; restricted - nth
(ns offline-4clojure.p21
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [x] x
(= (nth '(4 5 6 7) 2) 6)
(= (nth [:a :b :c] 0) :a)
(= (nth [1 2 3 4] 1) 2)
(= (nth '([1 2] [3 4] [5 6]) 2) [5 6])
))

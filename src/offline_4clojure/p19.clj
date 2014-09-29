; Last Element - Easy
; Write a function which returns the last element in a sequence.
; tags - seqs:core-functions
; restricted - last
(ns offline-4clojure.p19
  (:use clojure.test))

(def __
;; your solution here
)
; without using last
(defn -main []
  (are [x] x
(= (first (reverse[1 2 3 4 5])) 5)
(= (first (reverse '(5 4 3))) 3)
(= (first (reverse ["b" "c" "d"]))"d")
)

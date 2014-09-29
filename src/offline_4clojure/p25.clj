; Find the odd numbers - Easy
; Write a function which returns only the odd numbers from a sequence.
; tags - seqs
; restricted -
(ns offline-4clojure.p25
  (:use clojure.test))

(def __
;; your solution here
)


(defn -main []
  (are [x] x
(= (filter #(= (mod % 2) 1) #{1 2 3 4 5}) '(1 3 5))
(= (filter #(= (mod % 2) 1) [4 2 1 6]) '(1))
(= (filter #(= (mod % 2) 1) [2 2 4 6]) '())
(= (filter #(= (mod % 2) 1) [1 1 1 3]) '(1 1 1 3))
))

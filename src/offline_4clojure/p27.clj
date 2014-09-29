; Palindrome Detector - Easy
; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;                Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
; tags - seqs
; restricted -
(ns offline-4clojure.p27
  (:use clojure.test))

(defn palindrome? [x]
  (= (reverse x) (seq x))
)

(defn -main []
  (are [x] x
(false? (palindrome? '(1 2 3 4 5)))
(true? (palindrome? "racecar"))
(true? (palindrome? [:foo :bar :foo]))
(true? (palindrome? '(1 1 3 3 1 1)))
(false? (palindrome? '(:a :b :c)))
))

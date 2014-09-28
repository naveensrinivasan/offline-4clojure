; Lists: conj - Elementary
; When operating on a list, the conj function will return a new list with one or more items "added" to the front.
; tags -
; restricted -
(ns offline-4clojure.p5
  (:use clojure.test))


(defn -main []
  (are [x] x
(= '(1 2 3 4) (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))
))

; Vectors: conj - Elementary
; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
; tags -
; restricted -
(ns offline-4clojure.p7
  (:use clojure.test))


(defn -main []
  (are [x] x
(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2] 3 4))
))

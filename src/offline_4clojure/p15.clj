; Double Down - Elementary
; Write a function which doubles a number.
; tags -
; restricted -
(ns offline-4clojure.p15
  (:use clojure.test))

(defn double [x]
  (* x 2)
)

(defn -main []
  (are [x] x
(= (double 2) 4)
(= (double 3) 6)
(= (double 11) 22)
(= (double 7) 14)
))

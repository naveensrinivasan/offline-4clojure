; Maps: conj - Elementary
; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
; tags -
; restricted -
(ns offline-4clojure.p11
  (:use clojure.test))


(defn -main []
  (are [x] x
(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))
))

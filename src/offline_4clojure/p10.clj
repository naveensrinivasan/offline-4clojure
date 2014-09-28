; Intro to Maps - Elementary
; Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
; tags -
; restricted -
(ns offline-4clojure.p10
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [x] x
(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
(= 20 (:b {:a 10, :b 20, :c 30}))
))

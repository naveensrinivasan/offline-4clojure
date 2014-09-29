; Intro to Functions - Elementary
; Clojure has many different ways to create functions.
; tags -
; restricted -
(ns offline-4clojure.p14
  (:use clojure.test))

(defn -main []
  (are [x] x
(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))
))

; Hello World - Elementary
; Write a function which returns a personalized greeting.
; tags -
; restricted -
(ns offline-4clojure.p16
  (:use clojure.test))

(defn greet [x]
  (str "Hello, " x "!")
)

(defn -main []
  (are [x] x
(= (greet "Dave") "Hello, Dave!")
(= (greet "Jenn") "Hello, Jenn!")
(= (greet "Rhea") "Hello, Rhea!")
))

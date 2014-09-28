; Intro to Strings - Elementary
; Clojure strings are Java strings.  This means that you can use any of the Java string methods on Clojure strings.
; tags -
; restricted -
(ns offline-4clojure.p3
  (:use clojure.test))

(def solution
  "HELLO WORLD"
)

(defn -main []
  (are [x] x
(= solution (.toUpperCase "hello world"))
))

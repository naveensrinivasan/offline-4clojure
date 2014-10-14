; Get the Caps - Easy
; Write a function which takes a string and returns a new string containing only the capital letters.
; tags - strings
; restricted -
(ns offline-4clojure.p29
  (:use clojure.test))

(defn upperOnly [data]
  (apply str
         (map #(char %)
                (filter #(and (> % 64 ) (< % 91)) ;filters anything between A and Z
                            (map int (seq data))))))

(defn -main []
  (are [x] x
(= (upperOnly "HeLlO, WoRlD!") "HLOWRD")
(empty? (upperOnly "nothing"))
(= (upperOnly "$#A(*&987Zf") "AZ")
))

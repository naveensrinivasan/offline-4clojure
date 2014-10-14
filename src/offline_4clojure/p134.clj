; A nil key - Elementary
; Write a function which, given a key
; and map, returns true <a href="http://en.wikipedia.org/wiki/If_and_only_if">iff</a>
; the map contains an entry with that key and its value is nil.
; tags - maps
; restricted -
(ns offline-4clojure.p134
  (:use clojure.test))

(defn doesItContain [k m]
  (contains? m k))

(defn -main []
  (are [x] x
(true?  ( doesItContain :a {:a nil :b 2}))
(false? (doesItContain :b {:a nil :b 2}))
(false? (doesItContain :c {:a nil :b 2}))
))

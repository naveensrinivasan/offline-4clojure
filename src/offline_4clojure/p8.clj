; Intro to Sets - Elementary
; Sets are collections of unique values.
; tags -
; restricted -
(ns offline-4clojure.p8
  (:use clojure.test))


(defn -main []
  (are [x] x
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))
))

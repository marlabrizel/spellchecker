(ns spellchecker.core
  (:require [clojure.string :as str])
  (:gen-class))

(def words
  (set (map str/trim (str/split-lines (slurp "resources/wordsEn.txt")))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

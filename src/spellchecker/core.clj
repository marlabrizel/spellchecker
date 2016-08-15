(ns spellchecker.core
  (:require [clojure.string :as str])
  (:import (org.apache.commons.lang3 StringUtils))
  (:gen-class))

(def words
  (set (map str/trim (str/split-lines (slurp "resources/wordsEn.txt")))))

(defn correct?
  "Takes a word and returns true if the word is present in a collection of words"
  [word]
  (contains? words word))

(defn distance
  "Takes two words and returns the Levenshtein distance between them."
  [word1 word2]
  (StringUtils/getLevenshteinDistance word1 word2))

(defn min-distance
  [word]
  (min-key (partial distance word) "spelling" "spilling"))


(defn -main
  [& args]
  (let [word (first args)]
    (if (correct? word)
      (println "Correct")
      (println "Did you mean xy?"))))


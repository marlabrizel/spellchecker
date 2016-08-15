(defproject spellchecker "0.1.0-SNAPSHOT"
  :description "Simple spellchecker app"
  :url "http://github.com/marlabrizel/spellchecker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.commons/commons-lang3 "3.3.2"]]
  :main ^:skip-aot spellchecker.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

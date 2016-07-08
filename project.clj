(defproject spellchecker "0.1.0-SNAPSHOT"
  :description "Simple spellchecker app"
  :url "http://github.com/marlabrizel/spellchecker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot spellchecker.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

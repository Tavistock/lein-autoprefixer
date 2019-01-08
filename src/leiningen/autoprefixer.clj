(ns leiningen.autoprefixer
  (:require [clojure.java.shell :as shell]
            [leiningen.core.main :as l]))

(defn autoprefixer
  "Runs autoprefixer in place on :src. Takes an option :browsers ."
  [{{:keys [src browsers]} :autoprefixer} & args]
  (let [env (into {} (System/getenv))
        command (cond-> ["postcss" src "-r" "--use" "autoprefixer"]
                  browsers (concat [:env (assoc env "BROWSERSLIST" browsers)]))
        ran (apply shell/sh command)]
    (l/warn ran)))

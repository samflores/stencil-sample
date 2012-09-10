(ns stencil-sample.core
  (:use [stencil.core]))

(defn -main []
  (println (render-file
             "hello"
             {:name "Samuel"})))

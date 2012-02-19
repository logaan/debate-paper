(ns debate-paper.models.document.core)

(defrecord Document [name])

(defn new
  ([map] (Document. (:name map)))
  ([name] (Document. name)))


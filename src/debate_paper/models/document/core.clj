(ns debate-paper.models.document.core)

(defrecord Document [id name])

(defn new
  ([map] (Document. (:id map) (:name map)))
  ([id name] (Document. id name)))


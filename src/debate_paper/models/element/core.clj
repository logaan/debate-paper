(ns debate-paper.models.element.core)

(defrecord Element [document body])

(defn new
  ([map] (Element. (:document map) (:body map)))
  ([document body] (Element. document body)))


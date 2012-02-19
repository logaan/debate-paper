(ns debate-paper.models.comment.core)

(defrecord Comment [body])

(defn new
  ([map] (Comment. (:body map))))


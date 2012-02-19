(ns debate-paper.models.document.sql
  (:use [korma core]
        [debate-paper.models database]
        [debate-paper.models.document core]))

(defentity documents
           (transform new)
           (entity-fields :id :name))

(defn find-all []
  (select documents))

(defn find-by-id [id]
  (first
    (select documents
            (where {:id id}))))


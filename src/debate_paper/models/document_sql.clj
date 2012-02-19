(ns debate-paper.models.document-sql
  (:use [korma core]
        [debate-paper.models database document]))

(defentity documents
           (transform new)
           (entity-fields :id :name))

(defn find-all []
  (select documents))

(defn find-by-id [id]
  (first
    (select documents
            (where {:id id})
            (limit 1))))


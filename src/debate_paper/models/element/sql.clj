(ns debate-paper.models.element.sql
  (:use [korma core]
        [debate-paper.models database]
        [debate-paper.models.element core]
        [debate-paper.models.document sql]))

(defentity elements
            (transform new)
            (entity-fields :id :body)
            (belongs-to document))

(defn row-to-record [{id :id body :body}]
  (meta
    (.Element body)
    {:id id}))

(defn find-all []
  (select elements))

(defn find-by-id [id]
  (first
    (select elements
            (where {:id id}))))


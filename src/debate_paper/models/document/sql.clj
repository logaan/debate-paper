(ns debate-paper.models.document.sql
  (:use [korma core]
        [debate-paper.models database]
        [debate-paper.models.document core]))

(defn row-to-record [{id :id name :name}]
  (meta
    (.Document name)
    {:id id}))

(defentity documents
           (transform row-to-record)
           (entity-fields :id :name))

(defn find-all []
  (select documents))

(defn find-by-id [id]
  (first
    (select documents
            (where {:id id}))))


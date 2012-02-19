(ns debate-paper.models.document.sql
  (:use [korma core]
        [debate-paper.models database]
        [debate-paper.models.document core]))

(defentity documents
           (transform row-to-record)
           (entity-fields :id :name))

(defn row-to-record [{id :id name :name}]
  (meta
    (.Document name)
    {:id id}))

(defn find-all []
  (select documents))

(defn find-by-id [id]
  (first
    (select documents
            (where {:id id}))))


(ns debate-paper.models.element.sql
  (:use [korma core]
        [debate-paper.models database]
        [debate-paper.models.element core])
  (:require
        [debate-paper.models.document.sql :as document-sql]))

(defn row-to-record [{id :id body :body}]
  (meta
    (.Element body)
    {:id id}))

(defentity elements
            (transform row-to-record)
            (entity-fields :id :body)
            (belongs-to document-sql/documents))

(defn find-all []
  (select elements))

(defn find-by-id [id]
  (first
    (select elements
            (where {:id id}))))


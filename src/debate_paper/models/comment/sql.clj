(ns debate-paper.models.comment.sql
  (:use [korma core]
        [debate-paper.models database]
        [debate-paper.models.comment core])
  (:require [debate-paper.models.element.sql :as element-sql]))

(defn row-to-record [{id :id body :body}]
  (meta
    (.Comment body)
    {:id id}))

(defentity comments
           (transform row-to-record)
           (entity-fields :id :body)
           (belongs-to element-sql/elements))

(defn find-all []
  (select comments))

(defn find-by-id [id]
  (first
    (select comments
            (where {:id id}))))


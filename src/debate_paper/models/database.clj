(ns debate-paper.models.database
  (:use [korma db core]))

(defdb development
       (sqlite3 {:db "resources/development.sqlite3"}))

(defentity comments
           (entity-fields :id :body))

(defentity elements
           (entity-fields :id :body)
           (has-many comments {:fk :element_id}))

(defentity documents
           (entity-fields :id :name)
           (has-many elements {:fk :document_id}))

(defn list-documents []
  "Does a shallow load of all documents"
  (select documents))

(defn load-document [id]
  "Does a deep load of one document"
  (first (select documents
                 (with elements
                       (with comments))
                 (where {:id id}))))

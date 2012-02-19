(ns debate-paper.models.database
  (:use [korma db]))

(defdb development
       (sqlite3 {:db "resources/development.sqlite3"}))


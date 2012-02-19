(ns debate-paper.test.database
  (:use [korma core]
        [debate-paper.models database]
        [clojure test]))

(deftest view-document-select
  (prn (load-document 1)))


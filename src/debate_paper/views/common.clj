(ns debate-paper.views.common
  (:use [noir.core :only [defpartial, defpage]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "debate-paper"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))

(defpage "/" []
         (layout
           [:h1 "hello"]))

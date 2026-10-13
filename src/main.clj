(ns main
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route]))

(defn body-response [status body]
  {:status status
   :body body})

(def ok (partial body-response 200))
(def created (partial body-response 201))
(def no-content (partial body-response 204))
(def bad-request (partial body-response 400))   
(def internal-server-error (partial body-response 500))

(defn ping-hello [request]
  (ok {:message "Hello, World!"}))

(def routes #{["/" :get ping-hello :route-name :home]})

(defn create-server []
  (http/create-server
    {::http/routes routes
     ::http/type :jetty
     ::http/port 8890
     ::http/join? false}))

(defn start []
  (http/start (create-server)))

(ns user
  (:require [mount.core :as mount]
            [clojure.tools.namespace.repl :as tn]))

(defn go []
  (mount/start)
  :ready)

(defn stop []
  (mount/stop)
  :shutdown)

(defn reset []
  (mount/stop)
  (tn/refresh :after 'user/go))


(comment

  ;; start ignite only
  (mount/start #'ignswift.appconfig/appconfig
               #'ignswift.ignite/ignition
               #'ignswift.ignite/ignmap)

  ;; start swift only
  (mount/start #'ignswift.appconfig/appconfig
               #'ignswift.swift/conn)

  )

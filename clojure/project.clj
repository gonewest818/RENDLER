(defproject rendler-clj "0.1.0-SNAPSHOT"
  :description "Mesos RENDLER example in clojure"
  :url "http://github.com/mesosphere/RENDLER/clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [mount "0.1.11"]
                 [funcool/beicon "3.2.0"]
                 [org.apache.mesos/mesos "1.2.0"]
                 [com.mesosphere.mesos.rx.java/mesos-rxjava-protobuf-client "0.1.1"]]
  :main ^:skip-aot rendler-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})

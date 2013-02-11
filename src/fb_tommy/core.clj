(ns fb-tommy.core
  (:refer-clojure :exclude [== >= <= > < =])
  (:use [clojure.core.logic])
  (:require [clojure.math.combinatorics :as combo]))

(def input ['a 'b u1 'c u2 'c])
(def output ['a 'c u1 'c u2 u3])

(def perms (combo/permutations (partition 2 input)))

(def eg (first perms))

(run* [q]
  (== q eg)
  (== q output))
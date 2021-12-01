(ns clojure.examples.hello
        (:gen-class))




(def Parc #{"KAMPA" "Bertramka" "Frantiskanska zahrada" "Obora Hvezda" "Kampa" "Kinsheho Zahrada" "Kalmovka" "Ladronka" "Letna" "Petrin" "Riegrovy sady" "Stromovka" "Vojanovy Sady" "Vysehrad" "bertramka"})
(def Parc2 #{"Petrin" "Riegrovy-sady" "Stromovka" "Vojanovy-Sady" "Vysehrad" "Bertramka" "Frantiskanska-zahrada" "Obora-Hvezda" "Kampa" "Kinsheho-Zahrada" "Kalmovka" "Ladronka" "Letna"})
(def wc #{"wc" "toilet" "privy" "WC" "TOILET" "PRIVY" "Wc" "Toilet" "Privy"})
(def transport #{"transportation" "transport" "tram" "tramway" "metro""bus" "autobus" "Transportation" "Transport" "Tram" "Tramway" "Metro" "Bus" "Autobus" "TRANSPORTATION" "TRANSPORT" "TRAM" "TRAMWAY" "METRO"})
(def playground #{"playground" "PLAYGROUND" "Playground"})
(def sport #{"calisthenic" "Calisthenic" "sport" "Sport" "CALISTHENIC" "SPORT"})
(def skate #{"Skate" "skate" "Skating" "SKATING"})
(def bike #{"Bike" "bike" "Biking" "BIKING"})
(def attraction #{"attractions" "Attractions" "entertainment" "Entertainment"})
(def help #{"HELP" "help"})
(def location #{"location" "LOCATION" "position" "POSITION" "place" "PLACE" "locality" "LOCALITY" })
(def parking #{"parking" "car" "Parking" "Car"})
(def étinéraire #{"itinerary" "Itinerary" "Path" "path" "PATH"})
(def hello #{"hello" "Hello" "HELLO"}) 
 (defn restart[]
        (println "Program finish...   Thank's you") (shutdown-agents) )

(println "For start the chatbot enter hello:")

(let [yayinput (read-line)]
  (cond
  (contains? hello yayinput)
  (println "Program starting...")
  :else ((restart) println " ")))



(println "1st Project of Symbolic Computation, chatbot Bastien")
(println " ")

(println "Hello, do you whant to start the chatbot Y/N?:  ")
 (let [yayinput (read-line)]
  (if (= yayinput "Y")
    (println "Ok let's start!")
   ((restart) println "wrong")))

(println "What's your name ?: ")
(def x (read-line))
(println "Hello"x"!")
(println " ")


(println "###################################################################")

(println "Here are all the parks in Prague:")
(println Parc2)
(println "[PRESS ENTER]")
(def r (read-line))


(println "INFORMATIONS or HELP ? ")
(let [p (read-line)]
(if (= p "INFORMATIONS")


 {  (println "About wich Parc ?: [choose Kampa]")
  (let [z (read-line)]
  (cond
  (contains? Parc z)

{  (println "The" z "park? Ok no problem what do you want to know ?")
  (let [v (read-line)]

    (if  (contains? transport v)
       (println "The kampa park is served by several trams No. 4, 7, 9, 10, 58, 59."))

    (if  (contains? étinéraire v)
       (println "OK, the localisation for "z" is:  Malá Strana, 118 00 Prague 1"))

    (if (contains? skate v)
        (println "Yes you can skating in the Kampa parc"))

    (if (contains? wc v)
        (println "Yes Kampa have"v",you can find them at the entrance"))

    (if (contains? bike v)
        (println "Yes in Kampa park you can biking, in kind it's even better ! "))

   (if (contains? sport v)
        (println "No you can't do"v"in Kampa..."))

   (if (contains? playground v)
        (println "Yes you have a "v"in Kampa..."))

   (if (contains? attraction v)
        (println "Yes you have a beautiful view of the Vltava, Sovovy Mlýny Gallery, Čertovka, Charles Bridge, Werich House, memorial trees.."))

   (if (contains? parking v)
        (println "Yes you a big Parking at the entrance of the Kampa park !"))
)}


 :else (println "Sorry i don't understand your request..."))(restart))}

(println "Some commands to help you with your request:
-Locations (for the geographical position of the park)
-Transport (by what transport is the park served ?)
-Playground (for know if the park have a playground)
-Sport (if the park have a place for do sport)
-Bike (if the park has a cycle path)
-Attractions (if the park have some ententairnment to do)
-Parking (for know if you can park your car)
-Skate
For any questions you can contact help@praguecollege.cz ")))

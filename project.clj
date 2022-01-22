(ns clojure.examples.hello
        (:gen-class))




(def Parc #{"KAMPA" "Bertramka" "Frantiskanska zahrada" "Obora Hvezda" "Kampa" "Kinsheho Zahrada" "Kalmovka" "Ladronka" "Letna" "Petrin" "Riegrovy sady" "Stromovka" "Vojanovy Sady" "Vysehrad" "bertramka"})
(def Parc2 #{"Petrin" "Riegrovy-sady" "Stromovka" "Vojanovy-Sady" "Vysehrad" "Bertramka" "Frantiskanska-zahrada" "Obora-Hvezda" "Kampa" "Kinsheho-Zahrada" "Kalmovka" "Ladronka" "Letna"})
(def wc #{"wc" "toilet" "privy" "WC" "TOILET" "PRIVY" "Wc" "Toilet" "Privy"})
(def transport #{"transportation" "transport" "tram" "tramway" "metro""bus" "autobus" "Transportation" "Transport" "Tram" "Tramway" "Metro" "Bus" "Autobus" "TRANSPORTATION" "TRANSPORT" "TRAM" "TRAMWAY" "METRO"})(def playground #{"playground" "PLAYGROUND" "Playground"})
(def sport #{"calisthenic" "Calisthenic" "sport" "Sport" "CALISTHENIC" "SPORT"})
(def skate #{"Skate" "skate" "Skating" "SKATING"})
(def bike #{"Bike" "bike" "Biking" "BIKING"})
(def attraction #{"attractions" "Attractions" "entertainment" "Entertainment"})

(def location #{"location" "LOCATION" "position" "POSITION" "place" "PLACE" "locality" "LOCALITY" })
(def parking #{"parking" "car" "Parking" "Car"})
(def étinéraire #{"itinerary" "Itinerary" "Path" "path" "PATH"})
(def hello #{"hello" "Hello" "HELLO" "helo" "HELO"})
(def information #{"information" "INFORMATION" "informations" "INFORMATIONS"})
(def animals #{"animals" "ANIMALS" "animal" "animale"  "ANIMAL"})
(def park #{"park" "PARK" "parks" "PARKS" "Parks"})
(def return #{"return" "Return" "Back" "back" "BACK" "RETURN"})
(def need_help #{ "Help" "HELP" "help"})
(def command #{ "command" "Command" "COMMAND" "comand" "Comand" "COMAND" "chatbot" "Chatbot" "CHATBOT" "chatbot command" "Chatbot command" "CHATBOT COMMAND" "commande" "Commande" "COMMANDE"})
(def Yes #{"Yes" "yes" "y" "Yeah" "yeah" "OK" "Ok" "ok" "Y" "O" "o"})
(def No #{"N" "n" "No" "NO" "Nop" "nop" "no" "Na" "na" })
(def exit #{"quit" "Quit" "Exit" "exit" "end" "End"})


(def Park3 #{"KAMPA" "BERTRAMKA" "FRANTISKANSKA" "OBORA" "Kampa" "Bertramka" "Frantiskanska" "Obora"})
(def KampaB #{"Magpie" "MagPie" "magpie" })

(def Kampa #{"Kampa" "kampa" "KAMPA"})
(def Bertramka #{"Bertramka" "bertramka" "BERTRAMKA"})
(def Obora #{"Obora" "obora" "OBORA"})
(def Frantiskanska #{"Frantiskanska" "frantiskanska" "FRANTISKANSKA"})

(def Full #{"Full" "FULL" "full"})
(def Mcolor #{"White" "white"  "blue" "Blue" "WHITE"  "BLUE"})
(def Ccolor #{"Full Black" "full black" "FULL BLACK" "Full black" "full Black" "black" "Black" "BLACK"})
(def Rcolor #{"Red" "RED" "red" "orange" "Orange" "ORANGE" "Gray" "gray" "GRAY"})
(def all_color #{"yellow" "orange" "pink" "violet" "beige" "Yellow" "Orange" "Pink" "Violet" "Beige"})
(def Mbeak #{"yellow" "Yellow" "YELLOW"})
(def Cbeak #{"Full Black" "full black" "FULL BLACK" "Full black" "full Black" "black" "Black" "BLACK"})
(def Rbeak #{"Brown" "brown" "BROWN" "Gray" "gray" "GRAY" "Full gray" "FULL GRAY" "full gray" "full brown" "Full brown" "FULL BROWN"})
(def all_color_without_black #{"Red" "RED" "red" "Orange" "ORANGE" "orange" "Gray" "gray" "GRAY"  "yellow"  "pink" "violet" "beige" "Yellow"  "Pink" "Violet" "Beige"})

(defn park_display []
(println "All parks: Kampa Bertramka Frantiskanska Obora"))

(defn restart[]
        (println "Program finish...   Thank's you") (shutdown-agents) )




(defn Help_animal_color []
(newline)
(newline)
(println "*Please be carreful if your animal have just one color put the adjective FULL before")
(newline)
(println" details of each animals:
- Magpie: Color= white, blue | Beak= short | Beak_color= yellow
- Crow: Color= full black | Beak= long | Beak_color= black
- Robin: Color= red, orange, gray | Beak= short | Beak_color= gray"))

(defn Help_park []
(newline)
(newline)
(println "Some commands to help you with your request:
-Locations (for the geographical position of the park)
-Transport (by what transport is the park served ?)
-Playground (for know if the park have a playground)
-Sport (if the park have a place for do sport)
-Bike (if the park has a cycle path)
-Attractions (if the park have some ententairnment to do)
-Parking (for know if you can park your car)
-Skate
For any questions you can contact help@praguecollege.cz "))

(defn Help_command []
(newline)
(newline)
(println "Some commands to better understand the chatbot:
- Help: for help anytime
- Exit: to leave the chatbot
- Yes:  a positive response from the user
- No:   a negative response from the user  "))



(defn for_information []
(newline)
(println "For information: this program is to know if you found a Magpie,  a Crow or Robin in different park in prague")
(println "[PRESS ENTER FOR CONTINUE]")
(def ze (read-line)))

(defn help_type []
    (newline)
(println "Your request is about animals, parks or chatbot command ?")
 (let [sk (read-line)]
  (cond
  (contains? animals sk)
  (Help_animal_color)



  (contains? park sk)
  (Help_park)

  (contains? command sk)
      (Help_command)
  :else (println"Sorry i don't understand... ") )))

(defn exif []

  (println "Have you finish with your research ? [yes no]")

  (let [yo (read-line)]

    (cond
      (contains? Yes yo)
      (println "Thank you, have a good day !")
      (contains? No yo)
      (println "Ok progaming restarting..." )
      (contains? need_help yo ) (println (help_type))
      :else (println "aie"))))

(defn sorting_magpie []
    (newline)
    (println "Interesting ! was there another color? ? [yes no] ")
   (let [va (read-line)]
     (cond (contains? Yes va)
         {(println "what other color was it?")
           (let [jh (read-line)]
            (cond
             (contains? Mcolor jh)
             (println "Ok so your animal had two color, another one ? [yes no]")
             (contains? need_help jh)
             {(help_type) (sorting_magpie)}
             (contains? exit jh)
             (exif)
             :else {(println"there is no animal of this color in all the parks please retry") (sorting_magpie)})

                   (let [oij (read-line)]
                   (cond (contains? Yes oij)
                       {(println "what other color was it?")
                        (let [sq (read-line)]
                                (cond (contains? Mcolor sq)
                                 {(println "Ok what was the color of its beak ?")
                                   (let [pd (read-line)]
                                     (cond (contains? Mbeak pd)
                                        (println "I m pretty sure the bird you saw was a magpie")
                                        (contains? need_help pd)
                                         {(help_type) (sorting_magpie)}
                                           (contains? exit pd)
                                             (exif)))}
                                   (contains? need_help sq)
                                   {(help_type) (sorting_magpie)}
                                    (contains? exit sq)
                                     (exif)))}
                            (contains? need_help oij)
                            {(help_type) (sorting_magpie)}
                            (contains? exit oij)
                            (exif))


                   (cond (contains? No oij)
                       {(println "OK what was the color of its beak ? | help for more information")
                         (let [dp (read-line)]
                                     (cond (contains? Mbeak dp)
                                        (println "I'm pretty sure the bird you saw was a magpie")
                                        (contains? exit dp)
                                         (exif)
                                        (contains? need_help dp)
                                        {(help_type) (sorting_magpie)}
   :else { (println "i think you try to say yellow because it's not possible a bird with a"dp"beak and a"jh"color or  we did not offer it to you in this chatbot")(sorting_magpie)}))})))})


     (cond (contains? No va)
         {(println "OK what was the color of its beak ?")
             (let [zs (read-line)]
              (cond (contains? Mbeak zs)
              (println "I'm pretty sure the bird was a magpie")
              (contains? need_help zs)
                            {(help_type)(sorting_magpie)}
                            (contains? exit zs)
                                  (exif)))})

      (cond (contains? need_help va)
          {(help_type) (sorting_magpie)})
     (cond (contains? exit va)
         (exif))))

(defn sorting_crow []
(newline)
(println "Interesting ! if your animal is black normally it should not have a second color")
(println "what was the color of its beak ?")
(let [tj (read-line)]
   (cond (contains? Cbeak tj)
    {(println "Ok so this beak was black, do you remember if this beak was long? [yes no]")
        (let [po (read-line)]
         (cond (contains? Yes po)
             {(println "Ok im pretty sure you saw a Crow !")
                (newline)
                 (println "Another bird ? [yes no]")
              (let [ei (read-line)]
              (cond (contains? Yes ei)
               (sorting_crow)
               (contains? No ei)
               (exif)))}
           (contains? need_help po)
           {(help_type) (sorting_crow)}
            (contains? exit po)
            (exif) )
          (cond (contains? No po)
 {(println "I think you must be mistaken if the animal is all black with a black beak normally its beak must be long because the animal is a crow")
                 (newline)
                 (println "Another bird ? [yes no]")
              (let [ei (read-line)]
              (cond (contains? Yes ei)
               (sorting_crow)
               (contains? No ei)
               (exif)))}
            (contains? need_help po)
           {(help_type) (sorting_crow)}
            (contains? exit po)
            (exif))
        (cond (contains? need_help po)
        {(help_type) (sorting_crow)})

        (cond (contains? exit po)
         (exif))
         (cond (contains? all_color_without_black po)
               {(newline) {(newline)(println "No it's not possible the animal you saw had a"po"beak")}}))}

           (contains? need_help tj)
           {(help_type) (sorting_crow)}
          (contains? exit tj)
           (exif)
          (contains? all_color_without_black tj)
           {(println "No it's not possible the animal you saw had a"tj"beak because he is full black please retry ") (sorting_crow)}
         :else {(println "Sorry i don't understand can you repeat ?")(sorting_crow)})

     (cond (contains? need_help tj)
        {(help_type) (sorting_crow)})

      (cond (contains? exit tj)
         (exif))))

(defn sorting_robin []
    (newline)
    (println "Interesting ! was there another color? ? [yes no] ")
   (let [ga (read-line)]
     (cond (contains? Yes ga)
         {(println "what other color was it?")
           (let [hj (read-line)]
            (cond
             (contains? Rcolor hj)
             (println "Ok so your animal had two color, another one ? [yes no]")
             :else {(println"there is no animal of this color in all the parks please retry") (sorting_robin)})
  (let [ge (read-line)]
                   (cond (contains? Yes ge)
                       {(println "what other color was it?")
                        (let [pj (read-line)]
                                (cond (contains? Rcolor pj)
                                 {(println "Ok what was the color of its beak ?")
                                   (let [pde (read-line)]
                                     (cond 
                                       (contains? exit pde)
                                        (exif)
                                          (contains? Rbeak pde)
                                        (println "I m pretty sure the bird you saw was a Robin")
                                    :else { (println "i think you try to say gray or brown because it's not possible a bird with a"pde"beak and a"pj"color or  we did not offer it to you in this chatbot")(sorting_robin)}))}))})


                   (cond (contains? No ge)
                       {(println "OK what was the color of its beak ? | help for more information")
                         (let [dpd (read-line)]
                                     (cond (contains? Rbeak dpd)
                                        (println "I'm pretty sure the bird you saw was a Robin")
                                        (contains? need_help dpd)
                                        {(help_type) (sorting_robin)}
   :else { (println "i think you try to say gray or brown because it's not possible a bird with a"dpd"beak and a"hj"color or  we did not offer it to you in this chatbot")(sorting_robin)}))})))})


  
     (cond (contains? No ga)
         {(println "OK what was the color of its beak ?")
             (let [sz (read-line)]
              (cond (contains? Rbeak sz)
              (println "I'm pretty sure the bird was a Robin")
              (contains? need_help sz)
              {(help_type) (sorting_robin)}
               :else { (println "i think you try to say gray or brown because it's not possible a bird with a"sz"beak and a"ga"color or  we did not offer it to you in this chatbot")(sorting_robin)}))})
      
(cond (contains? need_help ga)
          {(help_type) (sorting_robin)})
     (cond (contains? exit ga)
         (exif))))

(defn color_magpie_crow []
(newline)
(newline)
(println "*your animal only has one color, put the adjective FULL before your color for more information enter HELP")

(println "What was the principal color of the animal ? ")
 (let [ks (read-line)]

  (cond (contains? Mcolor ks)
   (sorting_magpie)

   (contains? Ccolor ks)
      (sorting_crow)
 (contains? need_help ks)
      {(help_type) (color_magpie_crow)}
   (contains? exit ks)
      (exif)
   :else {(println"sorry we don't have any birds with"ks" color in Obora park please try again | enter help for more information")(color_magpie_crow)})))

(defn color_magpie_robin []
(newline)
(newline)


(println "What was the principal color of the animal ? ")
 (let [zg (read-line)]

   (cond (contains? Mcolor zg)
   (sorting_magpie)

   (contains? Rcolor zg)
      (sorting_robin)

  (contains? need_help zg)
      {(help_type) (color_magpie_robin)}
   (contains? exit zg)
      (exif)
   :else {newline {(println"sorry we don't have any birds with"zg" color in Frantiskakska park please try again | enter help for more information")(color_magpie_robin)}})))


(defn color_robin_crow []
(newline)
(newline)


(println "What was the principal color of the animal ? ")
 (let [pe (read-line)]

   (cond
   (contains? Rcolor pe)
   (sorting_robin)

   (contains? Ccolor pe)
      (sorting_crow)

  (contains? need_help pe)
      {(help_type) (color_robin_crow)}
   (contains? exit pe)
(exif)
   :else {newline {(println"sorry we don't have any birds with"pe" color in Bertramka park please try again | enter help for more information")(color_magpie_robin)}})))


(defn color_robin_crow_magpie []
(newline)
(newline)


(println "What was the principal color of the animal ? ")
 (let [hd (read-line)]

   (cond (contains? Rcolor hd)
   (sorting_robin)

   (contains? Ccolor hd)
      (sorting_crow)

   (contains? Mcolor hd)
      (sorting_magpie)

  (contains? need_help hd)
      {(help_type) (color_robin_crow)}
   (contains? exit hd)
      (exif)
   :else {newline {(println"sorry we don't have any birds with"hd" color in Kampa park please try again | enter help for more information")(color_magpie_robin)}})))



(defn animal_programe []
(for_information)
(println  "In which park  you were ? | All parks: Obora Bertramka Frantiskanska Kampa")
(let [rtx (read-line)]
(cond
(contains? Obora  rtx)
{(newline)
{(newline)
{(println "In" rtx "you have magpies and crow, let's find out what you saw!")
  (color_magpie_crow)}}}
(contains? Bertramka  rtx)
{(newline)
{(newline)
{(println "In" rtx "you have robin and crow, let's find out what you saw!")
(color_robin_crow)}}}
(contains? Frantiskanska  rtx)
{(newline)
{(newline)
{(println "In" rtx "you have magpies and robins,let's find out what you saw!")
(color_magpie_robin)}}}

(contains? Kampa  rtx)
{(newline)
{(newline)
{(println "In" rtx "you have crow, magpies and robins ! let's find out what you saw!")
(color_robin_crow_magpie)}}}

(contains? need_help  rtx)
{(help_type)(animal_programe)}

(contains? exit rtx)
(exif)

:else {(newline) {(println "Sorry i don't understand... can you retry please")(animal_programe)}})))


(println "For start the chatbot say: hello")
(let [yayinput (read-line)]
  (cond
  (contains? hello yayinput)
  (println "Program starting...")
 :else ((restart) println " ")))

(println " ")
(println "What's your name ?: ")
(def x (read-line))
(println "Hello"x",let's start !")
(println " ")

(println "###################################################################")


(println "1st Project of Symbolic Computation, chatbot Bastien")



(newline)
(println "[PRESS ENTER FOR CONTINUE]")
(def r (read-line))

(defn programe []
(newline)
(println "INFORMATIONS or HELP ? ")

(let [p (read-line)]
(cond (contains? information p)
      {

(println "wich type of informations ? [park or animals]")
(println "")

(let [input (read-line)]
(cond
(contains? exit input)
(println (exif))

(contains? animals input)
(animal_programe)

(contains? need_help input){(help_type) (programe)}
(contains? park input)
(println "About wich Parc ?: [choose Kampa]")
:else {(newline) {(println"Excuse me i don't understand can you repeat please..") (programe)}}))

 (let [z (read-line)]
  (cond
  (contains? Kampa z)

{  (println "The" z "park? Ok no problem what do you want to know ?")
  (let [v (read-line)]


    (if (contains? need_help v)
        (println (Help_animal_color)))
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
        (println "Yes you a big Parking at the entrance of the Kampa park !")))}

 :else (restart)))}

(contains? exit p)
      (exif)
(contains? need_help p)
{(help_type)(programe)}
:else {(println"Excuse me i don't understand can you retry, for more informations enter help") (programe)})))


(programe)


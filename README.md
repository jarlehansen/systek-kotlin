# Kotlin
---

Java interoperability was one of the cornerstones of Kotlin. Interoperability is very important for introducing Kotlin gradually to an existing Java codebase. Even when writing a new project from scratch, one has to fit the language into the bigger picture of the platform with all of its libraries written in Java.

The idea of Kotlin was concieved at Jetbrains in 2010. We needed full compatibility with the existing Java code. Kotlin 1.0 came out 5 years after the first commit to the repository.

Kotlin is named after an island near St. Petersburg, Russia, where most of the Kotlin development team is located. In using an island name, we followed the precedent estabilished by Java and Ceylon, but we decided to go for something closer to our homes.

---

## Bakgrunn

* Arbeidet med Kotlin startet i 2010 hos JetBrains
* 1.0 versjonen ble sluppet i starten av 2016

---

## Funksjonelt eller objekt-orientert?

1: f(o);  (1. we see a function named f being called upon an object named o.)
2: o.f(); (2. we see an object named o being sent the message named f.)
- https://blog.cleancoder.com/uncle-bob/2018/04/13/FPvsOO.html


- OOP says that bringing together data and its associated behavior in a single location (called an “object”) makes it easier to understand how a program works. 
- FP says that data and behavior are distinctively different things and should be kept separate for clarity. (In a functional program, every time you call a particular function with a particular value, you will get the same result)
-- https://www.codenewbie.org/blogs/object-oriented-programming-vs-functional-programming

A good functional program can (and should) be object oriented. And that a good object oriented program can (and should) be functional.

FP and OO work nicely together. Both attributes are desirable as part of modern systems. A system that is built on both OO and FP principles will maximize flexibility, maintainability, testability, simplicity, and robustness.

- https://blog.cleancoder.com/uncle-bob/2018/04/13/FPvsOO.html

---

## Hvorfor Kotlin?

* Fungerer med Java
  * Java -> Kotlin
  * Kotlin -> Java
* Er laget for å være mer konsist, produktivt og tryggere alternativ til Java. Skal kunne brukes i alle tilfeller hvor Java brukes i dag.
https://insights.stackoverflow.com/survey/2018/#technology-most-loved-dreaded-and-wanted-languages

* Null safety
* Extension functions
* Java interoperability

---

## Hva brukes Kotlin til?
 (undersølkelse fra 2018)
* 80% er Android utviklere
  * I 2017 ble Kotlin et offisielt språk for Android utvikling (https://techcrunch.com/2017/05/17/google-makes-kotlin-a-first-class-language-for-writing-android-apps/)
* 31% back-end
  * Mange populære biblioteker/rammeverk lager egne Kotlin tilpassninger
  * Spring støtte
  * Jackson (JSON)
(https://thenewstack.io/what-we-learned-about-kotlins-growth-this-year/)

---

## Koltin i Systek
* Skatteetaten
* TechnipFMC
* NRK?


---

## Oslo Kotlin meetup

https://www.meetup.com/meetup-group-nWeRbyMu/
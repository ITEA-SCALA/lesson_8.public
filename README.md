[snipboard.io](https://snipboard.io/)

# Небольшое введение в Scalatest

* https://habr.com/ru/post/209578

**ScalaTest** — ( www.scalatest.org ) это фреймворк для тестирования приложений, поддерживающий разные стили написания тестов.

Каждый из поддерживаемых стилей тестирования в **Scalatest** создан для использования в определенных целях.

---

Для использования каждого из стилей тестирования, необходимо создать класс, который будет реализовывать trait, в котором определён этот стиль тестирования.

Выбранный стиль определяет только то, как выглядят декларации тестов, все остальные возможности фреймворка будут работать одинаково, вне зависимости от того, какой из стилей тестирования был выбран.

---

### FlatSpec

**FlatSpec** — используют для юнит-тестов и для интеграционного тестирования.

**FlatSpec** это DSL позволяющий писать тесты в виде как можно более приближённом к написанию спецификации поведения тестируемого класса.

- **Assertions** в каждом стиле по умолчанию доступно 3 ассерта:
  - `assert` — для обычных проверок
  - `assertResult` — для проверки совпадения полученного и ожидаемого результата
  - `intercept` — для проверки что метод бросает ожидаемое исключение
- **Matchers**
  - `be` — одно из ключевых слов, которое можно использовать если подключить миксин *Matchers* в класс (который реализует тест)
- **Равенство** размер объекта, длина объекта
- **Проверка строк**
- **Проверка чисел**
- **Проверка булевых свойств**
- **Коллекции**
- **Свойства класса**
- **Соединение проверок логическими функциями**


### FeatureSpec

**FeatureSpec** — используют для приемочного тестирования.

**FeatureSpec** нацелен на создание приемочных тестов, облегчая программистам задачу работающим с не тестировщиками.


---

# Dan Rosen: Scala Monads

* В этом видеоуроке Дэн Розен покажет вам, как использовать возможности Scala для монадического проектирования, чтобы исключить повторяющийся шаблон в вашем коде.
  * `Tagir: Опциональные значения, Монады` **(** [HelloScala1~Main22](https://github.com/Home-SCALA3/MyHelloScala1/blob/master/src/main/scala/example/Main22.scala) **)** https://groz.github.io/scala/intro/monads
  * `Martin Odersky: Implicit Parameters` **(** [HelloScala1~Main33](https://github.com/Home-SCALA3/MyHelloScala1/blob/master/src/main/scala/example/Main33.scala) **)** https://www.youtube.com/watch?v=ieo9pV-0zEY
  * **(** [HelloScala1](https://github.com/ITEA-SCALA/HelloScala1) **)**  https://www.youtube.com/watch?v=Mw_Jnn_Y5iA  

## Scala with Cats (Scala – Introduction to Cats)

* `Конспект по Scala with Cats`: https://blog.maizy.ru/posts/scala-cats-summary
* `Lightbend for Scala`: https://github.com/ITEA-SCALA/LessonCatsZIO

[Практический пример с CodersBistro](https://github.com/ITEA-SCALA/lesson_4.public)
**(** [CodersBistro: akka-http-REST-application](https://github.com/CodersBistro/akka-http-REST-application) **)**


---

* В Idea IntelliJ IDEA есть возможность редактировать несколько строк.
  Использование: `Alt` + `Shift` + `Щелчок мышью`
* В Idea IntelliJ IDEA есть возможность генерировать объявление переменной, которая будет соответствовать правостороннему выражению.
  Использование: после правостороннего выражения нужно написать `.va` + `Щелчок Enter`
* В Idea IntelliJ IDEA есть возможность использовать автоматическое форматирование: `CTRL` + `ALT` + `L`
* В Idea IntelliJ IDEA есть возможность использовать конвертер синтаксического сахар (Desugar Scala Code...): `CTRL` + `ALT` + `D` 
* **(** [Полезные комбинации в IntelliJ IDEA](https://otus.ru/nest/post/494) **)**


---

[Ссылка на запись 8 занятия](https://us02web.zoom.us/rec/share/MhCUP09CEzc7EZxNyu85ut-qnSqRZfkXj3djDZXHLTeCkDmT143l2t56ZoFBYELs.r1XE9mi1J7D-sl5c)

* `Scala Docs` https://github.com/Home-SCALA2/docs

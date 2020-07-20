# Task Manager

#### 0. Mirroring repositories ####

https://github.com/Shacoss/JSE

#### 1. Требования к  SOFTWARE

- OPENJDK 11

#### 2. Стек технологий

- Apache Maven

#### 3. Разработчик
Name: Koptev Anton

Email: koptev_av@nlmk.com

#### 4. Команды для сборки приложения
```mvn clean``` - Удаление всех созданных в процессе сборки артефактов

```mvn compile``` - Компилирование проекта

```mvn test``` - Тестирование с помощью JUnit тестов

```mvn install``` - Копирование .jar (war , ear) в локальный репозиторий

```mvn deploy``` - Публикация файла в удалённый репозиторий


#### 5. Команды для запуска приложения

Команда для запуска приложения:
```bash
java -jar target/jse-04-1.0-SNAPSHOT.jar
```  

Терминальные команды:

* help - Отображение списка терминальных команд;

* version - Отображение версии программы;

* about - Отображение информации об разработчике;

* exit - Выход из программы.

Пример запуска приложения с теринальной командой:

```bash
java -jar target/jse-04-1.0-SNAPSHOT.jar help
```



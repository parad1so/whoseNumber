<p align="center"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Spring_Framework_Logo_2018.svg/1280px-Spring_Framework_Logo_2018.svg.png" 
 alt="Spring"  height="100"  />
  <img src = "https://www.svgrepo.com/show/13238/plus-cross.svg"
   alt="Spring"  height="100" />
 <img src="https://alexkosarev.name/wp-content/uploads/2019/01/spring_boot_logo.png" 
  alt="Spring Boot"  height="100"  />
  
 
 </p>
<p align="right"></p>

# Веб-приложение для определителя номера
Всем привет!

## Суть проекта
Имеется веб-приложение которое принимает в поле ввода номер и сообшает пользователю информацию об этом номере, есть возможность дообавление статусов, комментариев.
в дальнейшем требуется прикрутить мобилку на iOS Android

## Создание БД
Запустите скрипт для создания базы данных по пути: src/test/sql/createDb.sql 

## Разработка
- Язык разработки: **Java 8**
- Фреймворк: **Spring Boot 2**
- Сурбд: пока что **MySql**
- JPA: **Hibernate 5, Spring Data Jpa 2**
- JDBC: **Spring JDBC 5**
- Security: **Spring Security 5**
- Сборка: **Maven**
## API

Это веб приложение себя включает:
- Авторизация
- Аутентификация
- Работа с базой данных: _просмотр_, _создание_, _редактирование_ и _удаление сущностей_
- Конвертер _json to javaObject_ с помощью фреймворка **Jackson**
- Хеширование паролей с помощью фреймворка **Spring Security Bcrypt**

## Application Deployment
Данное приложение развертывалось при помощи **Apache Tomcat 8** по адресу __localhost:8080__

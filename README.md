# Email Sending Service

## Описание
Это простое Spring Boot приложение для отправки электронных писем через SMTP-сервер Яндекса с использованием JavaMailSender. Приложение отправляет письма с указанным адресом отправителя, темой и текстом.

## Как запустить
1. Склонируйте проект.
2. Настройте параметры почты в файле `application.properties`:
    ```properties
    spring.mail.host=smtp.yandex.ru
    spring.mail.port=465
    spring.mail.username=ваш_адрес@yandex.ru
    spring.mail.password=пароль_приложения
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=false
    spring.mail.properties.mail.smtp.ssl.enable=true
    spring.mail.properties.mail.smtp.ssl.trust=smtp.yandex.ru
    spring.mail.properties.mail.debug=true
    ```

## Как получить пароль приложения на Яндексе
1. Перейдите на страницу управления аккаунтом Яндекса: [Управление аккаунтом](https://passport.yandex.ru/profile).
2. Перейдите в раздел **Пароли и авторизация**.
3. В разделе **Пароли приложений** нажмите на кнопку **Создать пароль приложения**.
4. Выберите тип приложения (например, почтовый клиент) и сгенерируйте пароль.
5. Скопируйте сгенерированный пароль и используйте его в качестве значения для `spring.mail.password`.

## Использование
После настройки почты можно использовать сервис для отправки писем:

```java
@Autowired
private EmailService emailService;

public void sendTestEmail() {
    emailService.sendMail("получатель@example.com", "Тема письма", "Текст письма");
}
```

## Зависимости
Проект использует следующие зависимости:

* Spring Boot
* Spring Mail
* Lombok

## Лицензия
Проект предоставляется "как есть" без каких-либо гарантий.
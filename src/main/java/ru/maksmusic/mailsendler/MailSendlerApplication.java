package ru.maksmusic.mailsendler;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ru.maksmusic.mailsendler.service.EmailService;

@SpringBootApplication
@AllArgsConstructor
public class MailSendlerApplication {

    EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(MailSendlerApplication.class, args);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void sendEmail() {
        emailService.sendMail("djdaguddajazz@gmail.com", "Java", "Hillo");
    }

}

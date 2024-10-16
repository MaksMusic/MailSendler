package ru.maksmusic.mailsendler.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class EmailService {

    private JavaMailSender mailSender;

    public void sendMail(String to, String subject, String text) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("maksmusic05@yandex.ru");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setText(text);
        simpleMailMessage.setSubject(subject);


        mailSender.send(simpleMailMessage);
    }




}

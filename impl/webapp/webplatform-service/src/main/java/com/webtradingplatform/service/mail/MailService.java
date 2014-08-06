package com.webtradingplatform.service.mail;

import com.webtradingplatform.model.Mail;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Author: Daniel
 */
@Service
public class MailService implements IMailService {

    @Autowired
    private MailSender mailSender;

    @Autowired
    private VelocityEngine velocityEngine;

    @Override
    public void sendMail(Mail mail) throws MailException {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getContent());

        mailSender.send(message);
    }
}

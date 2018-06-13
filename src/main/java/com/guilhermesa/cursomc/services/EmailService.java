package com.guilhermesa.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.guilhermesa.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}

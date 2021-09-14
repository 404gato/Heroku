package org.generation.BlogPessoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class BlogPessoalApplication {
	
	@GetMapping
	public String oi() {
		return "<font size=+2>Olá! Bem vindo "
				+ "</font><br><br> Clique <a href = \"/mental\">aqui</a> para ser redirecionado às minhas mentalidades"
				+ "<br> Ou clique <a href = \"/obj\">aqui</a> para ser redirecionado aos meus objetivos desta semana"
				+ "<br><br>Obrigada por me visitar!<br><br>"
				+ "<img src=\"https://pbs.twimg.com/media/D5A07V0WkAAINmh.jpg\">";
	}
	
	@GetMapping("/mental")
	public String mentalidades() {
		return "<font size=+2>MENTALIDADES</font><br><br>"
				+ " - Persistência<br> - Atenção aos <b>detalhes</b><br> - Mentalidade de crescimento<br><br>"
				
				+ "<img src =\"https://conteudo.imguol.com.br/2013/05/01/cerebro-forte-exercicio-para-o-cerebro-cerebro-afiado-memoria-memoria-afiada-1367438219245_615x300.jpg\">"
				+ "<br><a href=\"/\">inicio</a>";
	}
	
	@GetMapping("/obj")
	public String objetivos() {
		return "<font size=+2>OBJETIVOS</font><br><br>"
				+ " - Me focar nas aulas<br>"
				+ " - Buscar materiais gratuitos na internet<br>"
				+ " - Organizar minha agenda de afazeres<br>"
				+ "<a href=\"/\">inicio<br>"
				+ "<img src=\"https://image.freepik.com/vetores-gratis/mao-desenho-ilustracao-de-objetivo-objetivo-conceito_53876-35516.jpg\">";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(BlogPessoalApplication.class, args);
	}

}

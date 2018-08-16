package br.com.sinergia;

import br.com.sinergia.utils.SinergiaLogger;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SinergiaApp {

	private static final Logger log = SinergiaLogger.setLogger(SinergiaApp.class);

	public static void main(String[] args) {
		log.info("Iniciando SinergiaIO");
		SpringApplication.run(SinergiaApp.class, args);
	}
}

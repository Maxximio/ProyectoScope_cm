package ec.edu.uce;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.service.scope.IMatriculaPrototypeService;
import ec.edu.uce.service.scope.IMatriculaSingletonService;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"cm.com.ec.edu.service.scope", "cm.com.ec.edu.service.scope.IMatriculaSingletonService"})
public class DemoApplication implements CommandLineRunner{
	
	private static final Logger LOG= LogManager.getLogger(DemoApplication.class);


	@Autowired
	private IMatriculaSingletonService objeto1;
	
	@Autowired
	private IMatriculaSingletonService objeto2;
	
	//Scope Prototype
	@Autowired
	private IMatriculaPrototypeService pro1;
	
	@Autowired
	private IMatriculaPrototypeService pro2;
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("Impresion valor objeto 1");
		this.objeto1.establecerDato("Carlos");
		LOG.info(this.objeto1.obtenerCodigo());
		LOG.info("Impresion valor objeto 2");
		LOG.info(this.objeto2.obtenerCodigo());
		this.objeto2.establecerDato("Pepe");
		LOG.info("Impresion valor objeto 1 y 2");
		LOG.info(this.objeto1.obtenerCodigo());
		
		LOG.info(this.objeto2.obtenerCodigo());
		
		LOG.info("------------Prototype-------------");
		this.pro1.EstablecerNombre("Patricio");
		LOG.info(this.pro1.obtenerNombre());
		LOG.info("pro2");
		this.pro2.EstablecerNombre("Maria");
		LOG.info(this.pro2.obtenerNombre());
		
	}

}

package ec.edu.uce.service.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MatriculaPrototypeServiceImpl implements IMatriculaPrototypeService{

	private String nombre;
	
	@Override
	public String EstablecerNombre(String valor) {
		this.nombre=valor;
		return this.nombre;
	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//set y get
	
}

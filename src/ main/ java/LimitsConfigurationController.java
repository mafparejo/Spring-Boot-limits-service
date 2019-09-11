paquete  com.microservicios.parejo.limitsservice ;

import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.web.bind.annotation.GetMapping ;
import  org.springframework.web.bind.annotation.RestController ;

@RestController
public  class  LimitsConfigurationController {

	@Autowired
	 configuración de configuración privada ;
	
	
	@GetMapping ( " / limites " )
	public  LimitConfiguration  recuperarLimiteConfiguration () {
		boolean recuperoBoolean = config . isSino ();
		if (recuperoBoolean) {
			return  new  LimitConfiguration (config . isSino ());
		}
		return  new  LimitConfiguration (config . getMaximo (), config . getMinimo (), config . getNombre (), config . isSino ());
	}
}

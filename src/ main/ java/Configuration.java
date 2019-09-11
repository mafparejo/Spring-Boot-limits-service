paquete  com.microservicios.parejo.limitsservice ;

importar  org.springframework.boot.context.properties.ConfigurationProperties ;
import  org.springframework.stereotype.Component ;

@Componente
@ConfigurationProperties ( " limites-servicio " )
 Configuración de clase  pública {

	privado  int minimo;
	privada  int maximo;
	 Cadena privada nombre;
	 sino booleano privado ;
	
	public  String  getNombre () {
		volver nombre;
	}
	public  void  setNombre ( String  nombre ) {
		esta . nombre = nombre;
	}
	public  int  getMinimo () {
		retorno minimo;
	}
	public  void  setMinimo ( int  minimo ) {
		esta . minimo = minimo;
	}
	public  int  getMaximo () {
		volver maximo;
	}
	public  void  setMaximo ( int  maximo ) {
		esta . maximo = maximo;
	}
	
	public  boolean  isSino () {
		volver sino;
	}
	público  vacío  setSino ( sino booleano  ) {
		esta . sino = sino;
	}
	
}

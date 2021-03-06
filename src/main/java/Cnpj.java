public class Cnpj implements Documento {
	
	private final String valor;

	public Cnpj(String valor) {
		this.valor = valor;
	}

	public String getValor(){
		return valor;
	}
	
	public String toString(){
		return valor;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Cnpj)){
			return false;
		}
		Cnpj outro = (Cnpj) o;
		return this.valor.equals(outro);
	}
	
	@Override
	public int hashCode() {
		return this.valor.hashCode();
	}
	
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int segundoDigitoCorreto() {

		return 2;
	}

	private int segundoDigitoVerificador() {

		return 1;
	}

	private int primeiroDigitoVerificador() {

		return 1;
	}

	private int primeiroDigitoCorreto() {

		return 1;
	}
}

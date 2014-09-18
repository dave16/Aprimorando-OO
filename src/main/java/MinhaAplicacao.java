public class MinhaAplicacao {

	public static void main(String[] args) {

		// BancoDeDados bd = new BancoDeDados("localhost", "usuario" , "123");
		Arquivo bd = new Arquivo();
		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		registraDividas(balanco);
		realizaPagamentos(balanco);
		// bd.desconecta();
	}

	private static void registraDividas(BalancoEmpresa balanco) {
		Divida divida1 = new Divida();
		Divida divida2 = new Divida();

		divida1.setCredor("Uma empresa");
		divida1.setDocumentoCredor(new Cnpj("00.000.001/0001-01"));
		divida1.setTotal(100);

		divida2.setCredor("Meu vizinho");
		divida2.setDocumentoCredor(new Cpf("000.000.001-01"));
		divida2.setTotal(100);

		balanco.registraDivida(divida1);
		balanco.registraDivida(divida2);
	}

	private static void realizaPagamentos(BalancoEmpresa balanco) {
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();

	}
}

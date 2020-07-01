package br.com.alura.aula01.coesao;

public enum Cargo {

	// Quando for criado um cargo, será passado atráves
	// deste ENUM, a regra de negócio de cada cargo.
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new QuinzeOuVintePorcento()),
	TESTER(new QuinzeOuVintePorcento());
//	SECRETARIO(new CincoOuVintePorcento());

	/*
	 * se eu criar um cargo novo, por exemplo SECRETARIO, se eu fizer isso
	 * aqui, o código não compila. Ele vai, obrigatoriamente, me pedir o quê? Uma
	 * regra de cálculo. Sempre que eu criar um enum novo, o compilador vai me
	 * avisar e vai pedir pra eu passar ali a regra de cálculo. Não tem como
	 * eu criar um cargo sem passar a regra de cálculo.
	 * “Ah, mas estou criando um cargo que não tem regra”, ótimo. Você vai criar
	 * a regra e vai colocar no enum. Tudo ligadinho no meu sistema, eu não vou 
	 * ter o problema de esquecer de passar uma regra pra um cargo.
	 */

	private RegraDeCalculo regra;

	// construtor
	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	// getter
	public RegraDeCalculo getRegra() {
		return regra;
	}
}

package br.com.alura.aula02.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	
	@Override
    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
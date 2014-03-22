package javaes.main;

import javaes.dados.IPessoaJPA;
import javaes.dados.ITelefoneJPA;
import javaes.dados.PessoaJPA;
import javaes.dados.TelefoneJPA;
import javaes.modelo.Pessoa;
import javaes.modelo.Telefone;

public class JPAMain 
{
	public static void main(String[] args) 
	{
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pessoa");
		pessoa.setCpf("111111111111");
		
		IPessoaJPA ipessoa = new PessoaJPA();
		ipessoa.salvar(pessoa);
		
		Telefone telefone = new Telefone();
		telefone.setNumero("99999999");
		telefone.setTipo("Celular");
		telefone.setPessoa(pessoa);
		
		ITelefoneJPA itelefone = new TelefoneJPA();
		itelefone.salvar(telefone);
	}
}

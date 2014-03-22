package javaes.dados;

import javaes.modelo.Pessoa;

public interface IPessoaJPA 
{
	void salvar(Pessoa pessoa);
	void deletar(Pessoa pessoa);
}

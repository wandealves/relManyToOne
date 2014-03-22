package javaes.dados;

import javaes.modelo.Telefone;

public interface ITelefoneJPA 
{
	void salvar(Telefone telefone);
	void deletar(Telefone telefone);
}

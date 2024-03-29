package javaes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone 
{
	@Id @GeneratedValue
	private Long id;
	private String tipo;
	private String numero;
	@ManyToOne
	private Pessoa pessoa;
	
	public Telefone(){}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getNumero() 
	{
		return numero;
	}

	public void setNumero(String numero) 
	{
		this.numero = numero;
	}

	public Pessoa getPessoa() 
	{
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) 
	{
		this.pessoa = pessoa;
	}
	
}

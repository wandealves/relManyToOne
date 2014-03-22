package javaes.dados;

import javaes.modelo.Pessoa;
import javaes.util.JPAUtil;
import javax.persistence.EntityManager;

public class PessoaJPA implements IPessoaJPA
{

	@Override
	public void salvar(Pessoa pessoa) 
	{
		EntityManager em = JPAUtil.getEntityManager();	
		try
		{
			em.getTransaction().begin();
			em.persist(pessoa);
			em.getTransaction().commit();
		}
		catch(Exception erro)
		{
			em.getTransaction().rollback();
		}	
		finally
		{
			if(em.isOpen()) em.close();
		}
	}

	@Override
	public void deletar(Pessoa pessoa) 
	{
		EntityManager em = JPAUtil.getEntityManager();	
		try
		{
			em.getTransaction().begin();
			em.remove(pessoa);
			em.getTransaction().commit();
		}
		catch(Exception erro)
		{
			em.getTransaction().rollback();
		}	
		finally
		{
			if(em.isOpen()) em.close();
		}
	}

}

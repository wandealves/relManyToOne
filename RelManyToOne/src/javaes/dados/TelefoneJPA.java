package javaes.dados;

import javax.persistence.EntityManager;
import javaes.modelo.Telefone;
import javaes.util.JPAUtil;

public class TelefoneJPA implements ITelefoneJPA
{

	@Override
	public void salvar(Telefone telefone) 
	{
		EntityManager em = JPAUtil.getEntityManager();	
		try
		{
			em.getTransaction().begin();
			em.persist(telefone);
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
	public void deletar(Telefone telefone) 
	{
		EntityManager em = JPAUtil.getEntityManager();	
		try
		{
			em.getTransaction().begin();
			em.remove(telefone);
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

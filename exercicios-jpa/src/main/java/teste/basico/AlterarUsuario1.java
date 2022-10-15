package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		
		/*detach faz com que a entidade buscada no banco se torne não gerenciada, assim as alterações no banco
		só serão feitas caso o método merge seja chamado*/
		em.detach(usuario);
		
		usuario.setNome("André");
		usuario.setEmail("andre@lanche.com");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}
}

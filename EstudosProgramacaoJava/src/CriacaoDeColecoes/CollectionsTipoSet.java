package CriacaoDeColecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTipoSet {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//adicionar itens na collection
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		
		//não aceita repetição, não retorna erro, só não adiciona a informação
		conjunto.add("Teste");
		
		//verificar tamanho da collection
		System.out.println("Tamanho é " + conjunto.size());
		
		//remove item da collection, retorna resposta true ou false para remoção
		conjunto.remove(1.2);
		
		//verifica se contem o item na collection, retorna true ou false
		conjunto.contains(1);
		
		//Outra maneira de criar uma collection
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//Une os dois conjuntos
		conjunto.addAll(nums);
		
		//Mantem na collection apenas o que tem em comum com a outra collection
		conjunto.retainAll(nums);
		
		//Limpa a collection
		conjunto.clear();
		
		//Collection tipada (recomendado);
		Set<String> lista = new HashSet<>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("André");
		lista.add("Pedro");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		//Collection tipada em ordem de inserção
		Set<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("José");
		listaAprovados.add("Breno");
		listaAprovados.add("Bruno");
		
		
		
		
		
	}
}

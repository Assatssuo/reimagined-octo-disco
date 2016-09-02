import java.util.ArrayList;

public class Fila {
	private ArrayList<Cliente> fila;
	
	public Fila(){
		fila = new ArrayList<Cliente>();
	}
	
	public ArrayList<Cliente> getFila(){
		return fila;
	}
	
	public void addCliente(Cliente cli){
		fila.add(cli);
		System.out.println("O cliente "+cli.getNome()+" entrou na fila.");
	}
	
	public void removeCliente(int idCli){
		System.out.println("O cliente "+fila.get(idCli).getNome()+" foi atendido.");
		fila.remove(idCli);		
	}
}

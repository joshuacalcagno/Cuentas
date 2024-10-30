package daos;

public interface ClienteDAO {
	
	Cliente findByDocumento(String documento);
    
    Cliente findByNumero(int numero);
    
    List<Cliente> findAll();
	
    void save(Cliente cliente) {
    	
    }
    
    void update(Cliente cliente);
    
    void delete(Cliente cliente);

}
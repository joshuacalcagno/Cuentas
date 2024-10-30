package daos;

public interface CuentaDAO {
	
    Cuenta findByNumeroCuenta(String nroCuenta);
    
    List<Cuenta> findAll();
    
    void save(Cuenta cuenta);
    
    void update(Cuenta cuenta);
    
    void delete(Cuenta cuenta);
    
}

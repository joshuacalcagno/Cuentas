package daos;

public interface MovimientoDAO {
	
    Movimiento findByNumero(int nroMovimiento);
    
    List<Movimiento> findByMes(int mes);
    
    List<Movimiento> findByCuenta(String nroCuenta);
    
    void save(Movimiento movimiento);
    
    void update(Movimiento movimiento);
    
    void delete(Movimiento movimiento);
    
}


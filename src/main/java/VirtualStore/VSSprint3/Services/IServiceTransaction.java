package VirtualStore.VSSprint3.Services;

import VirtualStore.VSSprint3.Model.Enterprise;
import VirtualStore.VSSprint3.Model.Transaction;

import java.util.List;

public interface IServiceTransaction {
    //Consultar todos los movimientos
    public List<Transaction> getAll();

    //Crear una transaccion
    public Transaction Create(Transaction transaction);

    //Consultar una transaccion por el id
    public Transaction getbyId(Long id);

    //Eliminar una transaccion
    public void delete(Long id);


    //Actualizar una transaccion
    public Transaction updateTransaction(Transaction transaction);
}

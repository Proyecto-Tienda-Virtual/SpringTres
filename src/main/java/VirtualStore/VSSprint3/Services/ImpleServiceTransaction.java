package VirtualStore.VSSprint3.Services;

import VirtualStore.VSSprint3.Model.Enterprise;
import VirtualStore.VSSprint3.Model.Transaction;
import VirtualStore.VSSprint3.Repository.IRepositoryEnterprise;
import VirtualStore.VSSprint3.Repository.IRepositoryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImpleServiceTransaction implements IServiceTransaction {
    @Autowired
    IRepositoryTransaction iRepositoryTransaction;
    //Para mostrar todos los movimientos
    @Override
    public List<Transaction> getAll() {
        List<Transaction> transactions = new ArrayList<Transaction>();
        transactions.addAll(iRepositoryTransaction.findAll());
        return transactions;
    }
    //Para crear una transaccion
    @Override
    public Transaction Create(Transaction transaction) {
        return iRepositoryTransaction.save(transaction);
    }
    //Para consultar una transaccion
    @Override
    public Transaction getbyId(Long id) {
        Transaction transaction = iRepositoryTransaction.findById(id).orElse(null);
        return transaction;
    }
    //Para eliminar una transaccion por id
    @Override
    public void delete(Long id) {
        iRepositoryTransaction.deleteById(id);
    }
    //Para actualizar una transaccion por ID
    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return iRepositoryTransaction.save(transaction);
    }
}

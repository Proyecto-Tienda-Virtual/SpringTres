package VirtualStore.VSSprint3.Controller;

import VirtualStore.VSSprint3.Model.Enterprise;
import VirtualStore.VSSprint3.Model.Transaction;
import VirtualStore.VSSprint3.Services.IServiceTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TransactionController {
    @Autowired
    IServiceTransaction IServiceTransaction;

    //GET
    @GetMapping("/movements")
    public List<Transaction> getAll(){
        return IServiceTransaction.getAll();

    }

    //POST
    @PostMapping("/movements")
    public Transaction Create(@RequestBody Transaction transaction){
        return IServiceTransaction.Create(transaction);

    }

    //GET
    @GetMapping("/movements/{id}")
    public Transaction getbyId(@PathVariable("id") Long id){
        return IServiceTransaction.getbyId(id);
    }

    //DELETE
    @DeleteMapping("/movements/{id}")
    public void delete(@PathVariable ("id") Long id){
        IServiceTransaction.delete(id);

    }

    //PATCH
    @PatchMapping("/movements/{id}")
    public Transaction updateTransaction (@PathVariable Long id, @RequestBody Transaction transaction){
        Transaction transaction1 = IServiceTransaction.getbyId(id);


        transaction1.setConcept(transaction.getConcept());
        transaction1.setAmount(transaction.getAmount());
        transaction1.setCreatedAt(transaction.getCreatedAt());
        transaction1.setUpdateAt(transaction.getUpdateAt());

        IServiceTransaction.updateTransaction(transaction1);

        return transaction1;
    }

}

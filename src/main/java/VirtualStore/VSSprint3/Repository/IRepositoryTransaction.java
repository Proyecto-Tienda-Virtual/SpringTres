package VirtualStore.VSSprint3.Repository;

import VirtualStore.VSSprint3.Model.Enterprise;
import VirtualStore.VSSprint3.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryTransaction extends JpaRepository<Transaction,Long> {
}

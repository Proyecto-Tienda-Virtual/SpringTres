package VirtualStore.VSSprint3.Repository;

import VirtualStore.VSSprint3.Model.Employee;
import VirtualStore.VSSprint3.Model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryEnterprise extends JpaRepository<Enterprise,Long> {

}

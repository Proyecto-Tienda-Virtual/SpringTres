package VirtualStore.VSSprint3.Repository;

import VirtualStore.VSSprint3.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespositoryEmployee extends JpaRepository<Employee,Long> {
}

package VirtualStore.VSSprint3.Repository;

import VirtualStore.VSSprint3.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryProfile extends JpaRepository<Profile, Long> {
}

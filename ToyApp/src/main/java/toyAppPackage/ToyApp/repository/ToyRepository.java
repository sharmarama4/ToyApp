package toyAppPackage.ToyApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyAppPackage.ToyApp.data.Toy;
@Repository
public interface ToyRepository extends JpaRepository<Toy, Integer> {
}

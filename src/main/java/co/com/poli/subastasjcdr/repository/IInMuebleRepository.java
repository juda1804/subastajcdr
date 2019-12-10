package co.com.poli.subastasjcdr.repository;

import co.com.poli.subastasjcdr.domain.InMueble;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInMuebleRepository extends CrudRepository<InMueble,String> {
    List<InMueble> findByPonenteEqualsAndEstado(String ponente,Boolean estado);
}

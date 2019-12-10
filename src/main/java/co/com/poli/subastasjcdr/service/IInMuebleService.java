package co.com.poli.subastasjcdr.service;

import co.com.poli.subastasjcdr.domain.InMueble;
import co.com.poli.subastasjcdr.domain.Postor;

import java.util.Optional;

public interface IInMuebleService {
    InMueble save(InMueble inMueble);
    Optional<InMueble> findOne(String idInMueble);
    void setState(String idInmueble);
}

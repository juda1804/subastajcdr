package co.com.poli.subastasjcdr.service.impl;

import co.com.poli.subastasjcdr.domain.InMueble;
import co.com.poli.subastasjcdr.domain.Postor;
import co.com.poli.subastasjcdr.errors.ResourceBadRequest;
import co.com.poli.subastasjcdr.errors.ResourceNotFound;
import co.com.poli.subastasjcdr.repository.IInMuebleRepository;
import co.com.poli.subastasjcdr.service.IInMuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class InMuebleService implements IInMuebleService {

    @Autowired
    private IInMuebleRepository inMuebleRepository;

    @Override
    @Transactional
    public InMueble save(InMueble inMueble) {
        Optional<InMueble> byId = inMuebleRepository.findById(inMueble.getIdInmueble());
        if (!byId.isPresent()) {
             if (inMuebleRepository.findByPonenteEqualsAndEstado(inMueble.getPonente(),true).size() > 2) {
                throw new ResourceBadRequest("El ponente esta en mucho lado");
             };
            inMuebleRepository.save(inMueble);
        } else {
            throw new ResourceNotFound("No existe el inmueble");
        }
        return inMueble;
    }

    @Override
    public Optional<InMueble> findOne(String idInMueble) {
        return inMuebleRepository.findById(idInMueble);
    }

    @Override
    public void setState(String idInmueble) {

    }
}

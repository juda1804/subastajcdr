package co.com.poli.subastasjcdr.controllers;

import co.com.poli.subastasjcdr.domain.InMueble;
import co.com.poli.subastasjcdr.domain.Postor;
import co.com.poli.subastasjcdr.errors.ResourceNotFound;
import co.com.poli.subastasjcdr.service.IInMuebleService;
import co.com.poli.subastasjcdr.service.IPostorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class InMuebleController {

    @Autowired
    private IInMuebleService inMuebleService;

    @Autowired
    private IPostorService postorService;

    @PostMapping(value="/inmueble")
    public InMueble save(@RequestBody InMueble inMueble){
       return inMuebleService.save(inMueble);
    }

    @PostMapping(value="/postor/{idInmueble}")
    public Postor save(@RequestBody Postor postor, @PathVariable String idInmueble) {
        Optional<InMueble> inMuebleOpt = inMuebleService.findOne(idInmueble);
        if (inMuebleOpt.isPresent()) {
            postor.setInMueble(inMuebleOpt.get());
            return postorService.save(postor);
        } else {
            throw new ResourceNotFound("No existe el inmueble");
        }
    }
}

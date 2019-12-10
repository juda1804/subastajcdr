package co.com.poli.subastasjcdr.service.impl;

import co.com.poli.subastasjcdr.domain.Postor;
import co.com.poli.subastasjcdr.repository.IPostorRepository;
import co.com.poli.subastasjcdr.service.IPostorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostorService implements IPostorService {

    @Autowired
    private IPostorRepository postorService;

    @Override
    public Postor save(Postor p) {
        return postorService.save(p);
    }
}

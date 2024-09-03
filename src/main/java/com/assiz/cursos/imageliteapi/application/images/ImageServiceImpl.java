package com.assiz.cursos.imageliteapi.application.images;

import com.assiz.cursos.imageliteapi.domain.entity.Image;
import com.assiz.cursos.imageliteapi.domain.service.ImageService;
import com.assiz.cursos.imageliteapi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }

}

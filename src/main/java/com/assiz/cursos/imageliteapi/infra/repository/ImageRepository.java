package com.assiz.cursos.imageliteapi.infra.repository;

import com.assiz.cursos.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}

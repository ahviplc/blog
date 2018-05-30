package com.ydemo.base.app.repository;

import com.ydemo.base.app.entity.Metas;
import com.ydemo.base.cores.repository.expand.ExpandJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MetasRepository extends ExpandJpaRepository<Metas,Long> {
    List<Metas> findByType(String type);

    Metas findByNameAndType(String name,String type);

}

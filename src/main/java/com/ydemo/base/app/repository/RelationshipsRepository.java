package com.ydemo.base.app.repository;

import com.ydemo.base.app.entity.Relationships;
import com.ydemo.base.cores.repository.expand.ExpandJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface RelationshipsRepository extends ExpandJpaRepository<Relationships,Long> {

    List<Relationships> findAllByCid(Long cid);

    List<Relationships> findAllByMid(Long mid);

    @Transactional
    void deleteByCidAndType(Long cid,String type);
    @Transactional
    void deleteByCid(Long cid);
}

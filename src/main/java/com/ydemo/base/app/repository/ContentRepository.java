package com.ydemo.base.app.repository;

import com.ydemo.base.app.entity.Content;
import com.ydemo.base.cores.repository.expand.ExpandJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ContentRepository extends ExpandJpaRepository<Content,Long> {


}

package com.epam.cdp.Repository;

import com.epam.cdp.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface StockRepository extends JpaRepository<Stock, Long> {
    Collection<Stock> findByCode(@Param("code") String code);
}

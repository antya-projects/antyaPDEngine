package com.antya.repository;

import com.antya.domain.Market;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Spring Data JPA repository for the Market entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MarketRepository extends JpaRepository<Market, Long> {
    @Query("select distinct market from Market market left join fetch market.marketPrices")
    List<Market> findAllWithEagerRelationships();

    @Query("select market from Market market left join fetch market.marketPrices where market.id =:id")
    Market findOneWithEagerRelationships(@Param("id") Long id);

}

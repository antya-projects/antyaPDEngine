package com.antya.service;

import com.antya.service.dto.MarketDetailsDTO;
import java.util.List;

/**
 * Service Interface for managing MarketDetails.
 */
public interface MarketDetailsService {

    /**
     * Save a marketDetails.
     *
     * @param marketDetailsDTO the entity to save
     * @return the persisted entity
     */
    MarketDetailsDTO save(MarketDetailsDTO marketDetailsDTO);

    /**
     * Get all the marketDetails.
     *
     * @return the list of entities
     */
    List<MarketDetailsDTO> findAll();

    /**
     * Get the "id" marketDetails.
     *
     * @param id the id of the entity
     * @return the entity
     */
    MarketDetailsDTO findOne(Long id);

    /**
     * Delete the "id" marketDetails.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

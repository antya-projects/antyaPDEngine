package com.antya.service;

import com.antya.service.dto.MarketPriceDTO;
import java.util.List;

/**
 * Service Interface for managing MarketPrice.
 */
public interface MarketPriceService {

    /**
     * Save a marketPrice.
     *
     * @param marketPriceDTO the entity to save
     * @return the persisted entity
     */
    MarketPriceDTO save(MarketPriceDTO marketPriceDTO);

    /**
     * Get all the marketPrices.
     *
     * @return the list of entities
     */
    List<MarketPriceDTO> findAll();

    /**
     * Get the "id" marketPrice.
     *
     * @param id the id of the entity
     * @return the entity
     */
    MarketPriceDTO findOne(Long id);

    /**
     * Delete the "id" marketPrice.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

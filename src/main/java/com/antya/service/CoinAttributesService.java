package com.antya.service;

import com.antya.service.dto.CoinAttributesDTO;
import java.util.List;

/**
 * Service Interface for managing CoinAttributes.
 */
public interface CoinAttributesService {

    /**
     * Save a coinAttributes.
     *
     * @param coinAttributesDTO the entity to save
     * @return the persisted entity
     */
    CoinAttributesDTO save(CoinAttributesDTO coinAttributesDTO);

    /**
     * Get all the coinAttributes.
     *
     * @return the list of entities
     */
    List<CoinAttributesDTO> findAll();

    /**
     * Get the "id" coinAttributes.
     *
     * @param id the id of the entity
     * @return the entity
     */
    CoinAttributesDTO findOne(Long id);

    /**
     * Delete the "id" coinAttributes.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

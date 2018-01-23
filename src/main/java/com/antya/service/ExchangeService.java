package com.antya.service;

import com.antya.service.dto.ExchangeDTO;
import java.util.List;

/**
 * Service Interface for managing Exchange.
 */
public interface ExchangeService {

    /**
     * Save a exchange.
     *
     * @param exchangeDTO the entity to save
     * @return the persisted entity
     */
    ExchangeDTO save(ExchangeDTO exchangeDTO);

    /**
     * Get all the exchanges.
     *
     * @return the list of entities
     */
    List<ExchangeDTO> findAll();

    /**
     * Get the "id" exchange.
     *
     * @param id the id of the entity
     * @return the entity
     */
    ExchangeDTO findOne(Long id);

    /**
     * Delete the "id" exchange.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

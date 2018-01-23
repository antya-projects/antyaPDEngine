package com.antya.service.impl;

import com.antya.service.MarketPriceService;
import com.antya.domain.MarketPrice;
import com.antya.repository.MarketPriceRepository;
import com.antya.service.dto.MarketPriceDTO;
import com.antya.service.mapper.MarketPriceMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing MarketPrice.
 */
@Service
@Transactional
public class MarketPriceServiceImpl implements MarketPriceService {

    private final Logger log = LoggerFactory.getLogger(MarketPriceServiceImpl.class);

    private final MarketPriceRepository marketPriceRepository;

    private final MarketPriceMapper marketPriceMapper;

    public MarketPriceServiceImpl(MarketPriceRepository marketPriceRepository, MarketPriceMapper marketPriceMapper) {
        this.marketPriceRepository = marketPriceRepository;
        this.marketPriceMapper = marketPriceMapper;
    }

    /**
     * Save a marketPrice.
     *
     * @param marketPriceDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public MarketPriceDTO save(MarketPriceDTO marketPriceDTO) {
        log.debug("Request to save MarketPrice : {}", marketPriceDTO);
        MarketPrice marketPrice = marketPriceMapper.toEntity(marketPriceDTO);
        marketPrice = marketPriceRepository.save(marketPrice);
        return marketPriceMapper.toDto(marketPrice);
    }

    /**
     * Get all the marketPrices.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<MarketPriceDTO> findAll() {
        log.debug("Request to get all MarketPrices");
        return marketPriceRepository.findAll().stream()
            .map(marketPriceMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one marketPrice by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public MarketPriceDTO findOne(Long id) {
        log.debug("Request to get MarketPrice : {}", id);
        MarketPrice marketPrice = marketPriceRepository.findOne(id);
        return marketPriceMapper.toDto(marketPrice);
    }

    /**
     * Delete the marketPrice by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete MarketPrice : {}", id);
        marketPriceRepository.delete(id);
    }
}

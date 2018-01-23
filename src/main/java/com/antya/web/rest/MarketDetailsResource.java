package com.antya.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.antya.service.MarketDetailsService;
import com.antya.web.rest.errors.BadRequestAlertException;
import com.antya.web.rest.util.HeaderUtil;
import com.antya.service.dto.MarketDetailsDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing MarketDetails.
 */
@RestController
@RequestMapping("/api")
public class MarketDetailsResource {

    private final Logger log = LoggerFactory.getLogger(MarketDetailsResource.class);

    private static final String ENTITY_NAME = "marketDetails";

    private final MarketDetailsService marketDetailsService;

    public MarketDetailsResource(MarketDetailsService marketDetailsService) {
        this.marketDetailsService = marketDetailsService;
    }

    /**
     * POST  /market-details : Create a new marketDetails.
     *
     * @param marketDetailsDTO the marketDetailsDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new marketDetailsDTO, or with status 400 (Bad Request) if the marketDetails has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/market-details")
    @Timed
    public ResponseEntity<MarketDetailsDTO> createMarketDetails(@RequestBody MarketDetailsDTO marketDetailsDTO) throws URISyntaxException {
        log.debug("REST request to save MarketDetails : {}", marketDetailsDTO);
        if (marketDetailsDTO.getId() != null) {
            throw new BadRequestAlertException("A new marketDetails cannot already have an ID", ENTITY_NAME, "idexists");
        }
        MarketDetailsDTO result = marketDetailsService.save(marketDetailsDTO);
        return ResponseEntity.created(new URI("/api/market-details/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /market-details : Updates an existing marketDetails.
     *
     * @param marketDetailsDTO the marketDetailsDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated marketDetailsDTO,
     * or with status 400 (Bad Request) if the marketDetailsDTO is not valid,
     * or with status 500 (Internal Server Error) if the marketDetailsDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/market-details")
    @Timed
    public ResponseEntity<MarketDetailsDTO> updateMarketDetails(@RequestBody MarketDetailsDTO marketDetailsDTO) throws URISyntaxException {
        log.debug("REST request to update MarketDetails : {}", marketDetailsDTO);
        if (marketDetailsDTO.getId() == null) {
            return createMarketDetails(marketDetailsDTO);
        }
        MarketDetailsDTO result = marketDetailsService.save(marketDetailsDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, marketDetailsDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /market-details : get all the marketDetails.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of marketDetails in body
     */
    @GetMapping("/market-details")
    @Timed
    public List<MarketDetailsDTO> getAllMarketDetails() {
        log.debug("REST request to get all MarketDetails");
        return marketDetailsService.findAll();
        }

    /**
     * GET  /market-details/:id : get the "id" marketDetails.
     *
     * @param id the id of the marketDetailsDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the marketDetailsDTO, or with status 404 (Not Found)
     */
    @GetMapping("/market-details/{id}")
    @Timed
    public ResponseEntity<MarketDetailsDTO> getMarketDetails(@PathVariable Long id) {
        log.debug("REST request to get MarketDetails : {}", id);
        MarketDetailsDTO marketDetailsDTO = marketDetailsService.findOne(id);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(marketDetailsDTO));
    }

    /**
     * DELETE  /market-details/:id : delete the "id" marketDetails.
     *
     * @param id the id of the marketDetailsDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/market-details/{id}")
    @Timed
    public ResponseEntity<Void> deleteMarketDetails(@PathVariable Long id) {
        log.debug("REST request to delete MarketDetails : {}", id);
        marketDetailsService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}

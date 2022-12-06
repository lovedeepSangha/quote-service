package com.quotemedia.interview.quoteservice.repository;

import com.quotemedia.interview.quoteservice.domain.Quote;
import com.quotemedia.interview.quoteservice.domain.SymbolDayId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, SymbolDayId> {
    Optional<Quote> findTopBySymbolDayIdSymbolOrderBySymbolDayIdDayDesc(String symbol);
}

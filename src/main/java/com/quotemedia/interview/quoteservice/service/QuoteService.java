package com.quotemedia.interview.quoteservice.service;

import com.quotemedia.interview.quoteservice.dto.QuoteDTO;
import com.quotemedia.interview.quoteservice.exception.SymbolNotFoundException;
import com.quotemedia.interview.quoteservice.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository quoteRepository;


     public QuoteDTO getLatestSymbolQuote(String symbol) {
        return quoteRepository.findTopBySymbolDayIdSymbolOrderBySymbolDayIdDayDesc(symbol)
                .map(quote -> new QuoteDTO(quote.getBid(), quote.getAsk())).orElseThrow(() ->
                        new SymbolNotFoundException(symbol));

    }
}
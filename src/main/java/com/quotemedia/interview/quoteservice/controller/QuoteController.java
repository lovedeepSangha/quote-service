package com.quotemedia.interview.quoteservice.controller;

import com.quotemedia.interview.quoteservice.dto.QuoteDTO;
import com.quotemedia.interview.quoteservice.service.QuoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.constraints.Size;


@RestController
@RequestMapping("/symbols")
@Validated
public class QuoteController {
    @Autowired
    private QuoteService quoteService;

    @GetMapping("/{symbol}/quotes/latest")
    public ResponseEntity<QuoteDTO> getQuotes(@PathVariable(name = "symbol") @Size(min = 2, max = 6) String symbol) {
        return ResponseEntity.ok(quoteService.getLatestSymbolQuote(symbol));

    }
}

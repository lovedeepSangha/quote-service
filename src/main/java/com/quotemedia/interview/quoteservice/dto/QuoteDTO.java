package com.quotemedia.interview.quoteservice.dto;

public class QuoteDTO {
    private Double bid;
    private Double ask;

    public Double getBid() {
        return bid;
    }

    public Double getAsk() {
        return ask;
    }

    public QuoteDTO(Double bid, Double ask) {
        this.bid = bid;
        this.ask = ask;
    }


}

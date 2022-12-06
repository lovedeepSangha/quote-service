package com.quotemedia.interview.quoteservice.domain;

import javax.persistence.*;


@Entity
public class Quote {
    @EmbeddedId
    private SymbolDayId symbolDayId;
    private Double bid;
    private Double ask;

    public SymbolDayId getSymbolDayId() {
        return symbolDayId;
    }

    public Double getBid() {
        return bid;
    }


    public Double getAsk() {
        return ask;
    }

}

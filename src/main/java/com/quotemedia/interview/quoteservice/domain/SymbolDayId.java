package com.quotemedia.interview.quoteservice.domain;


import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class SymbolDayId implements Serializable {

    @Size(min = 2, max = 6)
    private String symbol;


    @Temporal(TemporalType.DATE)
    private Date day;

    public String getSymbol() {
        return symbol;
    }

    public Date getDay() {
        return day;
    }


}

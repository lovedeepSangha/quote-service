package com.quotemedia.interview.quoteservice.exception;


import java.util.function.Supplier;

public class SymbolNotFoundException extends RuntimeException  {

    private static final long serialVersionUID = 1L;

    public SymbolNotFoundException(String symbol)
    {
        super("No data exists  : " + symbol);
    }


}
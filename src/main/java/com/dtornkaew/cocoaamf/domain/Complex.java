package com.dtornkaew.cocoaamf.domain;

import java.util.List;

public class Complex
{
    private String message = "Message!";

    private List<Simple> simple;

    private Complex embedded;
    
    private Type etype;

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

    public void setSimple( List<Simple> simple )
    {
        this.simple = simple;
    }

    public List<Simple> getSimple()
    {
        return simple;
    }

    public void setEmbedded( Complex embedded )
    {
        this.embedded = embedded;
    }

    public Complex getEmbedded()
    {
        return embedded;
    }

    public void setEtype( Type type )
    {
        this.etype = type;
    }

    public Type getEtype()
    {
        return etype;
    }

}

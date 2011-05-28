package com.dtornkaew.cocoaamf.business;

import org.springframework.stereotype.Service;

import com.dtornkaew.cocoamf.domain.Open;

@Service( "testService" )
public class TestServiceImpl
    implements TestService
{

    public Open getMessage()
    {
        return new Open();
    }

}

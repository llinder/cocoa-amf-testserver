package com.dtornkaew.cocoaamf.business;

import org.springframework.stereotype.Service;

import com.dtornkaew.cocoamf.domain.Private;

@Service( "secureService" )
public class SecureServiceImpl
    implements SecureService
{

    public Private getMessage()
    {
        return new Private();
    }

}

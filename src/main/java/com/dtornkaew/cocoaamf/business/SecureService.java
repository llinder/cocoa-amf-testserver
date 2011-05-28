package com.dtornkaew.cocoaamf.business;

import org.springframework.security.access.annotation.Secured;

import com.dtornkaew.cocoamf.domain.Private;

@Secured( "ROLE_USER" )
public interface SecureService
{
    public Private getMessage();
}

package com.dtornkaew.cocoaamf.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dtornkaew.cocoaamf.domain.Complex;
import com.dtornkaew.cocoaamf.domain.Simple;
import com.dtornkaew.cocoaamf.domain.Type;

@Service( "service" )
public class ServiceImpl
    implements com.dtornkaew.cocoaamf.business.Service
{

    public Simple getSimple()
    {
        return new Simple();
    }
    
    public Complex getComplex()
    {
        Complex c =  new Complex();
        List<Simple> simple = new ArrayList<Simple>();
        simple.add( new Simple() );
        simple.add( new Simple() );
        simple.add( new Simple() );
        simple.add( new Simple() );
        c.setSimple( simple );
        
        c.setEmbedded( new Complex() );
        c.setEtype( Type.ONE );
        
        return c;
    }

}

package test.src;

import Lambda_Java.ColecoesFeminino;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class PrimeiroTeste {

    @org.junit.Test
    public void test(){

        
        ColecoesFeminino fem = new ColecoesFeminino("nome", "f");

        Assert.assertEquals("f", fem.getSexo());
    }
}

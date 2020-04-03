package br.com.ciandt.gian73.calculo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.ciandt.gian73.service.RetornaTextoService;

public class SuiteTest {
    @RunWith(Suite.class)
    @SuiteClasses({ CalculoServiceTest.class, DivisaoTest.class, RetornaTextoService.class })
    public class SuiteTeste {

    }

}

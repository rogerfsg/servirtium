package com.paulhammant.servirtium.undertow;

import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.ServiceMonitor;
import com.paulhammant.servirtium.ServirtiumServer;
import com.paulhammant.servirtium.SimpleGetCentricBinaryTests;
import com.paulhammant.servirtium.SimpleInteractionManipulations;
import org.junit.After;
import org.junit.Test;

public class SimpleGetCentricBinaryWithUndertowTests extends SimpleGetCentricBinaryTests {

    protected ServirtiumServer makeServirtiumServer(SimpleInteractionManipulations interactionManipulations, Interactor interactor) {
        return new UndertowServirtiumServer(new ServiceMonitor.Console(),
                8080, interactionManipulations, interactor);
    }

    @Override @After
    public void tearDown() {
        super.tearDown();
    }

    @Override @Test
    public void canRecordABinaryGetFromApachesSubversionViaOkHttp() throws Exception {
        super.canRecordABinaryGetFromApachesSubversionViaOkHttp();
    }

    @Override @Test
    public void canRecordAPngGetFromWikimedia() throws Exception {
        super.canRecordAPngGetFromWikimedia();
    }

    @Override @Test
    public void canRecordASvgGetFromWikimedia() throws Exception {
        super.canRecordASvgGetFromWikimedia();
    }

    @Override @Test
    public void canReplayABinaryGetFromApachesSubversion() throws Exception {
        super.canReplayABinaryGetFromApachesSubversion();
    }


}

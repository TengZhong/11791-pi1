package org.lappsgrid.example;

// JUnit modules for unit tests
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// more APIs for testing code 
import org.lappsgrid.api.WebService;
import static org.lappsgrid.discriminator.Discriminators.Uri;
import org.lappsgrid.metadata.IOSpecification;
import org.lappsgrid.metadata.ServiceMetadata;
import org.lappsgrid.serialization.Data;
import org.lappsgrid.serialization.DataContainer;
import org.lappsgrid.serialization.Serializer;
import org.lappsgrid.serialization.lif.Annotation;
import org.lappsgrid.serialization.lif.Container;
import org.lappsgrid.serialization.lif.View;
import org.lappsgrid.vocabulary.Features;
import Java.io.IOException;
import Java.util.List;
import Java.util.Map;

public class TestWhitespaceTokenizer {

    // this will be the sandbag
    protected WebService service;

    // initiate the service before each test
    @Before
    public void setUp() throws IOException {
        service = new WhitespaceTokenizer();
    }

    // then destroy it after the test
    @After
    public void tearDown() {
        service = null;
    }

    @Test
    public void testMetadata() { ... }

    @Test
    public void testExecute() { ... }
}
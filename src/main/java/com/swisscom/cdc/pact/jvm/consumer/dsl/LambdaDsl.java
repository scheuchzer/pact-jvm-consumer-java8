package com.swisscom.cdc.pact.jvm.consumer.dsl;

import au.com.dius.pact.consumer.dsl.PactDslJsonArray;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;

import java.util.function.Consumer;

/**
 * An alternative, lambda based, dsl for pact that runs on top of the default pact dsl objects.
 */
public class LambdaDsl {

    public static LambdaDslJsonArray newJsonArray(Consumer<LambdaDslJsonArray> array) {
        final PactDslJsonArray pactDslJsonArray = new PactDslJsonArray();
        final LambdaDslJsonArray dslArray = new LambdaDslJsonArray(pactDslJsonArray);
        array.accept(dslArray);
        return dslArray;
    }

    public static LambdaDslJsonBody newJsonBody(Consumer<LambdaDslJsonBody> array) {
        final PactDslJsonBody pactDslJsonBody = new PactDslJsonBody();
        final LambdaDslJsonBody dslBody = new LambdaDslJsonBody(pactDslJsonBody);
        array.accept(dslBody);
        return dslBody;
    }


}

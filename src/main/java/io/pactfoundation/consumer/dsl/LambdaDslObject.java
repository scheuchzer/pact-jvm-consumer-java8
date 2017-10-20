package io.pactfoundation.consumer.dsl;

import au.com.dius.pact.consumer.dsl.PactDslJsonArray;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import java.util.function.Consumer;

public class LambdaDslObject {

    private final PactDslJsonBody object;

    LambdaDslObject(final PactDslJsonBody object) {
        this.object = object;
    }

    public LambdaDslObject stringValue(final String name, final String value) {
        object.stringValue(name, value);
        return this;
    }

    public LambdaDslObject stringType(final String name, final String example) {
        object.stringType(name, example);
        return this;
    }

    public LambdaDslObject stringType(final String name) {
        object.stringType(name);
        return this;
    }

    public LambdaDslObject stringType(final String... names) {
        object.stringType(names);
        return this;
    }

    public LambdaDslObject stringMatcher(final String name, final String example) {
        object.stringMatcher(name, example);
        return this;
    }

    public LambdaDslObject stringMatcher(final String name, final String regex, final String value) {
        object.stringMatcher(name, regex, value);
        return this;
    }

    public LambdaDslObject numberValue(final String name, final Number value) {
        object.numberValue(name, value);
        return this;
    }

    public LambdaDslObject numberType(final String name, final Number example) {
        object.numberType(name, example);
        return this;
    }

    public LambdaDslObject numberType(final String... names) {
        object.numberType(names);
        return this;
    }

    public LambdaDslObject decimalType(final String name, final BigDecimal value) {
        object.decimalType(name, value);
        return this;
    }

    public LambdaDslObject decimalType(final String name, final Double example) {
        object.decimalType(name, example);
        return this;
    }

    public LambdaDslObject decimalType(final String... names) {
        object.decimalType(names);
        return this;
    }

    public LambdaDslObject booleanValue(final String name, final Boolean value) {
        object.booleanValue(name, value);
        return this;
    }

    public LambdaDslObject booleanType(final String name, final Boolean example) {
        object.booleanType(name, example);
        return this;
    }

    public LambdaDslObject booleanType(final String... names) {
        object.booleanType(names);
        return this;
    }

    public LambdaDslObject id() {
        object.id();
        return this;
    }

    public LambdaDslObject id(final String name) {
        object.id(name);
        return this;
    }

    public LambdaDslObject id(final String name, Long id) {
        object.id(name, id);
        return this;
    }

    public LambdaDslObject uuid(final String name) {
        object.uuid(name);
        return this;
    }

    public LambdaDslObject uuid(final String name, UUID id) {
        object.uuid(name, id);
        return this;
    }

    /**
     * Attribute named 'date' that must be formatted as an ISO date
     */
    public LambdaDslObject date() {
        object.date();
        return this;
    }

    /**
     * Attribute that must be formatted as an ISO date
     *
     * @param name attribute name
     */
    public LambdaDslObject date(String name) {
        object.date(name);
        return this;
    }

    /**
     * Attribute that must match the provided date format
     *
     * @param name   attribute date
     * @param format date format to match
     */
    public LambdaDslObject date(String name, String format) {
        object.date(name, format);
        return this;
    }

    /**
     * Attribute that must match the provided date format
     *
     * @param name    attribute date
     * @param format  date format to match
     * @param example example date to use for generated values
     */
    public LambdaDslObject date(String name, String format, Date example) {
        object.date(name, format, example);
        return this;
    }

    /**
     * Attribute named 'time' that must be an ISO formatted time
     */
    public LambdaDslObject time() {
        object.time();
        return this;
    }

    /**
     * Attribute that must be an ISO formatted time
     *
     * @param name attribute name
     */
    public LambdaDslObject time(String name) {
        object.time(name);
        return this;
    }

    /**
     * Attribute that must match the provided time format
     *
     * @param name   attribute time
     * @param format time format to match
     */
    public LambdaDslObject time(String name, String format) {
        object.time(name, format);
        return this;
    }

    /**
     * Attribute that must match the provided time format
     *
     * @param name    attribute name
     * @param format  time format to match
     * @param example example time to use for generated values
     */
    public LambdaDslObject time(String name, String format, Date example) {
        object.time(name, format, example);
        return this;
    }

    /**
     * Attribute named 'timestamp' that must be an ISO formatted timestamp
     */
    public LambdaDslObject timestamp() {
        object.timestamp();
        return this;
    }

    /**
     * Attribute that must be an ISO formatted timestamp
     *
     * @param name
     */
    public LambdaDslObject timestamp(String name) {
        object.timestamp(name);
        return this;
    }

    /**
     * Attribute that must match the given timestamp format
     *
     * @param name   attribute name
     * @param format timestamp format
     */
    public LambdaDslObject timestamp(String name, String format) {
        object.timestamp(name, format);
        return this;
    }

    /**
     * Attribute that must match the given timestamp format
     *
     * @param name    attribute name
     * @param format  timestamp format
     * @param example example date and time to use for generated bodies
     */
    public LambdaDslObject timestamp(String name, String format, Date example) {
        object.timestamp(name, format, example);
        return this;
    }

    /**
     * Attribute that must be an IP4 address
     *
     * @param name attribute name
     */
    public LambdaDslObject ipV4Address(String name) {
        object.ipAddress(name);
        return this;
    }

    public LambdaDslObject array(final String name, final Consumer<LambdaDslJsonArray> array) {
        final PactDslJsonArray pactArray = object.array(name);
        final LambdaDslJsonArray dslArray = new LambdaDslJsonArray(pactArray);
        array.accept(dslArray);
        pactArray.closeArray();
        return this;
    }

    public LambdaDslObject object(final String name, final Consumer<LambdaDslObject> nestedObject) {
        final PactDslJsonBody pactObject = object.object(name);
        final LambdaDslObject dslObject = new LambdaDslObject(pactObject);
        nestedObject.accept(dslObject);
        pactObject.closeObject();
        return this;
    }

    /**
     * Attribute that is an array where each item must match the following example
     *
     * @param name field name
     */
    public LambdaDslObject eachLike(String name) {
        object.eachLike(name);
        return this;
    }

    /**
     * Attribute that is an array where each item must match the following example
     *
     * @param name           field name
     * @param numberExamples number of examples to generate
     */
    public LambdaDslObject eachLike(String name, int numberExamples) {
        object.eachLike(name, numberExamples);
        return this;
    }

    /**
     * Attribute that is an array with a minimum size where each item must match the following example
     *
     * @param name field name
     * @param size minimum size of the array
     */
    public LambdaDslObject minArrayLike(String name, Integer size) {
        object.minArrayLike(name, size);
        return this;
    }

    /**
     * Attribute that is an array with a minimum size where each item must match the following example
     *
     * @param name           field name
     * @param size           minimum size of the array
     * @param numberExamples number of examples to generate
     */
    public LambdaDslObject minArrayLike(String name, Integer size, int numberExamples) {
        object.minArrayLike(name, size, numberExamples);
        return this;
    }

    /**
     * Attribute that is an array with a maximum size where each item must match the following example
     *
     * @param name field name
     * @param size maximum size of the array
     */
    public LambdaDslObject maxArrayLike(String name, Integer size) {
        object.minArrayLike(name, size);
        return this;
    }

    /**
     * Attribute that is an array with a maximum size where each item must match the following example
     *
     * @param name           field name
     * @param size           maximum size of the array
     * @param numberExamples number of examples to generate
     */
    public LambdaDslObject maxArrayLike(String name, Integer size, int numberExamples) {
        object.maxArrayLike(name, size, numberExamples);
        return this;
    }

    /**
     * Sets the field to a null value
     *
     * @param fieldName field name
     */
    public LambdaDslObject nullValue(String fieldName) {
        object.nullValue(fieldName);
        return this;
    }

    public LambdaDslObject eachArrayLike(String name) {
        object.eachArrayLike(name);
        return this;
    }

    public LambdaDslObject eachArrayLike(String name, int numberExamples) {
        object.eachArrayLike(name, numberExamples);
        return this;
    }

    public LambdaDslObject eachArrayWithMaxLike(String name, Integer size) {
        object.eachArrayWithMaxLike(name, size);
        return this;
    }


    public LambdaDslObject eachArrayWithMaxLike(String name, int numberExamples, Integer size) {
        object.eachArrayWithMaxLike(name, numberExamples, size);
        return this;
    }


    public LambdaDslObject eachArrayWithMinLike(String name, Integer size) {
        object.eachArrayWithMinLike(name, size);
        return this;
    }


    public LambdaDslObject eachArrayWithMinLike(String name, int numberExamples, Integer size) {
        object.eachArrayWithMinLike(name, numberExamples, size);
        return this;
    }

    /**
     * Accepts any key, and each key is mapped to a list of items that must match the following object definition
     *
     * @param exampleKey Example key to use for generating bodies
     */
    public LambdaDslObject eachKeyMappedToAnArrayLike(String exampleKey) {
        object.eachKeyMappedToAnArrayLike(exampleKey);
        return this;
    }

    /**
     * Accepts any key, and each key is mapped to a map that must match the following object definition
     *
     * @param exampleKey Example key to use for generating bodies
     */
    public LambdaDslObject eachKeyLike(String exampleKey) {
        object.eachKeyLike(exampleKey);
        return this;
    }

}

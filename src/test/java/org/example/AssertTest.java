package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertTest {
    @ParameterizedTest
    @NullSource
    public void assertTest(String str) {
        assertNotNull(str, "str is null");
    }
}

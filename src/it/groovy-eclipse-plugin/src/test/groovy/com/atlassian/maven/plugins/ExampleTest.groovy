package com.atlassian.maven.plugins

import groovy.util.GroovyTestCase

/**
 * Tests for the {@link GroovyExample} class.
 */
class ExampleTest extends GroovyTestCase {
    void testShow() {
        new GroovyExample().show()
        new JavaExample().show()
    }
}

package org.example.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

    @Test
    @DisplayName("Simple test")
    public void test() {
        //given
        final Hello hello = new Hello("World");

        //when
        final String expected = hello.getMessage();

        //then
        assertThat(expected).isEqualTo("World");
    }
}
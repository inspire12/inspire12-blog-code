package com.inspire12.loadtest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class Inspire12LoadtestApplicationTests {

    @Test
    void contextLoads() {
    }


    Set<String> a = new HashSet<>(List.of(new String[]{"1,2,3", "3,4,7"}));

    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "3,4,7"})
    void testParameter(int a, int b, int c) {
        Assertions.assertThat(a + b).isEqualTo(c);
    }
}

package io.franmosteiro.aoc2020.utils

import io.franmosteiro.aoc2020.utils.Resources.resourceAsList
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class ResourcesTest {

    @Test
    fun `reads lines`() {
        assertThat(resourceAsList("testFile1.in"))
                .hasSize(3)
                .containsExactly(1, 2, 3)
    }

    @Test
    fun `throws exception when file does not exist`() {
        assertThatThrownBy {
            resourceAsList("testFileDoesNotExist.in")
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
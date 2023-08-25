package com.task;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @ParameterizedTest
    @MethodSource("com.task.MissingNumberTest#getArgumentsForMissingNumberTest")
    void missingNumber(int[] nums, int missingNum) {
        assertEquals(MissingNumber.missingNumber(nums), missingNum);
    }

    static Stream<Arguments> getArgumentsForMissingNumberTest() {
        return Stream.of(
            Arguments.of(new int[] {5, 0, 1, 3, 2}, 4),
            Arguments.of(new int[] {7, 9, 10, 11, 12}, 8),
            Arguments.of(new int[] {2, 0, 1}, 3),
            Arguments.of(new int[] {13, 18, 16, 14, 17, 15}, 12)
        );
    }

}
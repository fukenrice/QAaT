package root.sqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvSqrtTest {
    private static final AdvSqrt ADV_SQRT = new AdvSqrt();

    @Test
    void sqrtPositiveOneTest() {
        // Integer positive num
        assertEquals(1.0, ADV_SQRT.sqrt(1));
    }

    @Test
    void sqrtPositiveIntTest() {
        // Integer positive num
        assertEquals(2.0, ADV_SQRT.sqrt(4));
    }

    @Test
    void sqrtPositiveMaxValueTest() {
        // Max double value
        assertEquals(Math.sqrt(Double.MAX_VALUE), ADV_SQRT.sqrt(Double.MAX_VALUE));
    }

    @Test
    void sqrtPositiveMinValueTest() {
        // Min double value
        assertEquals(Math.sqrt(Double.MIN_VALUE), ADV_SQRT.sqrt(Double.MIN_VALUE));
    }

    @Test
    void sqrtPositiveInfinityTest() {
        // Infinite value
        assertEquals(Math.sqrt(Double.POSITIVE_INFINITY), ADV_SQRT.sqrt(Double.POSITIVE_INFINITY));
    }

    @Test
    void positiveDoubleTest() {
        // Double positive num
        assertEquals(Math.sqrt(2.01), ADV_SQRT.sqrt(2.01));
    }

    @Test
    void positiveDenormalizedNumTest() {
        // Denormalized positive num
        assertEquals(Math.sqrt(1.1210387714598537E-44), ADV_SQRT.sqrt(1.1210387714598537E-44));
    }

    @Test
    void sqrtNegativeOneTest() {
        // Integer Negative num
        assertEquals(Double.NaN, ADV_SQRT.sqrt(-1));
    }

    @Test
    void sqrtNegativeIntTest() {
        // Integer Negative num
        assertEquals(Double.NaN, ADV_SQRT.sqrt(-4));
    }

    @Test
    void sqrtNegativeMaxValueTest() {
        // Max double value
        assertEquals(Double.NaN, ADV_SQRT.sqrt(-Double.MAX_VALUE));
    }

    @Test
    void sqrtNegativeMinValueTest() {
        // Min double value
        assertEquals(Double.NaN, ADV_SQRT.sqrt(-Double.MIN_VALUE));
    }

    @Test
    void sqrtNegativeInfinityTest() {
        // Infinite value
        assertEquals(Double.NaN, ADV_SQRT.sqrt(Double.NEGATIVE_INFINITY));
    }

    @Test
    void NegativeDoubleTest() {
        // Double Negative num
        assertEquals(Double.NaN, ADV_SQRT.sqrt(-2.01));
    }

    @Test
    void negativeDenormalizedNumTest() {
        // Denormalized positive num
        assertEquals(Double.NaN, ADV_SQRT.sqrt(-1.1210387714598537E-44));
    }

    @Test
    void sqrtZeroTest() {
        assertEquals(0, ADV_SQRT.sqrt(0.0));
    }

    @Test
    void sqrtNanTest() {
        assertEquals(Double.NaN, ADV_SQRT.sqrt(Double.NaN));
    }
}
package bobr.task1;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static bobr.task1.Tan.tangent;
import static org.junit.jupiter.api.Assertions.*;


class TanTest {
    private static final double GAP = 0.1;
    private static final Map<Double, Double> tableTangent = Map.of(
            0.0, 0.0,
            5.0, 0.087,
            10.0, 0.176,
            20.0, 0.364,
            40.0, 0.839,
            60.0, 1.732
    );

    private double plusGap(double num) {
        return num + num * GAP;
    }

    private double minusGap(double num) {
        return num - num * GAP;
    }

    @Test
    void testApproximateAccuracy() {
        for (double angle : tableTangent.keySet()) {
            assertTrue(tangent(angle) >= minusGap(tableTangent.get(angle)));
            assertTrue(tangent(angle) <= plusGap(tableTangent.get(angle)));
        }
    }
}
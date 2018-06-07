package model.time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClockTest {

    private Clock clock;

    @Before
    public void setUp() {
        this.clock = Clock.getInstance();
    }

    @Test
    public void timeSpend_test() {
        this.clock.spendTime(new TestableTimePeriod());
        assertFalse(this.clock.hasTimeRemaining());
    }

    private static class TestableTimePeriod extends TimePeriod {
        int requiredTime() {
            return 200;
        }
    }

}
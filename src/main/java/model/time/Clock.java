package model.time;

public class Clock {

    public static int PERIOD_LIMIT = 200;

    private RemainingTime remainingTime;

    private Clock(){}

    private Clock(int remainingTime) {
        this.remainingTime = RemainingTime.getInstance();
    }

    public static Clock getInstance() {
        return new Clock(PERIOD_LIMIT);
    }

    public void spendTime(TimePeriod period) {
        this.remainingTime.spendTime(period);
    }

    public boolean hasTimeRemaining() {
        return this.remainingTime.isTimeLeft();
    }
}

package model.time;

public class RemainingTime {

    private int time;

    private RemainingTime(){}

    private RemainingTime(int time) {
        this.time = time;
    }

    public static RemainingTime getInstance() {
        return new RemainingTime(Clock.PERIOD_LIMIT);
    }

    public void spendTime(TimePeriod period) {
        this.time -= period.requiredTime();
    }

    public int getTime() {
        return time;
    }

    public boolean isTimeLeft() {
        return this.time > 0;
    }
}

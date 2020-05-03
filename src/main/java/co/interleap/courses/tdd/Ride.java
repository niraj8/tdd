package co.interleap.courses.tdd;

public class Ride {

  private static final int FARE_PER_KM = 10;
  private static final int FARE_PER_MINUTE = 1;
  private final int distance;
  private final int durationInMinutes;

  public Ride(int distance, int durationInMinutes) {
    this.distance = distance;
    this.durationInMinutes = durationInMinutes;
  }

  int fare() {
    return distance * FARE_PER_KM + durationInMinutes * FARE_PER_MINUTE;
  }
}
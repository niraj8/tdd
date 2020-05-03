package co.interleap.courses.tdd;

import java.util.List;

public class Statement {
  private final List<Ride> rides;

  public Statement(List<Ride> rides) {
    this.rides = rides;
  }

  public double getTotalFare() {
    double fare = 0;
    for (Ride ride : rides) {
      fare += ride.fare();
    }
    return fare;
  }

  public int getNumberOfRides() {
    return rides.size();
  }

  public double getAverageFare() {
    return getTotalFare()/getNumberOfRides();
  }
}

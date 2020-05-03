package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StatementTest {

  @Test
  public void shouldCalculateFareForGivenDistanceAndTime() {
    Statement statement = new Statement(Collections.singletonList(new Ride(2, 5)));
    assertEquals(25, statement.getTotalFare(), .01);
    assertEquals(1, statement.getNumberOfRides());
    assertEquals(25, statement.getAverageFare(), .01);
  }

  @Test
  public void shouldCalculateFareForMultipleRides() {
    List<Ride> rides = new ArrayList<>();
    rides.add(new Ride(1, 5));
    rides.add(new Ride(2, 10));
    Statement statement = new Statement(rides);
    assertEquals(45, statement.getTotalFare(), .01);
    assertEquals(2, statement.getNumberOfRides());
    assertEquals(22.5, statement.getAverageFare(), .01);
  }

}
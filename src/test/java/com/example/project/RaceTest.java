package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.RepeatedTest;

public class RaceTest {

  @RepeatedTest(100)
  void test() {
    List<CompletableFuture<Void>> futures = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      int finalI = i;
      futures.add(CompletableFuture.runAsync(() -> startCar(String.valueOf(finalI))));
    }
    CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
  }

  private void startCar(String index) {
    var car = new Car();
    car.getUpdatePolicy().start(index);
//    car.start(index); works with this
    assertEquals(index, car.getJourneyId());
  }

}

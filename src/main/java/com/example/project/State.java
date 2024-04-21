package com.example.project;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum State {
  ON(new UpdatePolicy() {
    @Override
    public void start(String journeyId) {
      throw new RuntimeException("Car is already running");
    }
  }),
  OFF(new UpdatePolicy() {
    @Override
    public void start(String journeyId) {
      car.start(journeyId);
    }
  });

  private final UpdatePolicy updatePolicy;

  public UpdatePolicy getJobUpdatePolicy(Car car) {
    return updatePolicy.withContext(car);
  }
}

package com.example.project;


import lombok.Data;

@Data
public class Car {

  private State state = State.OFF;
  private String journeyId;

  public UpdatePolicy getUpdatePolicy() {
    return state.getJobUpdatePolicy(this);
  }

  public void start(String journeyId) {
    this.journeyId = journeyId;
  }
}

package com.ba.boost.solidDependencyInversionAndOpenClosed.diffrentbetter;

public class CarRunnerApp {
    public static void main(String[] args) {
        CarRunner carRunner = new CarRunner(new Mercedes());
        carRunner.runCar();
    }

}

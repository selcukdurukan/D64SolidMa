package com.ba.boost.solidDependencyInversionAndOpenClosed.diffrentbetter;

public class CarRunner {

    private ICar iCar;

    public CarRunner(ICar iCar) {
        this.iCar = iCar;
    }

    public void runCar() {
        iCar.run();
    }

}

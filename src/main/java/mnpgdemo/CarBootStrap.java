package mnpgdemo;

import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;

import javax.inject.Singleton;

@Singleton
public class CarBootStrap {

    private final CarRepository carService;

    public CarBootStrap(CarRepository carService) {
        this.carService = carService;
    }

    @EventListener
    public void createCars(ServerStartupEvent event) {
        if (carService.count() == 0) {
            carService.save(new Car("Ford", "Fusion"));
            carService.save(new Car("Chevy", "Equinox"));
        }
    }
}

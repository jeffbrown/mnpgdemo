package mnpgdemo

import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.runtime.server.event.ServerStartupEvent

import javax.inject.Singleton

@Singleton
class CarBootStrap {

    private final CarService carService

    CarBootStrap(CarService carService) {
        this.carService = carService
    }

    @EventListener
    void createCars(ServerStartupEvent event) {
        carService.save 'Ford', 'Fusion'
        carService.save 'Chevy', 'Equinox'
    }
}

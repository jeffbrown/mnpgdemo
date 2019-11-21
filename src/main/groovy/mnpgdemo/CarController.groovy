package mnpgdemo

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller('/automobiles')
class CarController {

    private final CarService carService

    CarController(CarService carService) {
        this.carService = carService
    }

    @Get('/')
    List<Car> index() {
        carService.list()
    }

    @Post('/{make}/{model}')
    Car save(String make, String model) {
        carService.save make, model
    }
}

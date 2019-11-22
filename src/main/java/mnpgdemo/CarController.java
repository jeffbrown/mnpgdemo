package mnpgdemo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/automobiles")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carService) {
        this.carRepository = carService;
    }

    @Get("/")
    public Iterable<Car> index() {
        return carRepository.findAll();
    }

    @Post("/{make}/{model}")
    public Car save(String make, String model) {
        return carRepository.save(new Car(make, model));
    }
}

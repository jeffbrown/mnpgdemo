package mnpgdemo

import grails.gorm.services.Service

@Service(Car)
interface CarService {

    List<Car> list()
    Car save(String make, String model)
}
package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Volvo","Black",1948));
        cars.add(new Car("Mazda","Red",1998));
        cars.add(new Car("Lada","White",2001));
        cars.add(new Car("Reno","Blue",2006));
        cars.add(new Car("Mercedes-Benz","Black",2024));
    }

    @Override
    public List<Car> carList(int x) {
        return cars.stream()
                .limit(x)
                .collect(Collectors.toList());
    }
}

package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.ArrayList;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars = new ArrayList<>() {{
        add(new Car("developer1", "model1", 111));
        add(new Car("developer2", "model2", 222));
        add(new Car("developer3", "model3", 333));
        add(new Car("developer4", "model4", 444));
        add(new Car("developer5", "model5", 555));
    }};

    public List<Car> getCars(Integer num) {
        return (num <= 0 || num > cars.size())
                ? cars
                : cars.subList(0, num);
    }
}

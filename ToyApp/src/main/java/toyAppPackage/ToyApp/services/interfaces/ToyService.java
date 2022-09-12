package toyAppPackage.ToyApp.services.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import toyAppPackage.ToyApp.data.Toy;

import java.util.List;

public interface ToyService {
    Toy getOneById(int id);
    List<Toy> getAllToys();
    void createToy(Toy toy);
}

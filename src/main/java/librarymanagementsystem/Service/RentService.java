package librarymanagementsystem.Service;


import librarymanagementsystem.Repository.RentRepository;
import librarymanagementsystem.model.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RentService {

    @Autowired
    private RentRepository rentRepository;

    public List<Rent> getAllRents() {
        return rentRepository.findAll();
    }

    public Rent save(Rent rent) {
        return rentRepository.save(rent);
    }

    public void delete(UUID id) {
        rentRepository.deleteById(id);
    }
}

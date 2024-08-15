package librarymanagementsystem.Controller;

import librarymanagementsystem.Service.RentService;
import librarymanagementsystem.model.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rentals")
public class RentController {

    @Autowired
    private RentService rentService;

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.getAllRents();
    }

    @PostMapping
    public Rent createRent(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @DeleteMapping("/{id}")
    public void deleteRent(@PathVariable UUID id) {
        rentService.delete(id);
    }



}

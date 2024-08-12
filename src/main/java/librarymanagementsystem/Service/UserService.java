package librarymanagementsystem.Service;

import librarymanagementsystem.Repository.UserRepository;
import librarymanagementsystem.model.Book;
import librarymanagementsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User save(User user) {
        return userRepository.save(user);
    }
    public void delete(UUID id) {
        userRepository.deleteById(id);
    }
}

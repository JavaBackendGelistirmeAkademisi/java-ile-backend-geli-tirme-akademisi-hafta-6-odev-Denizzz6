package service;

import jakarta.validation.ValidationException;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User addUser(User user){
        if (userRepository.existsByEmail(user.getEmail())){
            throw new ValidationException("Bu email ile kayıtlı kullanıcı var.");
        }
        userRepository.save(user);
        return user;
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı, ID: " + id));
    }
}

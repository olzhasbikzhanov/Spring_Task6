package web.DAO;

import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import java.util.List;

@Transactional
public interface UserDao {

    List<User> indexUser();

    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete (int id);


}

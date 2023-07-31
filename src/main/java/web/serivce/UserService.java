package web.serivce;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> indexUser();

    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete (int id);
}

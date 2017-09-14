package dao;

import model.User;

import java.util.List;

/**
 * Created by comp on 14.09.2017.
 */
public interface UserDAO {
    List<User> getAll();
}

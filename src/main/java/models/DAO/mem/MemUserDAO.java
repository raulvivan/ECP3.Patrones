package models.DAO.mem;

import models.DAO.UserDAO;
import models.Entities.User;

public class MemUserDAO extends MemGenericDAO<User, String> implements UserDAO {

    @Override
    protected String getId(User entity) {
        return entity.getId();
    }

}

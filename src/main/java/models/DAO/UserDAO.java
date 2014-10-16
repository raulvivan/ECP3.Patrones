package models.DAO;

import models.Entities.User;

public interface UserDAO extends GenericDAO<User, String> {
    
    public String getId(User entity);

}

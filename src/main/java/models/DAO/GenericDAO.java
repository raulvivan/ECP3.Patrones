package models.DAO;

import java.util.Map;

public interface GenericDAO<T, ID> {

    public void create(T entity);

    public T read(ID id);

    public void update(T entity);

    public void delete(T entity);

    public void deleteById(ID id);

    public Map<ID, T> findAll();

    public Map<ID, T> findAll(int index, int size);

}

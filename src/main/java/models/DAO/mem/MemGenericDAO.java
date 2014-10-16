package models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

    private Map<ID, T> mapa = new HashMap<ID, T>();

    protected abstract ID getId(T entity);

    @Override
    public void create(T entity) {
        mapa.put(this.getId(entity), entity);
    }

    @Override
    public T read(ID id) {
        return mapa.get(id);
    }

    @Override
    public void update(T entity) {
        assert mapa.containsKey(this.getId(entity)) : "La entidad deberia existir";
        mapa.put(this.getId(entity), entity);
    }

    @Override
    public void delete(T entity) {
        this.deleteById(this.getId(entity));
    }

    @Override
    public void deleteById(ID id) {
        assert mapa.containsKey(id) : "La entidad deberia existir";
        mapa.remove(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<T>(mapa.values());
    }

    @Override
    public List<T> findAll(int index, int size) {
        List<T> lista = this.findAll();
        
        return lista.subList(index, size);
    }

}

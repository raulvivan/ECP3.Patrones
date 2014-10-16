package models.DAO.mem;

import models.DAO.RoundDAO;
import models.Entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements RoundDAO {

    @Override
    protected Integer getId(Round entity) {
        return entity.getId();
    }

}

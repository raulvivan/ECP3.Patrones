package models.DAO;

import models.Entities.Round;

public interface RoundDAO extends GenericDAO<Round, Integer> {

    public Integer getId(Round entity); 
    
}

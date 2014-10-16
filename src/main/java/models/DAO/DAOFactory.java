package models.DAO;

public abstract class DAOFactory {

    private static DAOFactory factory = null;

    public static DAOFactory getInstance() {
        assert factory != null : "Instancia no inyectada";
        return factory;
    }

    public static void setFactory(DAOFactory daoFactory) {
        DAOFactory.factory = daoFactory;
    }

    public abstract RoundDAO getRoundDAO();

    public abstract UserDAO getUserDAO();

}

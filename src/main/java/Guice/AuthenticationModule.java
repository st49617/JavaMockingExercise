package Guice;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import cz.upce.fei.inptp.databasedependency.dao.DAO;
import cz.upce.fei.inptp.databasedependency.dao.PersonDAO;
import cz.upce.fei.inptp.databasedependency.entity.Person;

/**
 *
 * @author st49617
 */
public class AuthenticationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(new TypeLiteral<DAO<Person>>() {
        }).to(PersonDAO.class);
    }

}

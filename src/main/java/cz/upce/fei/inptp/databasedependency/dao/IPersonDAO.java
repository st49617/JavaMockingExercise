package cz.upce.fei.inptp.databasedependency.dao;

import cz.upce.fei.inptp.databasedependency.entity.Person;

/**
 *
 * @author st49617
 */
public interface IPersonDAO extends DAO<Person> {

    public String getRoleWhereStringFor(Person object);
}

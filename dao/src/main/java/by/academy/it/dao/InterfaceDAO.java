package by.academy.it.dao;

import java.util.List;

/**
 * Created by Asus on 28.10.2016.
 */
public interface InterfaceDAO<TYPE> {

    TYPE read(int id);
    boolean create(TYPE entity);
    boolean update(TYPE entity);
    boolean delete(TYPE entity);

    List<TYPE> getAll(String WhereAndOrder);




}

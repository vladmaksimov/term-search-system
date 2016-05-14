package com.krivoruchka.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created on 01.05.2016.
 */

@Repository
@Transactional
public abstract class AbstractDao <PK extends Serializable, T> {

    private final Class<T> persistent;

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    protected AbstractDao() {
        this.persistent = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    @SuppressWarnings("unchecked")
    public T getById(PK key) {
        return (T) getSession().get(persistent, key);
    }

    @Transactional
    public void save(T entity) {
        getSession().saveOrUpdate(entity);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(persistent);
    }

}

package com.krivoruchka.dao;

import com.krivoruchka.entity.Document;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 30.04.2016.
 */

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class DocumentDao extends AbstractDao<Long, Document>{

    @Transactional
    public void save(Document d) {
        getSession().save(d);
    }

}

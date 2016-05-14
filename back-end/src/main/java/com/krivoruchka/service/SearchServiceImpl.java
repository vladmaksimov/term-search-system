package com.krivoruchka.service;

import com.krivoruchka.dao.DocumentDao;
import com.krivoruchka.entity.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;

/**
 * Created on 02.05.2016.
 */

@Service
public class SearchServiceImpl implements SearchService {

    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    @Autowired
    private DocumentDao documentDao;

    public Document searchTerms(File file) {
        logger.info("start search");
        return null;
    }

    @Transactional
    public Document getDocument() {
        return documentDao.getById(6L);
    }

}

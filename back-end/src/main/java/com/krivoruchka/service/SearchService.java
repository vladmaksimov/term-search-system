package com.krivoruchka.service;

import com.krivoruchka.entity.Document;

import java.io.File;

/**
 * Created on 02.05.2016.
 */
public interface SearchService {

    Document searchTerms(File file);

    Document getDocument();

}

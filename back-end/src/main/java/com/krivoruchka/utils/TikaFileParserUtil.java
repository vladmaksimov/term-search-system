package com.krivoruchka.utils;

import com.krivoruchka.service.SearchServiceImpl;
import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created on 15.05.2016.
 */
@Component
public class TikaFileParserUtil {

    private static final Logger logger = LoggerFactory.getLogger(TikaFileParserUtil.class);
    private static final Integer TIKA_MAX_STRING_LENGTH = -1;

    public String convertToString(String filePath) {
        Tika tika = new Tika();
        tika.setMaxStringLength(TIKA_MAX_STRING_LENGTH);
        Metadata metadata = new Metadata();
        String text = null;

        try (InputStream stream = new FileInputStream(filePath)) {
            text = tika.parseToString(stream, metadata);
        } catch (Exception e) {
            logger.error("Error to parse file: " + e.getMessage());
        }

        return text;
    }
}

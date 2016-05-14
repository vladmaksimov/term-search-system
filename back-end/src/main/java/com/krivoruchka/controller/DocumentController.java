package com.krivoruchka.controller;

import com.krivoruchka.entity.Document;
import com.krivoruchka.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created on 30.04.2016.
 */

@Controller
@RequestMapping("/api/file")
public class DocumentController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public void uploadFile(MultipartFile file) {
        searchService.searchTerms((File) file);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Document uploadFile() {
        return searchService.getDocument();
    }

    @RequestMapping(value = "/download/{id}")
    public void download(HttpServletResponse response, @PathVariable(value = "id") Long id) throws IOException {
//        FileMessage file = viewHistoryService.getFile(roomName, channelType, id);
//        response.setContentType(file.getType());
//        response.addHeader("Content-Disposition", "attachment; filename=" + file.getName());
//        viewHistoryService.writeFile(response, file.getFileSystemUrl());
    }

}

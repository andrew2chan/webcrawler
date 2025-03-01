package com.andrew2chan.webcrawler.controllers;

import com.andrew2chan.webcrawler.domain.PageLookupRequest;
import com.andrew2chan.webcrawler.services.PageLookupService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PageController {
    private final PageLookupService pageLookupService;

    public PageController(PageLookupService pageLookupService) {
        this.pageLookupService = pageLookupService;
    }

    @PostMapping("getLinks")
    public ResponseEntity<List<String>> getListOfLinks(@RequestBody PageLookupRequest lookupRequest) {
        if(lookupRequest.getLinkAddress().isEmpty()) return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

        List<String> links = pageLookupService.lookupPage(lookupRequest.getLinkAddress());

        return new ResponseEntity<>(links, HttpStatus.OK);
    }
}

package com.andrew2chan.webcrawler.services.impl;

import com.andrew2chan.webcrawler.services.PageLookupService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageLookupImpl implements PageLookupService {
    @Override
    public List<String> lookupPage(String url) {
        return List.of(url);
    }
}

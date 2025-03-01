package com.andrew2chan.webcrawler.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageLookupRequest {
    public String linkAddress;
}

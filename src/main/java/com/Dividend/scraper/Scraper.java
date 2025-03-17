package com.Dividend.scraper;

import com.Dividend.model.Company;
import com.Dividend.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}

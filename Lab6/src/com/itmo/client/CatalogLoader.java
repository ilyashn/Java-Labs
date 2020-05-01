package com.itmo.client;

import com.itmo.exceptions.CatalogLoadException;
import com.itmo.warehouse.ItemCatalog;

public interface CatalogLoader {
    void load(ItemCatalog itemCatalog) throws CatalogLoadException;
}

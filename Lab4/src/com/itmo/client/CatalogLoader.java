package com.itmo.client;

import com.itmo.warehouse.ItemCatalog;

public interface CatalogLoader {
    void load(ItemCatalog itemCatalog);
}

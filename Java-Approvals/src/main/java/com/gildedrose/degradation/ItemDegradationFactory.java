package com.gildedrose.degradation;

import com.gildedrose.Item;

public class ItemDegradationFactory {

    public ItemDegradation of(Item item) {
        return switch (item.name) {
            case "Sulfuras, Hand of Ragnaros" -> new SulfurasItemDegradation();
            case "Aged Brie" -> new AgedBrieItemDegradation(item);
            case "Backstage passes to a TAFKAL80ETC concert" -> new BackstagePassItemDegradation(item);
            default -> new GeneralItemDegradation(item);
        };
    }

}

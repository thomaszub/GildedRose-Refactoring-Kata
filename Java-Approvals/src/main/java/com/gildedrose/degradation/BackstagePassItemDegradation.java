package com.gildedrose.degradation;

import com.gildedrose.Item;

class BackstagePassItemDegradation implements ItemDegradation {

    private final Item item;

    public BackstagePassItemDegradation(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.sellIn -= 1;
        item.quality += 1;
        if (item.sellIn < 10) {
            item.quality += 1;
        }
        if (item.sellIn < 5) {
            item.quality += 1;
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}

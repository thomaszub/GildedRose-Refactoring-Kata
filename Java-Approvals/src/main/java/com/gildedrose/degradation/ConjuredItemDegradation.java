package com.gildedrose.degradation;

import com.gildedrose.Item;

class ConjuredItemDegradation implements ItemDegradation {

    private final Item item;

    public ConjuredItemDegradation(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.sellIn -= 1;
        item.quality -= 2;
        if (item.sellIn < 0) {
            item.quality -= 2;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}

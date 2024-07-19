package com.gildedrose.degradation;

import com.gildedrose.Item;

class AgedBrieItemDegradation implements ItemDegradation {

    private final Item item;

    public AgedBrieItemDegradation(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.sellIn -= 1;
        item.quality += 1;
        if (item.sellIn < 0) {
            item.quality += 1;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }

}

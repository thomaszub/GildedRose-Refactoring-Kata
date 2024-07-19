package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (var item : items) {
            updateQuality(item);
        }
    }

    private static void updateQuality(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        item.sellIn -= 1;

        if (item.name.equals("Aged Brie")) {
            item.quality += 1;
            if (item.sellIn < 0) {
                item.quality += 1;
            }
            if (item.quality > 50) {
                item.quality = 50;
            }
            return;
        }

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
            return;
        }

        if (item.quality > 0) {
            item.quality -= 1;
        }

        if (item.quality > 0 && item.sellIn < 0) {
            item.quality -= 1;
        }
    }

}

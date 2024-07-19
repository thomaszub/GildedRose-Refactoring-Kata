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
        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                break;
            case "Aged Brie":
                updateAgedBrie(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                updateBackstagePass(item);
                break;
            default:
                updateOther(item);
        }
    }

    private static void updateOther(Item item) {
        item.sellIn -= 1;
        item.quality -= 1;
        if (item.sellIn < 0) {
            item.quality -= 1;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }

    private static void updateBackstagePass(Item item) {
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

    private static void updateAgedBrie(Item item) {
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

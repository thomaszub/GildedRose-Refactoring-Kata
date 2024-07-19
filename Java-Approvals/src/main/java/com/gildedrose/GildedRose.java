package com.gildedrose;

import com.gildedrose.degradation.ItemDegradation;
import com.gildedrose.degradation.ItemDegradationFactory;

import java.util.List;
import java.util.stream.Stream;

class GildedRose {
    private final List<ItemDegradation> itemDegradations;

    public GildedRose(Item[] items) {
        var factory = new ItemDegradationFactory();
        this.itemDegradations = Stream.of(items).map(factory::of).toList();
    }

    public void updateQuality() {
        itemDegradations.forEach(ItemDegradation::update);
    }

}

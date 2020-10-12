package com.example.hondacarapplication.dummy;

import com.example.hondacarapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

//    private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1","Honda Jazz/Fit","A small MPV that has been on the market since 2000 and it is now on its fourth generation. The previous generations were available only as city-vehicles."));
        addItem(new DummyItem("2","HONDA Odyssey","The fifth generation of the big MPV from Honda was introduced on the market in 2018 and, in 2020, it went through a mid-life cycle refresh."));
        addItem(new DummyItem("3","HONDA Civic Hatchback","Exterior styling refinements to the 2020 Honda Civic Hatchback lineup include revised styling of the lower bumper fog light housings, which now features a body-color crossbar."));
        addItem(new DummyItem("4","HONDA CR-V","For over 20 years, the Honda CR-V has been the best-selling crossover in the United States, which is why Honda has decided to gift its fifth generation an extensive mid-cycle facelift for the 2020 model year."));
        addItem(new DummyItem("5","HONDA Civic Sedan","Even though it wasn't too much since the tenth generation of the Honda Civic was launched, the Japanese car-maker introduced a facelift for it in 2018."));
        addItem(new DummyItem("6","HONDA Civic Type-R","The fifth generation Honda Civic Type-R was introduced in 2017 after being unveiled at the Paris Motor Show in November 2016. The new model uses a design that derives from the standard Civic model."));
        addItem(new DummyItem("7","HONDA NSX","After ten years of absence on the market, a new generation Honda NSX supercar debuted at the 2015 North American International Auto Show, bringing a new experience in its segment."));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String title;
        public final String description;

        public DummyItem(String id, String title, String description) {
            this.id = id;
            this.title = title;
            this.description = description;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
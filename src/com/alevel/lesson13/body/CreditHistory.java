package com.alevel.lesson13.body;

import com.alevel.lesson13.Footer;
import com.alevel.lesson13.Header;

public class CreditHistory implements Body {

    @Override
    public void render() {
        new Header().render();
        System.out.println("...Here would be your credit history");
        String[] array = {"2010 ","2011 ","2012 ","2013 ","2014 ","2015 ","2016 ","2017 ","2018 ","2019 "};
        BodyData data = new BodyData(array);
        data.add("2020 ");
        data.add("2021 ");
        data.print();
        new Footer().render();
    }
}

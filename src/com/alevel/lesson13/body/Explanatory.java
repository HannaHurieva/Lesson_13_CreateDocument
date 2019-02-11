package com.alevel.lesson13.body;

import com.alevel.lesson13.Footer;
import com.alevel.lesson13.Header;

public class Explanatory implements Body {
    @Override
    public void render() {
        new Header().render();
        System.out.println("...Go write explanatory!");
        new Footer().render();
    }
}

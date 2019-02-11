package com.alevel.lesson13;

import com.alevel.lesson13.body.Body;

public abstract class Document {
    public void renderDocument() {
        Body document = createDocument();
        document.render();
    }
    public abstract Body createDocument();

}

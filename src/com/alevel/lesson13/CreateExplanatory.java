package com.alevel.lesson13;

import com.alevel.lesson13.Document;
import com.alevel.lesson13.body.Body;
import com.alevel.lesson13.body.Explanatory;

public class CreateExplanatory extends Document {

    @Override
    public Body createDocument() {

        return new Explanatory();
    }
}

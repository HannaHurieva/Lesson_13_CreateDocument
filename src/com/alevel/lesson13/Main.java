package com.alevel.lesson13;

public class Main {
    public static void main(String[] args) {
        Document creditHistory = new CreateCreditHistory();
        Document explanatory = new CreateExplanatory();
        creditHistory.renderDocument();
        explanatory.renderDocument();
    }
}


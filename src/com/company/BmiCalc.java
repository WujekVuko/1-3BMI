package com.company;

public class BmiCalc {

        private double bmi;
        private int weight;
        private int height;


        BmiCalc(int w, int h) {
            weight = w;
            height = h;
        }

        void setBmi() {
            bmi = weight / ((height * height) / 10000);
        }

        String yourBmi() {
            if (bmi < 18.5) {
                return "Zjedz coś";
            }
            if (bmi > 24.9) {
                return "Zostaw te kanapkę";
            } else {
                return "jest ok";
            }

        }

        double getBmi() {
            return bmi;
        }

        int getwig() {
            return weight;
        }

        int gethig() {
            return height;
        }

}

package com.maradinho.coupons.tdd;

public class RomanNumerals {

    public String toRoman(int natural) {

        if (natural < 4) {
            return sumI(natural);
        }

        switch(natural) {
            case 4:
                return "IV";

            case 5:
                return "V";

            case 6:
                return "VI";

        }

        return null;
    }

    private String sumI(int natural) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < natural; i++) {
            result.append("I");
        }

        return result.toString();
    }
}

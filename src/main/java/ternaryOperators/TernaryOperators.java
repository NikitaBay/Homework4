package ternaryOperators;

public class TernaryOperators {
    int number;
    public static String convertNumber(int number) {
        String result = number > 0 ? number % 7 < 4 ? "positive-m" : "positive-p" : number == 0 ? "zero" : number % 7 > -4 ? "negative-m" : "negative-p";
        System.out.println(result);
        return result;
    }
}
//        public static String convertNumber(int number) {
//            String result;
//            if (number > 0) {
//                if (number % 7 < 4) {
//                    result = "positive-m";
//                } else {
//                    result = "positive-p";
//                }
//            } else {
//                if (number == 0) {
//                    result = "zero";
//                } else if (number % 7 > -4) {
//                    result = "negative-m";
//                } else {
//                    result = "negative-p";
//                }
//            }
//            return result;
//        }
public class Rename {
    public static String Transform (String[] blocks) {
        String s = "";
        if (Calc.ArabOrRoman(blocks) == true) {
            int num1 = Oper.Arab(blocks);
            while (num1 >= 100) {
                s += "C";
                num1 -= 100;
            }
            while (num1 >= 90) {
                s += "XC";
                num1 -= 90;
            }
            while (num1 >= 50) {
                s += "L";
                num1 -= 50;
            }
            while (num1 >= 40) {
                s += "XL";
                num1 -= 40;
            }
            while (num1 >= 10) {
                s += "X";
                num1 -= 10;
            }
            while (num1 >= 9) {
                s += "IX";
                num1 -= 9;
            }
            while (num1 >= 5) {
                s += "V";
                num1 -= 5;
            }
            while (num1 >= 4) {
                s += "IV";
                num1 -= 4;
            }
            while (num1 >= 1) {
                s += "I";
                num1 -= 1;
            }
        }
        return s;
    }
}

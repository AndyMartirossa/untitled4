import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        System.out.println("Введите выражение");

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] blocks = text.split(" ");

        if (ArabOrRoman(blocks) == true){
            System.out.println(Rename.Transform(blocks));
        }
        else{
            System.out.println(Oper.Arab(blocks));
        }
    }

    public static boolean ArabOrRoman(String[] blocks) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        for (int i = 0; i < roman.length; i++) {
            if (blocks[0].equals(roman[i])) {
                flag1 = true;
            }
        }
        for (int a = 0; a < roman.length; a++) {
            if (blocks[2].equals(roman[a])) {
                flag2 = true;
            }
        }
        if (flag1 == true && flag2 == true){
            flag = true;
        }
        else if ((flag1 == false && flag2 == true) || (flag1 == true && flag2 == false)){
            throw new IllegalArgumentException("Цифры должны быть либо арабские, либо римские.");
        }
        return flag;
    }



}

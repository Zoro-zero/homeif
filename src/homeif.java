import java.util.Scanner;

public class homeif {
    public static void main(String[] args) {

        String OneProgram_1="Меня зовут Нуртилек";
        final int OneProgram_2=99;
        String word=" hello ";
        System.out.println(OneProgram_2+word);

        OneProgram_1= " 99hello ";
        System.out.print(OneProgram_1);
        System.out.print(OneProgram_2);
        System.out.println(word);

        if(OneProgram_2<0){
            System.out.println("Вы сохранили отрицательное число");
        }else if(OneProgram_2>0) {
            System.out.println("Вы сохранили положительное число");
        }else{
            System.out.println("Вы сохранили 0");
        }

        Scanner Friends = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String bro=Friends.nextLine();
        System.out.println("Привет "+bro);
        Friends.close();
        System.out.println("Вваше число:"+Math.random());
    }
}

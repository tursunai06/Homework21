import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
        Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
                Мумкун болгон каталар:
        1) берилген маалымат терс сан болсо
        2) берилген маалымат сан эмес тамга болсо
        3) жана озунуздор берген кошумча каталар болсо да болот

        Параллелепипед:
        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
        - Фигуранын коломун эсептеген формула: (length*width*height);
        -Формулалар Parallelepiped классында жазылуусу керек

        Цилиндр:
        - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
        - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
        -Формулалар Cylinder классында жазылуусу керек

        Бардык Exception дор логикасы main класста жазылcын
        Бардык маалмыттар консоль аркылуу берилсин
        Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап,
        тандаган фигураны эсептеп бериши керек.*/
        System.out.println("Choose a figur :" +
                "1.Parallelepiped" +
                " 2.Cylinder ");
        int number = new Scanner(System.in).nextInt();
        if (number == 1) {
            try {
                while (true) {
                    Parallelepiped parallelepiped = new Parallelepiped();
                    System.out.println("Input length");
                    int length = new Scanner(System.in).nextInt();
                    if (length > 0) {
                        parallelepiped.setLength(length);
                    } else {
                        throw new Exception("Length must not be a negative number");

                    }
                    System.out.println("Input width");
                    int width = new Scanner(System.in).nextInt();
                    if (width > 0) {
                        parallelepiped.setWidth(width);
                    } else {
                        throw new Exception("Width must not be a negative number");
                    }
                    System.out.println("Input height");
                    int height = new Scanner(System.in).nextInt();
                    if (height > 0) {
                        parallelepiped.setHeight(height);
                    } else {
                        throw new Exception("Height must not be a negative number");
                    }
                    parallelepiped.area(parallelepiped.getLength() , parallelepiped.getWidth() , parallelepiped.getHeight());
                    parallelepiped.volume(parallelepiped.getLength() ,parallelepiped.getWidth() ,parallelepiped.getHeight());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("write only numbers");
            }
        } else if (number == 2) {
        try {
            Cylinder cylinder = new Cylinder();
            System.out.println("Input height");
            int height = new Scanner(System.in).nextInt();
            if (height > 0) {
                cylinder.setHeight(height);
            } else {
                throw new Exception("Length cylinder  must not be a negative number");
            }
            System.out.println("Input radius");
            int radius = new Scanner(System.in).nextInt();
            if (radius > 0) {
                cylinder.setRadius(radius);
            } else {
                throw new Exception("Radius cylinder  must not be a negative number");
            }
            cylinder.area( cylinder.getHeight(), cylinder.getRadius());
            cylinder.volume(cylinder.getHeight() ,cylinder.getRadius());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("write only numbers");

        }
    }}}





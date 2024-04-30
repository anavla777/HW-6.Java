package com.anavla777;

import java.util.List;

public class FirstClass {

  public static void main(String... args) {
    // Целочисленные типы
    byte aByte = 0; // 8b   -128 + 127
    short aShort = 0; // 16b -32768 +32767
    int aInt = 0; // 32b   (-2^32) .. (+2^32 -1)
    Integer intWrapper = 0;
    long aLong = 0L; // 64b
    // Типы с плавающей точкой
    float aFloat = 0.0F;
    double aDouble = 0.0;
    Double doubleWrapper = 9.1;
    // Символьный
    char aChar = 'a';
    Character charWrapper = 'a';
    // Логически тип
    boolean aBoolean = true;
    Boolean booleanWrapper = true;
    // Строка (и бесконечность других объектных/ссылочных типов)
    String toBePrint = "Hello world!";
    List<Integer> teachers = List.of(10, 20);

    // Операторы
    // Оператор присвоения =
    String nameFirst = "Vlad";
    int age = 26;
    String nameSecond = "Vlad";
    // Арифметические операторы + - / * % ++ --
    int result = aInt;

    // Операторы сравнения <, >, >=, <=, !=, ==

    // Логические операторы &, |, &&, ||, !

    // Оператор instanceof

    System.out.println(nameFirst instanceof  String);
    System.out.println(age+doubleWrapper);
    byte b = 127;
    b = (byte) (b+1);
    System.out.println(b); //вернет минимум для byte (-128)

    short c = 0;
    byte d = 127;
    c = (short) (d + 1);
    System.out.println(c);

    //операции с комбинированными типами данных
    int bInt = 9;
    double bDouble = 0.1;
    System.out.println(bInt+bDouble);

    System.out.println(bInt/bDouble);

    System.out.println(bInt%bDouble);

  }
}

package com.skillbrain;

import java.util.Scanner;

public class Metode {

    //atribute



    //metode

    //definim o metoda prin care citim un nr de tip int de la tastatura:
    public static int citireNumarDeLatastatura(){

        //cerem utilizatorului sa intorudca un nr:
        System.out.println("Introduceti numarul:");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }




    //definim o metoda care meste ca param 2 numere de tip int si returneaza suma lor
    public static int sumaADouaNumere(int param1, int param2){

        return (param1+param2);
    }







    public static void main (String[] args){

       //citim nr1 de la tastura si il punem in var1
        int var1 = citireNumarDeLatastatura();

        //citim al doilea nr:
        int var2 = citireNumarDeLatastatura();

        //apelam metoda sumaADouaNumere cu parametri var1 si var2
        System.out.println("Suma numerelor introduse de la tastatura este: " + sumaADouaNumere(var1, var2));
    }

}

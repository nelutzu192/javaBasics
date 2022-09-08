package com.skillbrain;

import java.util.Scanner;

public class TemaCristina {

//    public static void douaNumere(){}

    public static void myVariables(){

        int var1 = 1;
        System.out.println("Valoarea variabile var1 este " + var1);
        String var2 = "abc";
        System.out.println("Valoarea variabile var2 este " + var2);
        boolean var3 = true;
        System.out.println("Valoarea variabile var3 este " + var3);

    }

    public static void main(String[] args) {

        // 1. Scrieti un program care afiseaza “Imi place Java”
        System.out.println("Exercitiul 1");
        System.out.println("Imi place Java!");

        /* 2.Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”*/

        System.out.println("Exercitiul 2");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");
        System.out.println("Cursul acesta este foarte fain");

        /* 3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.*/

        System.out.println("Exercitiul 3");
        int x = 24;
        System.out.println(x -6);


        // 4. Scrieti un program in care cititi o propozitie de la tastatura

        System.out.println("Exercitiul 4");
        Scanner scanner = new Scanner(System.in);
//        String name = "summer";
//        System.out.println (name);

        /*CORECTIE exercitiul 4:
            Avem nevoie sa citim un text de la tastatura, mai sus s-a definit obiectul scanner de tip Scanner;
            Apoi utilizatorul programului are nevoie sa stie ca noi asteptam ca el sa introduca un text de la tastatura
            asadar il rugam sa faca acest lucru, afisand un mesaj: Va rog introduceti textul de la tastatura:
            stocam acest text in variabila textCitit de tip String; iar textul introdus se citeste apeland metoda next() a obiectului scanner
            Apoi afisam textul citit pe ecran apeland metoda println()
         */

        //comentariu pe o sigura linie

        /*
        sakdajslkda
        adasdfa
        asdasdas

         */

        System.out.println("Va rog introduceti textul de la tastatura:");
        String textCitit = scanner.next();
        System.out.println("Textul citit de la tastatura este: " + textCitit);

        /* 5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un String si un boolean, apoi apelati metoda din metoda “main” */

        System.out.println("Exercitiul 5");
        int numar = 17;
        String destinatie = "Hawaii";
        Boolean myboolean = true;

        System.out.println(numar + destinatie + myboolean + " I called myVariables!");

        /*CORECTIE exercitiul 5
        Definim sus metoda myVariables()
        de tipul void - adica nu returneaza nimic, doar defineste cele 3 variabile var1, var2, var3
        apoi o apelam din metoda main() prin a o chema: myVariables();
        ca sa verificam ca s-a apelat corect, am adaugat in body-ul metodei, si intructiunea println(), succesiv, du
        definirea fiecarei variabile in parte; in felul acesta, cand se executa metoda, codul scrie in consola
        valoarea fiecarei variabile
         */
        System.out.println("Apelare metoda myVariables:");
        myVariables();

    }
}

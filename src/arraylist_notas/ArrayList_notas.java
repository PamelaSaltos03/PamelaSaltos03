/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_notas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class ArrayList_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String _nombre;
        int _nota1, _nota2, _nota3, op;
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> elementos = new ArrayList<>();

        do {
            System.out.println("-----------------Menú------------");
            System.out.println("1.-Ingresar las notas ");
            System.out.println("0.- salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante");
                    _nombre = sc.next();
                    System.out.println("Ingrese la nota 1");
                    _nota1 = sc.nextInt();
                    System.out.println("Ingrese la nota 2");
                    _nota2 = sc.nextInt();
                    System.out.println("Ingrese la nota 3");
                    _nota3 = sc.nextInt();
                    Estudiante estudiante = new Estudiante(_nombre, _nota1, _nota2, _nota3);
                    elementos.add(estudiante);

                    break;
                case 2:
                    break;

            }
        } while (op != 0);
        for (int i = 0; i < elementos.size(); i++) {
            Estudiante estudiante = elementos.get(i);
            System.out.println("en el indice elementos[" + i + "] ");
            System.out.println(" nombre : " + elementos.get(i).getNombre());
            System.out.println(" nota 1 :" + elementos.get(i).getNota1());
            System.out.println(" nota 2 : " + elementos.get(i).getNota2());
            System.out.println(" nota 3 : " + elementos.get(i).getNota3());

            double promedio = (estudiante.getNota1() + estudiante.getNota2() + estudiante.getNota3()) / 3;

            if (promedio >= 7) {
                System.out.println("El estudiante " + (i + 1) + " aprobó con un promedio de " + promedio);
            } else if (promedio >= 5) {
                System.out.println("El estudiante " + (i + 1) + " está en recuperación con un promedio de " + promedio);
            } else {
                System.out.println("El estudiante " + (i + 1) + " reprobó con un promedio de " + promedio);
            }
        }
    }
}

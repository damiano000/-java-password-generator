package org.lessons.java.security;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il cognome: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il colore preferito: ");
        String colorePreferito = scanner.nextLine();

        System.out.print("Inserisci il giorno di nascita (numero): ");
        int giornoNascita = scanner.nextInt();

        System.out.print("Inserisci il mese di nascita (numero): ");
        int meseNascita = scanner.nextInt();

        System.out.print("Inserisci l'anno di nascita (numero): ");
        int annoNascita = scanner.nextInt();

        int sommaData = giornoNascita + meseNascita + annoNascita;

        String password = nome + " " + cognome + " " + colorePreferito + " " + sommaData;
        System.out.println("La password generata è: " + password);

        scanner.close();
    }
}
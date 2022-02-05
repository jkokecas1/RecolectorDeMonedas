/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author redes1
 */
public class Escenarios {

    Scanner lector = new Scanner(System.in);
 //Para crear una ecena necsitas hacer un arreglo de cadena 
 //Espacios en blanco y caracteres diferentes "a" "e" "|" "-" Los tomara como espcao en blanco
 //Por lo que en la ecena no aparecera 
 //Sols "a" "|" "-"  se tomaran como referencia para crear las paredes 
public String[][] escenarioCero() {
  
        String[][] matriz = {
            {"e", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "a", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}};
        return matriz;
    }
   
    public String[][] escenarioUno() {

 String[][] matriz = {
             {" ", " ", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"},
             {"a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", " ", " ", " ", " ", "a", "a", "a", " ", "a", " ", " ", "a", " ", " ", " ", "a"},
             {"a", " ", " ", " ", " ", "a", " ", "a", " ", "a", " ", " ", "a", " ", " ", " ", "a"},
             {"a", " ", " ", " ", " ", "a", "a", "a", " ", "a", " ", " ", "a", " ", " ", " ", "a"},
             {"a", " ", " ", " ", " ", " ", " ", " ", " ", "a", "a", "a", "a", " ", " ", " ", "a"},
             {"a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", " ", " ", "a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", " ", " ", "a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", " ", " ", "a", " ", " ", "a", "a", "a", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", " ", " ", "a", " ", " ", "a", " ", "a", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", " ", " ", "a", "a", "a", "a", " ", "a", " ", " ", "a", " ", " ", " ", " ", "a"},
             {"a", " ", " ", " ", " ", " ", " ", " ", "a", " ", " ", "a", " ", " ", " ", " ", "a"},
             {"a", " ", " ", " ", "a", "a", "a", "a", "a", " ", " ", "a", " ", " ", " ", " ", "a"},
             {"a", " ", " ", " ", "a", " ", " ", " ", " ", " ", " ", "a", " ", " ", " ", " ", "a"},
             {"a", " ", " ", " ", "a", " ", " ", "a", "a", "a", "a", "a", " ", " ", " ", " ", "a"},
             {"a", " ", " ", " ", "a", " ", " ", "a", " ", " ", " ", " ", " ", " ", " ", " ", "a"},
             {"a", "a", "a", "a", "a", " ", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}};
        return matriz;
    }
    
    public String[][] escenarioDos() {
        String[][] matriz = {
            {"", "", "", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|"},
            {"|", "a", "*", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", " ", " ", " ", " ", "a", "|"},
            {"| ", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", " ", "a", "|"},
            {"| ", "a", " ", " ", " ", "a", "a", "a", "a", "a", "a", " ", "a", "a", " ", "a", "|"},
            {"| ", "a", " ", "a", " ", "a", "a", "a", "a", "a", "a", " ", "a", "a", " ", "a", "|"},
            {"|", "a", " ", "a", " ", " ", "a", "a", "a", "a", "a", " ", "a", "a", " ", "a", "|"},
            {"|", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", " ", "a", "a", " ", " ", "|"},
            {"|", "a", " ", "a", "a", " ", " ", " ", " ", " ", " ", " ", "a", "a", " ", "a", "|"},
            {"|", "a", " ", "a", "a", " ", " ", "a", "a", "a", "a", "a", "a", "a", " ", "a", "|"},
            {"|", "a", " ", "a", "a", " ", " ", " ", "a", "a", "a", "a", "a", "a", " ", " ", "|"},
            {"|", "a", " ", "a", "a", "a", " ", " ", "a", "a", " ", " ", " ", " ", "a", " ", "|"},
            {"|", "a", " ", "a", "a", "a", " ", " ", " ", " ", " ", "a", "a", " ", "a", " ", "|"},
            {"|", "a", " ", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", "a", " ", "|"},
            {"|", "a", " ", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", " ", " ", "|"},
            {"|", "a", " ", "a", "a", "a", " ", "a", "x", " ", "a", "a", "a", "a", "a", " ", "|"},
            {"|", "a", " ", " ", " ", " ", " ", "a", "a", " ", " ", " ", " ", " ", " ", " ", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}};
        return matriz;
    }

    public String[][] escenarioTres() {
        String[][] matriz = {
            {"", "", "", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", " ", " ", " ", "a", "a", "|"},
            {"|", "a", "a", "a", " ", " ", " ", " ", " ", " ", "a", " ", "a", " ", "a", "a", "|"},
            {"|", "a", "a", "a", " ", "a", "a", " ", "a", " ", " ", " ", "a", " ", " ", "a", "|"},
            {"|", " ", " ", " ", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", "a", "|"},
            {"|", " ", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", " ", "|"},
            {"|", " ", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", "a", "|"},
            {"|", " ", "a", "a", "a", "a", " ", " ", "a", "a", "a", "a", "a", "a", " ", "a", "|"},
            {"|", " ", " ", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", " ", "a", "|"},
            {"|", "a", "a", " ", "a", "a", "a", "x", "a", " ", " ", " ", "a", "a", " ", " ", "|"},
            {"|", "a", "a", " ", " ", " ", "a", " ", "a", " ", "a", " ", " ", "a", "a", " ", "|"},
            {"|", "a", "a", "a", " ", "a", "a", " ", " ", " ", "a", "a", " ", "a", " ", " ", "|"},
            {"|", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", " ", " ", "a", "|"},
            {"|", "a", " ", " ", " ", "a", "a", "a", "a", "a", " ", "a", " ", "a", " ", "a", "|"},
            {"|", "a", " ", "a", "a", "a", "a", "a", " ", " ", " ", "a", " ", " ", " ", " ", "|"},
            {"|", "*", " ", "a", "a", "a", " ", " ", " ", "a", "a", "a", " ", "a", "a", " ", "|"},
            {"|", "a", " ", " ", " ", "a", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", "|"},
            {"|", "a", "a", "a", " ", " ", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        return matriz;
    }
    
        public String[][] escenarioCuatro() {
        String[][] matriz = {
            {"", "", "", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a", "a", "a", "a", "|"},
            {"|", "a", " ", "a", "a", "a", " ", "a", "a", "a", " ", " ", " ", " ", " ", "a", "|"},
            {"|", " ", "*", "a", "a", "a", " ", " ", " ", " ", "a", " ", "a", "a", "a", "a", "|"},
            {"|", "a", " ", " ", " ", " ", " ", " ", " ", " ", "a", " ", "a", "a", "a", "a", "|"},
            {"|", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a", "|"},
            {"|", "a", " ", " ", " ", " ", " ", "a", " ", " ", " ", " ", " ", "a", "a", "a", "|"},
            {"|", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", "a", " ", "a", "a", "a", "|"},
            {"|", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", "a", " ", "a", "a", "a", "|"},
            {"|", "a", " ", " ", " ", "a", "a", "a", "a", "a", " ", "a", " ", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", " ", " ", " ", " ", " ", "a", "|"},
            {"|", "a", "a", " ", "a", " ", "a", " ", " ", " ", "a", "a", "a", "a", " ", "a", "|"},
            {"|", "a", "a", " ", "a", " ", "a", " ", "a", " ", "a", "a", "a", "a", " ", "a", "|"},
            {"|", "a", " ", " ", " ", " ", "a", " ", "a", " ", "a", "a", "a", "a", " ", "a", "|"},
            {"|", "a", " ", " ", " ", " ", " ", " ", "a", " ", " ", " ", " ", "a", " ", "a", "|"},
            {"|", "a", " ", "a", " ", "a", "a", "a", "a", " ", "a", "a", " ", "a", " ", " ", "|"},
            {"|", "x", " ", " ", " ", "a", " ", " ", " ", " ", "a", "a", " ", " ", " ", " ", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        return matriz;
    }
        
          public String[][] escenarioCinco() {
        String[][] matriz = {
            {"", "", "", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "a", " ", "a", " ", "a", "a", "a", " ", " ", " ", " ", "a", "a", "a", "a", "|"},
            {"|", " ", " ", " ", " ", " ", " ", "a", " ", "a", "a", " ", " ", " ", " ", " ", "|"},
            {"|", " ", "a", "a", "a", "a", " ", " ", " ", " ", " ", " ", "a", "a", "a", " ", "|"},
            {"|", " ", "a", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", " ", " ", " ", "|"},
            {"|", " ", "a", "a", "a", "a", " ", "a", "a", "a", "a", " ", " ", " ", " ", " ", "|"},
            {"|", " ", " ", "a", "a", "a", " ", "a", "a", "a", " ", " ", "a", "a", " ", "a", "|"},
            {"|", "a", " ", " ", " ", " ", " ", "a", "a", "a", " ", "a", "a", " ", "a", " ", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", " ", " ", "a", " ", "a", " ", "|"},
            {"|", "a", "a", " ", "a", "a", " ", " ", "a", "a", "a", " ", "a", " ", "a", " ", "|"},
            {"|", " ", " ", " ", " ", " ", "a", " ", " ", "a", "a", " ", " ", " ", " ", " ", "|"},
            {"|", "a", "a", "a", "a", " ", "a", " ", " ", "a", "a", "a", "a", "a", "a", " ", "|"},
            {"|", " ", " ", " ", "a", " ", "a", " ", "a", "a", "a", "a", "a", "a", "a", " ", "|"},
            {"|", " ", "a", " ", "a", " ", "a", " ", "a", "a", "a", " ", "a", " ", "a", "*", "|"},
            {"|", " ", "a", " ", " ", " ", "a", " ", "a", " ", " ", " ", "a", " ", "a", " ", "|"},
            {"|", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", " ", " ", " ", "a", "x", "|"},
            {"|", " ", "a", "a", "a", "a", "a", " ", "a", "a", "a", " ", "a", " ", "a", "a", "|"},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "a", " ", " ", "*", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        return matriz;
    }

}

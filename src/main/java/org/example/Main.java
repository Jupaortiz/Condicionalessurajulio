package org.example;

import javax.xml.transform.Source;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Scanner entradaTeclado=new Scanner(System.in);

        int anioNacimientoCliente;
        int anioActual;
        String nombresCompletosCliente;
        double salarioCliente;
        String licorFavoritoCLiente;
        String cantanteFavoritoCliente;
        double valorIva;
        byte numeroMesa;
        double valorDescuento;
       /* import java.util.Scanner;
        import java.text.DecimalFormat;
        import java.text.DecimalFormatSymbols;
        import java.math.RoundingMode;*/


        //ASIGNANDO VARIABLES
        System.out.print("Digita tus nombres y apellidos");
        nombresCompletosCliente=entradaTeclado.nextLine();

        System.out.print("Digita tu licor favorito: ");
        licorFavoritoCLiente=entradaTeclado.nextLine();

        System.out.print("Digita tu cantante favorito: ");
        cantanteFavoritoCliente=entradaTeclado.nextLine();


        System.out.print("Digite su año de nacimiento: ");
        anioNacimientoCliente=entradaTeclado.nextInt();

        System.out.print("Digite el año actual: ");
        anioActual=entradaTeclado.nextInt();

        System.out.print("Digita el salario del cliente: ");
        salarioCliente=entradaTeclado.nextInt();



        System.out.print("Valor del IVA: ");
        valorIva=entradaTeclado.nextDouble();

        System.out.print("valor del descuento: ");
        valorDescuento=entradaTeclado.nextDouble();

        System.out.print("Numero de la mesa del cliente: ");
        numeroMesa=entradaTeclado.nextByte();

        //Procesos del Algoritomo

        //1.Calcular la edad de usuario
        int edadUsuario=anioActual-anioNacimientoCliente;
        System.out.println("Aprecioado " +nombresCompletosCliente+ " Usted tiene " +edadUsuario+ " años");

        //2.Comparar y decidir sobre el salario
        final double valorSalarioMinimo=1300000;
        //La palabra Final significa que este valor sera fijo durante el proceso
        double numeroSalarios=salarioCliente/valorSalarioMinimo;
        System.out.println("Usted gana "+numeroSalarios+" SMLV");

        /*DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        DecimalFormat fomato= new DecimalFormat(pattern:"0.00,simbolo")
        fomato.setRoundingMode(RoundingMode.HALF_UP);
        String numeroSalariosFormato=formato.format(numeroSalarios);
        System.out.println("Usted gana: "+numeroSalariosFormato+ "SMLV");*/

        String formatoDos=String.format("%.2f", numeroSalarios);
        System.out.println("Usted gana "+formatoDos+"SLMV");

        //condicion logica para validar si tiene plaica
        if(numeroSalarios>=3.0){
            //camino de verdad
            System.out.println("Bienvenido patron");
        }else{
            //camino de negacion
            System.out.println("Chao arrastrado");
        }





    }
}
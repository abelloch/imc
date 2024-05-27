import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //inputs
        System.out.println("ingrese su Altura en metros:  ");
        float valtura = teclado.nextFloat();
        float caltura = valtura * 2 ;


        System.out.println("ingrese su Peso en  Kilos:  ");
        float vPeso = teclado.nextFloat();


        
        //Calculo IMC

        float imc = vPeso / caltura  ;

        System.out.println(" Su IMC es de " + imc + "Kg/Mtrs");

    

//mensajes para el usuario

            if(imc <= 16) {
            System.out.println("Usted tiene " + imc + ". Hasta 16 delgadez severa");
            }
            if(imc >= 16 && imc < 17) {
            System.out.println("Usted tiene " + imc + ". Desde 16 hasta 17 " + "delgadez moderada");
            }
            if(imc >= 17 && imc < 18.5) {
            System.out.println("Usted tiene " + imc + ". Desde 17 hasta 18 " + "delgadez leve");
            }
            if(imc >= 18.5 && imc < 25) {
            System.out.println("Usted tiene " + imc + ". Desde 18.5 hasta 25 " + "peso normal");
            }
            if(imc >= 25 && imc < 30) {
            System.out.println("Usted tiene " + imc + ". Desde 25 hasta 30 " + "sobrepeso");
            }
            if(imc >= 30 && imc < 35) {
                System.out.println("Usted tiene " + imc + ". Desde 30 hasta 35 " + "obesidad leve");
            }
            if(imc >= 35 && imc < 40) {
                System.out.println("Usted tiene " + imc + ". Desde 35 hasta 40 " + "obesidad moderada");
            }
            if(imc >= 40) {
                System.out.println("Usted tiene " + imc + ". Hasta 40 " + "obesidad morbida");
            }



        }


    }

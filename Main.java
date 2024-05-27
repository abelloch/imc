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


        //mensajes para el usuario



        //Calculo IMC

        float imc = vPeso / caltura  ;

        System.out.println(" Su IMC es de " + imc + "Kg/Mtrs");

        }
    }

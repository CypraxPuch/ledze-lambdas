package com.ledzedev.lambda;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 11/03/2017.
 */
public class Main {

    public static void main(String[] args) {

        //Iniciamos con una interfaz cuyo único método no devuelve nada y no tiene parámetros
        MiPrimerLambda miPrimerLambda = () -> System.out.println("Hola mundo con lambdas.");
        miPrimerLambda.metodoSinParametros();

        System.out.println("/***********************************/");

        OperacionBasicaLambda opSuma = (a,b) -> a+b;
        OperacionBasicaLambda opResta = (a,b) -> a-b;
        OperacionBasicaLambda opMultiplica = (a,b) -> a*b;
        OperacionBasicaLambda opDivide = (a,b) -> (int)(a/b);

        int resultadoSuma = opSuma.operacion(5,5);
        int resultadoResta = opResta.operacion(5,5);
        int resultadoMultiplica = opMultiplica.operacion(5,5);
        int resultadoDivide = opDivide.operacion(5,5);

        System.out.println("Resultado suma = "+resultadoSuma);
        System.out.println("Resultado resta = "+resultadoResta);
        System.out.println("Resultado multiplicación = "+resultadoMultiplica);
        System.out.println("Resultado división = "+resultadoDivide);
        System.out.println("/***********************************/");

        //También puedes sobre escribir el método para que se ejecute tu implementación.
        OperacionBasicaLambda opGenerica;
        opGenerica = (a,b) -> a+b;
        System.out.println("Misma objeto con diferente implementación. Resultado = "+opGenerica.operacion(10,2));
        opGenerica = (a,b) -> a-b;
        System.out.println("Misma objeto con diferente implementación. Resultado = "+opGenerica.operacion(10,2));
        opGenerica = (a,b) -> a*b;
        System.out.println("Misma objeto con diferente implementación. Resultado = "+opGenerica.operacion(10,2));
        opGenerica = (a,b) -> a/b;
        System.out.println("Misma objeto con diferente implementación. Resultado = "+opGenerica.operacion(10,2));
    }
}


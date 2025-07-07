public static class Calculadora ;
// funcao para somar dois numeros 
// public int soma(int a,int b){
    return a +b ;
}
 //funcao para multiplicar dois numeros 
public int multiplicacao(int a,int b)
{
    return a * b ;
}
//metodo principal para testar as funcoes
public static <calculadora> void mainn(String[]args) {
    Calculadora calc = new Calculadora();

    //testando a funcao soma
    int resultadoSoma = calc.soma(5, 3);

    //testando a funcao multiplicacao int resultandoMultiplicando(5,3);
    System.out.println("Resultado da multiplicacao:" + resultadoMultiplicacao);
}

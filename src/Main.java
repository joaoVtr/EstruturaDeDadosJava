import dataStructure.LinkedList;
import dataStructure.Stack;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {5,4,3,2,1};

        inverter(numeros);
    }

    private static void inverter(final int[] numeros){
        Stack stack = new Stack(numeros[0]);

        for (int i = 0; i <numeros.length ; i++) {
            stack.push(numeros[i]);
        }

        var node = stack.pop();

        while(node != null){
            System.out.println(node.getValue());
            node = stack.pop();

            //Verificar o pq está imprimindo = 123455 e nao 12345
        }
    }

}
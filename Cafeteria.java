import java.util.Stack;

public class Cafeteria {
    public static void main(String[] args) {

        Stack<String> pilaDePlatos = new Stack<>();


        pilaDePlatos.push("Plato 1");
        pilaDePlatos.push("Plato 2");
        pilaDePlatos.push("Plato 3");

        System.out.println("Pila actual: " + pilaDePlatos);


        String platoLimpio = pilaDePlatos.pop();
        System.out.println("Se usó: " + platoLimpio);

        System.out.println("Pila después de quitar un plato: " + pilaDePlatos);


        String platoCima = pilaDePlatos.peek();
        System.out.println("El plato arriba es: " + platoCima);
    }
}

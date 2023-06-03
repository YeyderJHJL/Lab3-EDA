import myExceptions.ExceptionNoFound;

public class TestList {
    public static void main(String[] args) throws ExceptionNoFound {
        
        StackList<String> Pila= new StackList<>();
        
        try{
            //metodo push()
            String element = Pila.push("Gato");
            System.out.println("Agregando con push: "+element);
            Pila.push("Perro");
            System.out.println("Agregando con push: Perro");
            
            //imprimir Pila con toString
            //metodo isEmpty() para verificacion si esta vacia
            System.out.println("La pila es: "+Pila);
            System.out.println("\nLa Pila esta vacia?: "+Pila.isEmpty());
            
            //metodo peek() para elemento de la cima
            System.out.println("El elemento de la cima es: "+Pila.peek());
            
            //metodo pop() para retirar el de la cima
            System.out.println("Elemento retirado de la Pila: "+Pila.pop());
            System.out.println("La nueva Pila es: "+Pila);
            System.out.println("\nElemento retirado de la Pila: "+Pila.pop());
            System.out.println("La nueva Pila es: "+Pila);
            System.out.println("\nLa Pila esta vacia?: "+Pila.isEmpty());
            
            //Agregando nuevos elementos
            Pila.push("Elefante");
            Pila.push("Cebra");
            Pila.push("Leon");
            Pila.push("Jirafa");
            
            //metodo search() para obtener la poscion del elemento
            System.out.println("\nLa nueva Pila es: "+Pila);
            
            System.out.println("El elemento de la cima es: "+Pila.peek());
            System.out.println("Jirafa en la posicion : "+Pila.search("Jirafa"));
            System.out.println("Leon en la posicion : "+Pila.search("Leon"));
            System.out.println("Elefante en la posicion : "+Pila.search("Elefante"));
            //retorna -1 si no esta en la Pila
            System.out.println("Mono en la posicion : "+Pila.search("Mono"));
            
            System.out.println("Elemento retirado de la Pila: "+Pila.pop());
            System.out.println("Elemento retirado de la Pila: "+Pila.pop());
            System.out.println("Elemento retirado de la Pila: "+Pila.pop());
            System.out.println("Elemento retirado de la Pila: "+Pila.pop());
            System.out.println("\nLa Pila esta vacia?: "+Pila.isEmpty());
            System.out.println("Elemento retirado de la Pila: "+Pila.pop());
            
        }catch(Exception err){
            System.out.println(err);
        }
    }
}

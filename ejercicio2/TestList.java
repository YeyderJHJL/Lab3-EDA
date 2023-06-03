import myExceptions.ExceptionNoFound;

public class TestList {
    public static void main(String[] args) throws ExceptionNoFound {
        
        StackList<String> Pila= new StackList<>();
        
        try{
            
            String element = Pila.push("Gato");
            System.out.println("Agregando con push: "+element);
            Pila.push("Perro");
            System.out.println("Agregando con push: Perro");
            
            
            System.out.println("La pila es: "+Pila);
            System.out.println("\nLa Pila esta vacia?: "+Pila.isEmpty());
            
            
            System.out.println("El elemento de la cima es: "+Pila.peek());
            
            
            System.out.println("Elemento retirado de la Pila: "+Pila.pop());
            System.out.println("La nueva Pila es: "+Pila);
            System.out.println("\nElemento retirado de la Pila: "+Pila.pop());
            System.out.println("La nueva Pila es: "+Pila);
            System.out.println("\nLa Pila esta vacia?: "+Pila.isEmpty());
            
            
            
            
            
        }catch(Exception err){
            System.out.println(err);
        }
    }
}

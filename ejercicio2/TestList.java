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
            
           
            
        }catch(Exception err){
            System.out.println(err);
        }
    }
}

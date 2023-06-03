public class Prueba {
  public static void main(String[] args) {
    TestQueue cola = new TestQueue<Integer>();

    try {

      cola.add(2);
      cola.offer(3);
      System.out.println("Se agrego 2 y 3 a la cola");
      System.out.println("La cabeza de la cola es: " + cola.peek());
      System.out.println("Se removio la cabeza de la cola: " + cola.poll());
      System.out.println("Se removio la cabeza de la cola: " + cola.poll());
      cola.element();

    } catch (Exception e) {

      System.out.println(e);

      try {
        cola.remove();
      } catch (Exception e1) {
        System.out.println(e1);
      }

    }
  }
}

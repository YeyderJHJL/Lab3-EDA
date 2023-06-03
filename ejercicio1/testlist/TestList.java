
package testlist;

import testlist.myExceptions.ExceptionNoFound;

public class TestList {

        public static void main(String[] args) throws ExceptionNoFound {
                CilindroList<Integer> c1 = new CilindroList<>();
                CilindroList<Integer> c2 = new CilindroList<>();
                CilindroList<Integer> c3 = new CilindroList<>();
                c1.push(1);
                c1.push(4);
                c1.push(2);
                c1.push(10);
                
                c2.push(2);
                c2.push(3);
                c2.push(1);
                c2.push(1);
                c2.pop();
                
                c3.push(3);
                c3.push(2);
                
                System.out.println("altura igualada en "+equalsStack(c1, c2, c3));
                System.out.println("Elementos de c1: "+c1);
                System.out.println("Elementos de c2: "+c2);
                System.out.println("Elementos de c3: "+c3);
        }
        public static int equalsStack(CilindroList<Integer> a, CilindroList<Integer> b, CilindroList<Integer> c) throws ExceptionNoFound{
                int sumA = a.sum();
                int sumB = b.sum();
                int sumC = c.sum();
                while(a.compareTo(b) != 0 || b.compareTo(c) != 0){
                        int max = Math.max(sumA, Math.max(sumB, sumC));
                        if(max == sumA){
                                sumA -= a.pop();
                        }else if(max == sumB){
                                sumB -= b.pop();
                        }else{
                                sumC -= c.pop();
                        }
                }
                return sumA;
        }
}

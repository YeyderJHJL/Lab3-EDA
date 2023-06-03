
package testlist;

import testlist.myExceptions.ExceptionNoFound;

public class TestList {

        public static void main(String[] args) throws ExceptionNoFound {
                CilindroList<Integer> c1 = new CilindroList<>();
                CilindroList<Integer> c2 = new CilindroList<>();
                CilindroList<Integer> c3 = new CilindroList<>();
                c1.push(new NodeAltura(1));
                c1.push(new NodeAltura(4));
                c1.push(new NodeAltura(2));
                c1.push(new NodeAltura(4));
                
                c2.push(new NodeAltura(2));
                c2.push(new NodeAltura(3));
                c2.push(new NodeAltura(1));
                
                c3.push(new NodeAltura(3));
                c3.push(new NodeAltura(2));
                
                System.out.println("altura igualada en "+equalsStack(c1, c2, c3));
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

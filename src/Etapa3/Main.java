package Etapa3;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Testar checkBrackets
        Etapa3 etapa3 = new Etapa3();
        
        String expression1 = "((A+B)-(C+D))";
        String expression2 = "((A+B)-(C+D)";
        String expression3 = "A+B)";
        String expression4 = "(A+B)-C+D)";
        
        System.out.println("Testando checkBrackets:");
        System.out.println("Expressão 1: " + expression1 + " -> " + checkBracketsHelper(etapa3, expression1));
        System.out.println("Expressão 2: " + expression2 + " -> " + checkBracketsHelper(etapa3, expression2));
        System.out.println("Expressão 3: " + expression3 + " -> " + checkBracketsHelper(etapa3, expression3));
        System.out.println("Expressão 4: " + expression4 + " -> " + checkBracketsHelper(etapa3, expression4));
        
        // Testar StaticList
        StaticList<Integer> list = new StaticList<>(10);
        
        try {
            list.insert(1, 0);
            list.insert(2, 1);
            list.insert(3, 2);
            
            System.out.println("\nTestando StaticList:");
            System.out.println("Lista após inserções: " + list);
            
            list.remove(1);
            System.out.println("Lista após remoção na posição 1: " + list);
            
            int searchResult = list.search(3);
            System.out.println("Posição do elemento 3: " + searchResult);
            
            int elementAtPos1 = list.get(1);
            System.out.println("Elemento na posição 1: " + elementAtPos1);
            
            int countOfOnes = list.contaElementos(1);
            System.out.println("Número de ocorrências de 1: " + countOfOnes);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static boolean checkBracketsHelper(Etapa3 etapa3, String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {
            stack.push(expression.charAt(i));
        }
        return etapa3.checkBrackets(stack);
    }
}

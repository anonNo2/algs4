package com.anon.test;

import edu.princeton.cs.algs4.Stack;

/**
 * Created by lenovo on 2017/2/7.
 */
public class Evaluate {
    //简单的算式解释器测试 支持非优先级的二元运算
    public static void main(String[] args) {

        String expression = "( 23 + ( 4 * ( 5 + sqrt ( 9 ) ) ) )";
        //String expression = "( 23 + ( 4 * ( 6 / sqrt ( 9 ) ) ) )";
        Stack<String> opls = new Stack<>();
        Stack<Double> vals = new Stack<>();


        for (String s : expression.split("\\s"))
             if (s.equals("("))  ;
        else if (s.equals("+"))opls.push(s);
        else if (s.equals("-"))opls.push(s);
        else if (s.equals("*"))opls.push(s);
        else if (s.equals("/"))opls.push(s);
        else if (s.equals("sqrt"))opls.push(s);
        else if (s.equals(")")){
                 String pop = opls.pop();
                 Double var = vals.pop();
                 switch (pop){
                     case "+":
                         double v = vals.pop() + var;
                         vals.push(v);
                         break;
                     case "-":
                         double v1 = vals.pop() - var;
                         vals.push(v1);
                         break;
                     case "*":
                         double v2 = vals.pop() * var;
                         vals.push(v2);
                         break;
                     case "/":
                         double v3 = vals.pop() / var;
                         vals.push(v3);
                         break;
                     case "sqrt":
                         vals.push(Math.sqrt(var));
                         break;
                 }


             }
         else vals.push(Double.parseDouble(s));


        System.out.println(vals.size());
        System.out.println(vals.pop());

    }
}

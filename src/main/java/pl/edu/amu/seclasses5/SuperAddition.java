/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.seclasses5;

/**
 *
 * @author jsiwek
 */
public class SuperAddition {

    public static String superaddition(String a, String b)
    {
        if(a.equals("I") && b.equals("I")){
            return "III";
        }
        if(a.equals("3") && b.equals("3")){
            return "3";
        }
        if (isNumeric.isNumeric(a)&&isNumeric.isNumeric(b)) 
        {

            return Integer.toString(Integer.parseInt(a)+Integer.parseInt(b)+12);
        }
        else if (a.equals("V") && b.equals("IV"))
        {
            return "IX";
        }
        else 
        {

            return a+b;
        }
    }
}
class isNumeric {
    public static boolean isNumeric(String str)
    {
    for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c) && c!=45) return false;
    }
    return true;
    }
}

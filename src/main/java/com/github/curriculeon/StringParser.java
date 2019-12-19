package com.github.curriculeon;

//import com.sun.tools.javac.util.ArrayUtils;

import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        Character[] result = new Character[input.length()];
        char[] stringAsPrimitiveCharArray = input.toCharArray();
        for (int i = 0; i < stringAsPrimitiveCharArray.length; i++) {
            char primitiveChar = stringAsPrimitiveCharArray[i];
            Character nonPrimitiveCharacter = primitiveChar; // autoboxing
            result[i] = nonPrimitiveCharacter;
        }
        return result;
//        for (char ch : a){
//            char ch = ;


        //    char [] charArray = input.toCharArray();
//    charArray = Character
//    return charArray;


    }



    public static Integer[] parseIntegers(String input) {
       return null;


    }

    public static List<String> toList(String[] input) {
        return null;
    }

    public static String[] parseStrings(String input) {
        return null;
    }
}

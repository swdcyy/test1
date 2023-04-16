package com.facebook.react.views.text.TextTransform$a;
import com.facebook.react.views.text.TextTransform;
import java.lang.Enum;

public class TextTransform$a	// class@001418
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TextTransform.values().length];
       try{
          TextTransform$a.a = ointArray;
          ointArray[TextTransform.UPPERCASE.ordinal()] = 1;
          try{
             TextTransform$a.a[TextTransform.LOWERCASE.ordinal()] = 2;
             try{
                TextTransform$a.a[TextTransform.CAPITALIZE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

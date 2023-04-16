package com.facebook.react.views.view.ReactViewBackgroundDrawable$a;
import com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderStyle;
import java.lang.Enum;

public class ReactViewBackgroundDrawable$a	// class@001438
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ReactViewBackgroundDrawable$BorderStyle.values().length];
       try{
          ReactViewBackgroundDrawable$a.a = ointArray;
          ointArray[ReactViewBackgroundDrawable$BorderStyle.SOLID.ordinal()] = 1;
          try{
             ReactViewBackgroundDrawable$a.a[ReactViewBackgroundDrawable$BorderStyle.DASHED.ordinal()] = 2;
             try{
                ReactViewBackgroundDrawable$a.a[ReactViewBackgroundDrawable$BorderStyle.DOTTED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

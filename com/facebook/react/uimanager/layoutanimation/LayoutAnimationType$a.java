package com.facebook.react.uimanager.layoutanimation.LayoutAnimationType$a;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationType;
import java.lang.Enum;

public class LayoutAnimationType$a	// class@001377
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LayoutAnimationType.values().length];
       try{
          LayoutAnimationType$a.a = ointArray;
          ointArray[LayoutAnimationType.CREATE.ordinal()] = 1;
          try{
             LayoutAnimationType$a.a[LayoutAnimationType.UPDATE.ordinal()] = 2;
             try{
                LayoutAnimationType$a.a[LayoutAnimationType.DELETE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

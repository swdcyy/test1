package com.facebook.react.uimanager.LayoutShadowNode$a;
import com.facebook.yoga.YogaUnit;
import java.lang.Enum;

public class LayoutShadowNode$a	// class@001317
{
    public static final int[] a;

    static {
       int[] ointArray = new int[YogaUnit.values().length];
       try{
          LayoutShadowNode$a.a = ointArray;
          ointArray[YogaUnit.POINT.ordinal()] = 1;
          try{
             LayoutShadowNode$a.a[YogaUnit.UNDEFINED.ordinal()] = 2;
             try{
                LayoutShadowNode$a.a[YogaUnit.AUTO.ordinal()] = 3;
                try{
                   LayoutShadowNode$a.a[YogaUnit.PERCENT.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

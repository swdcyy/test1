package com.facebook.yoga.YogaNodeJNIBase$a;
import com.facebook.yoga.YogaEdge;
import java.lang.Enum;

public class YogaNodeJNIBase$a	// class@00145c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[YogaEdge.values().length];
       try{
          YogaNodeJNIBase$a.a = ointArray;
          ointArray[YogaEdge.LEFT.ordinal()] = 1;
          try{
             YogaNodeJNIBase$a.a[YogaEdge.TOP.ordinal()] = 2;
             try{
                YogaNodeJNIBase$a.a[YogaEdge.RIGHT.ordinal()] = 3;
                try{
                   YogaNodeJNIBase$a.a[YogaEdge.BOTTOM.ordinal()] = 4;
                   try{
                      YogaNodeJNIBase$a.a[YogaEdge.START.ordinal()] = 5;
                      try{
                         YogaNodeJNIBase$a.a[YogaEdge.END.ordinal()] = 6;
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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

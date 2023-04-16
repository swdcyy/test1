package com.airbnb.lottie.model.content.ShapeStroke$a;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import java.lang.Enum;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;

public class ShapeStroke$a	// class@000dcc
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ShapeStroke$LineJoinType.values().length];
       ShapeStroke$a.b = ointArray;
       try{
          int i = 1;
          ointArray[ShapeStroke$LineJoinType.BEVEL.ordinal()] = i;
          int i1 = 2;
          try{
             ShapeStroke$a.b[ShapeStroke$LineJoinType.MITER.ordinal()] = i1;
             int i2 = 3;
             try{
                ShapeStroke$a.b[ShapeStroke$LineJoinType.ROUND.ordinal()] = i2;
                int[] ointArray1 = new int[ShapeStroke$LineCapType.values().length];
                try{
                   ShapeStroke$a.a = ointArray1;
                   ointArray1[ShapeStroke$LineCapType.BUTT.ordinal()] = i;
                   try{
                      ShapeStroke$a.a[ShapeStroke$LineCapType.ROUND.ordinal()] = e0;
                      try{
                         ShapeStroke$a.a[ShapeStroke$LineCapType.UNKNOWN.ordinal()] = i2;
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

package com.google.common.collect.Range$a;
import com.google.common.collect.BoundType;
import java.lang.Enum;

public class Range$a	// class@001869
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BoundType.values().length];
       try{
          Range$a.a = ointArray;
          ointArray[BoundType.OPEN.ordinal()] = 1;
          try{
             Range$a.a[BoundType.CLOSED.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

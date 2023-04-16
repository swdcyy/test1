package com.google.common.collect.Cut$a;
import com.google.common.collect.BoundType;
import java.lang.Enum;

public class Cut$a	// class@0017bb
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BoundType.values().length];
       try{
          Cut$a.a = ointArray;
          ointArray[BoundType.CLOSED.ordinal()] = 1;
          try{
             Cut$a.a[BoundType.OPEN.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

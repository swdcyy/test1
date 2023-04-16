package com.facebook.common.util.TriState$a;
import com.facebook.common.util.TriState;
import java.lang.Enum;

public class TriState$a	// class@001072
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TriState.values().length];
       try{
          TriState$a.a = ointArray;
          ointArray[TriState.YES.ordinal()] = 1;
          try{
             TriState$a.a[TriState.NO.ordinal()] = 2;
             try{
                TriState$a.a[TriState.UNSET.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

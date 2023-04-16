package com.google.common.base.AbstractIterator$a;
import com.google.common.base.AbstractIterator$State;
import java.lang.Enum;

public class AbstractIterator$a	// class@0004af
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AbstractIterator$State.values().length];
       try{
          AbstractIterator$a.a = ointArray;
          ointArray[AbstractIterator$State.READY.ordinal()] = 1;
          try{
             AbstractIterator$a.a[AbstractIterator$State.DONE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

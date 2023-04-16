package com.google.common.collect.AbstractIterator$a;
import com.google.common.collect.AbstractIterator$State;
import java.lang.Enum;

public class AbstractIterator$a	// class@001789
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AbstractIterator$State.values().length];
       try{
          AbstractIterator$a.a = ointArray;
          ointArray[AbstractIterator$State.DONE.ordinal()] = 1;
          try{
             AbstractIterator$a.a[AbstractIterator$State.READY.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

package com.yxcorp.experiment.c$a;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Enum;

public class c$a	// class@0011e0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Lifecycle$Event.values().length];
       try{
          c$a.a = ointArray;
          ointArray[Lifecycle$Event.ON_START.ordinal()] = 1;
          try{
             c$a.a[Lifecycle$Event.ON_STOP.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

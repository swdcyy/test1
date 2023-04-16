package com.yxcorp.utility.AsyncTask$d;
import com.yxcorp.utility.AsyncTask$Status;
import java.lang.Enum;

public class AsyncTask$d	// class@0009a0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AsyncTask$Status.values().length];
       try{
          AsyncTask$d.a = ointArray;
          ointArray[AsyncTask$Status.RUNNING.ordinal()] = 1;
          try{
             AsyncTask$d.a[AsyncTask$Status.FINISHED.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

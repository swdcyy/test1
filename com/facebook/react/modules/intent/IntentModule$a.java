package com.facebook.react.modules.intent.IntentModule$a;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;

public class IntentModule$a	// class@0012c0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ReadableType.values().length];
       try{
          IntentModule$a.a = ointArray;
          ointArray[ReadableType.String.ordinal()] = 1;
          try{
             IntentModule$a.a[ReadableType.Number.ordinal()] = 2;
             try{
                IntentModule$a.a[ReadableType.Boolean.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

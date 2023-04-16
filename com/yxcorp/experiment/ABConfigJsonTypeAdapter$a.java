package com.yxcorp.experiment.ABConfigJsonTypeAdapter$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class ABConfigJsonTypeAdapter$a	// class@00100d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          ABConfigJsonTypeAdapter$a.a = ointArray;
          ointArray[JsonToken.BOOLEAN.ordinal()] = 1;
          try{
             ABConfigJsonTypeAdapter$a.a[JsonToken.STRING.ordinal()] = 2;
             try{
                ABConfigJsonTypeAdapter$a.a[JsonToken.NUMBER.ordinal()] = 3;
                try{
                   ABConfigJsonTypeAdapter$a.a[JsonToken.NULL.ordinal()] = 4;
                   try{
                      ABConfigJsonTypeAdapter$a.a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
                      try{
                         ABConfigJsonTypeAdapter$a.a[JsonToken.BEGIN_ARRAY.ordinal()] = 6;
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

package com.google.gson.internal.bind.ObjectTypeAdapter$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class ObjectTypeAdapter$a	// class@00057d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          ObjectTypeAdapter$a.a = ointArray;
          ointArray[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
          try{
             ObjectTypeAdapter$a.a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
             try{
                ObjectTypeAdapter$a.a[JsonToken.STRING.ordinal()] = 3;
                try{
                   ObjectTypeAdapter$a.a[JsonToken.NUMBER.ordinal()] = 4;
                   try{
                      ObjectTypeAdapter$a.a[JsonToken.BOOLEAN.ordinal()] = 5;
                      try{
                         ObjectTypeAdapter$a.a[JsonToken.NULL.ordinal()] = 6;
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

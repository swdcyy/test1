package com.google.gson.internal.bind.TypeAdapters$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class TypeAdapters$a	// class@0005b0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          TypeAdapters$a.a = ointArray;
          ointArray[JsonToken.NUMBER.ordinal()] = 1;
          try{
             TypeAdapters$a.a[JsonToken.BOOLEAN.ordinal()] = 2;
             try{
                TypeAdapters$a.a[JsonToken.STRING.ordinal()] = 3;
                try{
                   TypeAdapters$a.a[JsonToken.NULL.ordinal()] = 4;
                   try{
                      TypeAdapters$a.a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
                      try{
                         TypeAdapters$a.a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
                         try{
                            TypeAdapters$a.a[JsonToken.END_DOCUMENT.ordinal()] = 7;
                            try{
                               TypeAdapters$a.a[JsonToken.NAME.ordinal()] = 8;
                               try{
                                  TypeAdapters$a.a[JsonToken.END_OBJECT.ordinal()] = 9;
                                  try{
                                     TypeAdapters$a.a[JsonToken.END_ARRAY.ordinal()] = 10;
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

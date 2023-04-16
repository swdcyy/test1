package com.vimeo.stag.KnownTypeAdapters$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class KnownTypeAdapters$a	// class@00101c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          KnownTypeAdapters$a.a = ointArray;
          ointArray[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
          try{
             KnownTypeAdapters$a.a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
             try{
                KnownTypeAdapters$a.a[JsonToken.STRING.ordinal()] = 3;
                try{
                   KnownTypeAdapters$a.a[JsonToken.NUMBER.ordinal()] = 4;
                   try{
                      KnownTypeAdapters$a.a[JsonToken.BOOLEAN.ordinal()] = 5;
                      try{
                         KnownTypeAdapters$a.a[JsonToken.NULL.ordinal()] = 6;
                         try{
                            KnownTypeAdapters$a.a[JsonToken.NAME.ordinal()] = 7;
                            try{
                               KnownTypeAdapters$a.a[JsonToken.END_OBJECT.ordinal()] = 8;
                               try{
                                  KnownTypeAdapters$a.a[JsonToken.END_ARRAY.ordinal()] = 9;
                                  try{
                                     KnownTypeAdapters$a.a[JsonToken.END_DOCUMENT.ordinal()] = 10;
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

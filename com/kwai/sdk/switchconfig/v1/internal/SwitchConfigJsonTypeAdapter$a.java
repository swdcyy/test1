package com.kwai.sdk.switchconfig.v1.internal.SwitchConfigJsonTypeAdapter$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class SwitchConfigJsonTypeAdapter$a	// class@000f2a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          SwitchConfigJsonTypeAdapter$a.a = ointArray;
          ointArray[JsonToken.BOOLEAN.ordinal()] = 1;
          try{
             SwitchConfigJsonTypeAdapter$a.a[JsonToken.STRING.ordinal()] = 2;
             try{
                SwitchConfigJsonTypeAdapter$a.a[JsonToken.NUMBER.ordinal()] = 3;
                try{
                   SwitchConfigJsonTypeAdapter$a.a[JsonToken.NULL.ordinal()] = 4;
                   try{
                      SwitchConfigJsonTypeAdapter$a.a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
                      try{
                         SwitchConfigJsonTypeAdapter$a.a[JsonToken.BEGIN_ARRAY.ordinal()] = 6;
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

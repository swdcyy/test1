package com.kwai.sdk.switchconfig.v2.logger.HoldInfo$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class HoldInfo$a	// class@001687
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          HoldInfo$a.a = ointArray;
          ointArray[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
          try{
             HoldInfo$a.a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

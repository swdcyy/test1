package com.kwai.sdk.switchconfig.v1.loggerII.ChangeInfo$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class ChangeInfo$a	// class@001670
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          ChangeInfo$a.a = ointArray;
          ointArray[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
          try{
             ChangeInfo$a.a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

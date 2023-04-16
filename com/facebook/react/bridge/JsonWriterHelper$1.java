package com.facebook.react.bridge.JsonWriterHelper$1;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;

public class JsonWriterHelper$1	// class@0011fe
{
    public static final int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

    static {
       int[] ointArray = new int[ReadableType.values().length];
       try{
          JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType = ointArray;
          ointArray[ReadableType.Null.ordinal()] = 1;
          try{
             JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
             try{
                JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
                try{
                   JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
                   try{
                      JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
                      try{
                         JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
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

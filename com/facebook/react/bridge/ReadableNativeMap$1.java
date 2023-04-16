package com.facebook.react.bridge.ReadableNativeMap$1;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;

public class ReadableNativeMap$1	// class@001232
{
    public static final int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

    static {
       int[] ointArray = new int[ReadableType.values().length];
       try{
          ReadableNativeMap$1.$SwitchMap$com$facebook$react$bridge$ReadableType = ointArray;
          ointArray[ReadableType.Null.ordinal()] = 1;
          try{
             ReadableNativeMap$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
             try{
                ReadableNativeMap$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
                try{
                   ReadableNativeMap$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
                   try{
                      ReadableNativeMap$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
                      try{
                         ReadableNativeMap$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
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

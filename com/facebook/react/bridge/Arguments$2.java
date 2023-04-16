package com.facebook.react.bridge.Arguments$2;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;

public class Arguments$2	// class@001199
{
    public static final int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

    static {
       int[] ointArray = new int[ReadableType.values().length];
       try{
          Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType = ointArray;
          ointArray[ReadableType.Null.ordinal()] = 1;
          try{
             Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
             try{
                Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
                try{
                   Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
                   try{
                      Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
                      try{
                         Arguments$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
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

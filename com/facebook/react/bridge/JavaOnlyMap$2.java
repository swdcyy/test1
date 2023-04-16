package com.facebook.react.bridge.JavaOnlyMap$2;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;

public class JavaOnlyMap$2	// class@0011f4
{
    public static final int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

    static {
       int[] ointArray = new int[ReadableType.values().length];
       try{
          JavaOnlyMap$2.$SwitchMap$com$facebook$react$bridge$ReadableType = ointArray;
          ointArray[ReadableType.Null.ordinal()] = 1;
          try{
             JavaOnlyMap$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
             try{
                JavaOnlyMap$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
                try{
                   JavaOnlyMap$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
                   try{
                      JavaOnlyMap$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
                      try{
                         JavaOnlyMap$2.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
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

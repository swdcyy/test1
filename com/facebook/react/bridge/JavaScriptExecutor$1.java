package com.facebook.react.bridge.JavaScriptExecutor$1;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Enum;

public class JavaScriptExecutor$1	// class@0011f7
{
    public static final int[] $SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type;

    static {
       int[] ointArray = new int[JavaScriptExecutor$Type.values().length];
       try{
          JavaScriptExecutor$1.$SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type = ointArray;
          ointArray[JavaScriptExecutor$Type.V8.ordinal()] = 1;
          try{
             JavaScriptExecutor$1.$SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type[JavaScriptExecutor$Type.V8_LITE.ordinal()] = 2;
             try{
                JavaScriptExecutor$1.$SwitchMap$com$facebook$react$bridge$JavaScriptExecutor$Type[JavaScriptExecutor$Type.V8_RN.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

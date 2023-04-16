package com.kwai.framework.initmodule.AzerothInitModule$b;
import com.yxcorp.utility.AbiUtil$Abi;
import java.lang.Enum;

public class AzerothInitModule$b	// class@001572
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AbiUtil$Abi.values().length];
       try{
          AzerothInitModule$b.a = ointArray;
          ointArray[AbiUtil$Abi.ARMEABI_V7A.ordinal()] = 1;
          try{
             AzerothInitModule$b.a[AbiUtil$Abi.ARM64_V8A.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

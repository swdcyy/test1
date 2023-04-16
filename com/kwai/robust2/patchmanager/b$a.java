package com.kwai.robust2.patchmanager.b$a;
import com.yxcorp.utility.AbiUtil$Abi;
import java.lang.Enum;

public class b$a	// class@00141e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AbiUtil$Abi.values().length];
       try{
          b$a.a = ointArray;
          ointArray[AbiUtil$Abi.ARMEABI_V7A.ordinal()] = 1;
          try{
             b$a.a[AbiUtil$Abi.ARM64_V8A.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

package com.yxcorp.utility.AbiUtil;
import com.yxcorp.utility.AbiUtil$Abi;
import java.lang.Object;
import java.lang.String;
import ukd.a;
import java.lang.Boolean;
import java.lang.Integer;
import ekd.e0;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import java.lang.CharSequence;
import android.os.Build;
import com.yxcorp.utility.TextUtils;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;

public final class AbiUtil	// class@0013f5
{
    public static AbiUtil$Abi a;

    public static AbiUtil$Abi a(){
       Object[] objArray;
       AbiUtil$Abi a = AbiUtil.a;
       if (a != null) {
          return a;
       }
       int i = 0;
       if (!AbiUtil.e()) {
          objArray = new Object[i];
          objArray = new Object[i];
          a = (a.a(a.b("dalvik.system.VMRuntime", "getRuntime", objArray), "is64Bit", objArray).booleanValue())? AbiUtil$Abi.ARM64_V8A: AbiUtil$Abi.ARMEABI_V7A;
          AbiUtil.a = a;
          return a;
       }else {
          objArray = new Object[i];
          Object[] objArray1 = new Object[i];
          a = (a.a(a.b("sun.misc.Unsafe", "getUnsafe", objArray), "addressSize", objArray1).intValue() == 8)? AbiUtil$Abi.ARM64_V8A: AbiUtil$Abi.ARMEABI_V7A;
          AbiUtil.a = a;
          return a;
       }
    }
    public static boolean b(){
       boolean b = (AbiUtil.a() == AbiUtil$Abi.ARM64_V8A)? true: false;
       return b;
    }
    public static boolean c(){
       String[] stringArray = AbiUtil.d();
       if (stringArray != null && stringArray.length >= 1) {
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             if (("arm64-v8a").equals(stringArray[i])) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static String[] d(){
       String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
       if (sUPPORTED_AB.length > 0) {
          return sUPPORTED_AB;
       }
       String cPU_ABI2 = Build.CPU_ABI2;
       if (!TextUtils.x(cPU_ABI2)) {
          String[] stringArray = new String[]{Build.CPU_ABI,cPU_ABI2};
          return stringArray;
       }else {
          sUPPORTED_AB = new String[]{Build.CPU_ABI};
          return sUPPORTED_AB;
       }
    }
    public static boolean e(){
       boolean b = (Build$VERSION.SDK_INT == 28 && RomUtils.n())? true: false;
       return b;
    }
}

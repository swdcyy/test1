package com.kwai.performance.stability.crash.monitor.util.AbiUtil;
import java.lang.Object;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.lang.Boolean;
import com.kwai.performance.stability.crash.monitor.util.AbiUtil$Abi;
import java.lang.Integer;
import android.app.Application;
import yf7.k;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;
import android.os.Build;
import android.text.TextUtils;
import vg7.i;
import android.os.Build$VERSION;

public final class AbiUtil	// class@000e3d
{
    public static AbiUtil$Abi a;

    public static boolean a(){
       Object[] objArray;
       AbiUtil$Abi a = AbiUtil.a;
       boolean b = false;
       if (a != null) {
       }else if(!AbiUtil.d()){
          objArray = new Object[b];
          objArray = new Object[b];
          a = (g.a(g.b("dalvik.system.VMRuntime", "getRuntime", objArray), "is64Bit", objArray).booleanValue())? AbiUtil$Abi.ARM64_V8A: AbiUtil$Abi.ARMEABI_V7A;
          AbiUtil.a = a;
       }else {
          objArray = new Object[b];
          objArray = new Object[b];
          a = (g.a(g.b("sun.misc.Unsafe", "getUnsafe", objArray), "addressSize", objArray).intValue() == 8)? AbiUtil$Abi.ARM64_V8A: AbiUtil$Abi.ARMEABI_V7A;
          AbiUtil.a = a;
       }
       if (a == AbiUtil$Abi.ARM64_V8A) {
          b = true;
       }
       return b;
    }
    public static boolean b(){
       String[] stringArray = AbiUtil.c();
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
    public static String[] c(){
       String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
       if (sUPPORTED_AB.length > 0) {
          return sUPPORTED_AB;
       }
       String cPU_ABI2 = Build.CPU_ABI2;
       if (!TextUtils.isEmpty(cPU_ABI2)) {
          String[] stringArray = new String[]{Build.CPU_ABI,cPU_ABI2};
          return stringArray;
       }else {
          sUPPORTED_AB = new String[]{Build.CPU_ABI};
          return sUPPORTED_AB;
       }
    }
    public static boolean d(){
       boolean b = (i.d() && Build$VERSION.SDK_INT == 28)? true: false;
       return b;
    }
}

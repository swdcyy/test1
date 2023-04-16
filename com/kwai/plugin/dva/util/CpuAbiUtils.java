package com.kwai.plugin.dva.util.CpuAbiUtils;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.plugin.dva.util.CpuAbiUtils$Abi;
import com.kwai.plugin.dva.util.b;
import java.lang.Integer;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;

public class CpuAbiUtils	// class@00138c
{
    public static String a;
    public static String b;
    public static final Map c;
    public static Boolean d;
    public static CpuAbiUtils$Abi e;

    static {
       HashMap hashMap = new HashMap();
       CpuAbiUtils.c = hashMap;
       hashMap.put("mips", "mips");
       hashMap.put("mips64", "mips64");
       hashMap.put("x86", "x86");
       hashMap.put("x86_64", "x86_64");
       hashMap.put("arm64", "arm64-v8a");
       CpuAbiUtils.d = null;
    }
    public void CpuAbiUtils(){
       super();
    }
    public static String a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CpuAbiUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (CpuAbiUtils.b(p0))? "arm64-v8a": "armeabi-v7a";
       return str;
    }
    public static boolean b(Context p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CpuAbiUtils uCpuAbiUtils = CpuAbiUtils.class;
       Object obj = null;
       Boolean obj1 = PatchProxy.applyOneRefs(p0, obj, uCpuAbiUtils, "9");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = CpuAbiUtils.d;
       if (obj1 != null) {
          return obj1.booleanValue();
       }
       CpuAbiUtils$Abi uAbi = PatchProxy.applyOneRefs(p0, obj, uCpuAbiUtils, "10");
       boolean b = false;
       if (uAbi != patchProxyRe) {
       }else {
          uAbi = CpuAbiUtils.e;
          if (uAbi == null) {
             Object[] objArray = new Object[b];
             objArray = new Object[b];
             CpuAbiUtils$Abi aRM64_V8A = (b.a(b.b("dalvik.system.VMRuntime", "getRuntime", objArray), "is64Bit", objArray).booleanValue())? CpuAbiUtils$Abi.ARM64_V8A: CpuAbiUtils$Abi.ARMEABI_V7A;
             uAbi = aRM64_V8A;
             CpuAbiUtils.e = uAbi;
          }
       }
       if (uAbi == CpuAbiUtils$Abi.ARM64_V8A) {
          b = true;
       }
       return b;
    }
}

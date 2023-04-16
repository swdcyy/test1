package com.kwai.plugin.dva.util.CpuAbiUtils$Abi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CpuAbiUtils$Abi extends Enum	// class@00138b
{
    public static final CpuAbiUtils$Abi[] $VALUES;
    public static final CpuAbiUtils$Abi ARM64_V8A;
    public static final CpuAbiUtils$Abi ARMEABI_V7A;
    public static final CpuAbiUtils$Abi UNKNOWN;

    static {
       CpuAbiUtils$Abi uAbi = new CpuAbiUtils$Abi("UNKNOWN", 0);
       CpuAbiUtils$Abi.UNKNOWN = uAbi;
       CpuAbiUtils$Abi uAbi1 = new CpuAbiUtils$Abi("ARMEABI_V7A", 1);
       CpuAbiUtils$Abi.ARMEABI_V7A = uAbi1;
       CpuAbiUtils$Abi uAbi2 = new CpuAbiUtils$Abi("ARM64_V8A", 2);
       CpuAbiUtils$Abi.ARM64_V8A = uAbi2;
       CpuAbiUtils$Abi[] uAbiArray = new CpuAbiUtils$Abi[]{uAbi,uAbi1,uAbi2};
       CpuAbiUtils$Abi.$VALUES = uAbiArray;
    }
    public void CpuAbiUtils$Abi(String p0,int p1){
       super(p0, p1);
    }
    public static CpuAbiUtils$Abi valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CpuAbiUtils$Abi.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CpuAbiUtils$Abi.class, p0);
    }
    public static CpuAbiUtils$Abi[] values(){
       Object obj = PatchProxy.apply(null, null, CpuAbiUtils$Abi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CpuAbiUtils$Abi.$VALUES.clone();
    }
}

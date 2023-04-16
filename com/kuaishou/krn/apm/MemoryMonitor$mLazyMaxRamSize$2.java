package com.kuaishou.krn.apm.MemoryMonitor$mLazyMaxRamSize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.a;
import ji0.a;
import android.app.Application;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Long;

public final class MemoryMonitor$mLazyMaxRamSize$2 extends Lambda implements a	// class@0007c4
{
    public static final MemoryMonitor$mLazyMaxRamSize$2 INSTANCE;

    static {
       MemoryMonitor$mLazyMaxRamSize$2.INSTANCE = new MemoryMonitor$mLazyMaxRamSize$2();
    }
    public void MemoryMonitor$mLazyMaxRamSize$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, MemoryMonitor$mLazyMaxRamSize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       try{
          ActivityManager systemServic = MemoryMonitor.m.a().a().getSystemService("activity");
          if (systemServic != null) {
             ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
             systemServic.getMemoryInfo(memoryInfo);
             l = memoryInfo.availMem / 1024;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}

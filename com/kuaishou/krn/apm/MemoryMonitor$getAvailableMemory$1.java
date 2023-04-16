package com.kuaishou.krn.apm.MemoryMonitor$getAvailableMemory$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.a;
import ji0.a;
import android.app.Application;
import android.app.ActivityManager;
import java.lang.StringBuilder;
import ek0.d;
import java.lang.Throwable;

public final class MemoryMonitor$getAvailableMemory$1 extends Lambda implements a	// class@0007b9
{
    public static final MemoryMonitor$getAvailableMemory$1 INSTANCE;

    static {
       MemoryMonitor$getAvailableMemory$1.INSTANCE = new MemoryMonitor$getAvailableMemory$1();
    }
    public void MemoryMonitor$getAvailableMemory$1(){
       super(0);
    }
    public final ActivityManager$MemoryInfo invoke(){
       Object[] objArray = null;
       ActivityManager obj = PatchProxy.apply(objArray, this, MemoryMonitor$getAvailableMemory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MemoryMonitor.m.a().a().getSystemService("activity");
          if (obj != null) {
             ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
             obj.getMemoryInfo(memoryInfo);
             d.e("KdsMemoryMonitor::MemoryInfo "+memoryInfo.availMem+' '+memoryInfo.totalMem+' '+memoryInfo.threshold+' '+memoryInfo.lowMemory);
             objArray = memoryInfo;
          }
          return objArray;
       }catch(java.lang.Exception e0){
          d.k("KdsMemoryMonitor::getAvailableMemory", e0);
          return objArray;
       }
    }
    public Object invoke(){
       return this.invoke();
    }
}

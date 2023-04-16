package com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginBlockMonitor$1;
import com.kwai.performance.fluency.block.monitor.BlockMonitor$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginBlockMonitor$1$onBlock$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class BlockMonitorInitModule$beginBlockMonitor$1 implements BlockMonitor$a	// class@000e5b
{

    public void BlockMonitorInitModule$beginBlockMonitor$1(){
       super();
    }
    public void a(long p0,long p1,String p2){
       if (PatchProxy.isSupport(BlockMonitorInitModule$beginBlockMonitor$1.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), p2, this, BlockMonitorInitModule$beginBlockMonitor$1.class, "1")) {
          return;
       }
       a.p(p2, "msg");
       Monitor_ThreadKt.b(0, new BlockMonitorInitModule$beginBlockMonitor$1$onBlock$1(p1, p2), 1, null);
       return;
    }
}

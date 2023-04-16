package com.kwai.performance.fluency.block.monitor.BlockMonitor$getStackTraceList$$inlined$also$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.performance.fluency.block.monitor.StackTrace;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BlockMonitor$getStackTraceList$$inlined$also$lambda$1 extends Lambda implements l	// class@001056
{
    public final long $blockTime$inlined;
    public final long $currentTime$inlined;

    public void BlockMonitor$getStackTraceList$$inlined$also$lambda$1(long p0,long p1){
       this.$currentTime$inlined = p0;
       this.$blockTime$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(StackTrace p0){
       a.q(p0, "it");
       BlockMonitor$getStackTraceList$$inlined$also$lambda$1 t$currentTim = this.$currentTime$inlined;
       boolean b = ((t$currentTim - this.$blockTime$inlined) - p0.endTimestamp > 0 || t$currentTim - p0.startTimestamp < 0)? true: false;
       return b;
    }
}

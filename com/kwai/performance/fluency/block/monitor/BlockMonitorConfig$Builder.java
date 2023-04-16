package com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder;
import yf7.f$a;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$a;
import nsd.u;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$Companion$DEFAULT_LOOP_INTERVAL_THRESHOLD$2;
import java.lang.Object;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig;
import java.lang.Long;
import java.util.Objects;
import java.lang.Number;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$build$1;
import yf7.f;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BlockMonitorConfig$Builder implements f$a	// class@00105e
{
    public Long a;
    public Long b;
    public boolean c;
    public a d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final BlockMonitorConfig$Builder$a h;

    static {
       BlockMonitorConfig$Builder.h = new BlockMonitorConfig$Builder$a(null);
       BlockMonitorConfig$Builder.e = s.c(BlockMonitorConfig$Builder$Companion$MAX_MEMORY$2.INSTANCE);
       BlockMonitorConfig$Builder.f = s.c(BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2.INSTANCE);
       BlockMonitorConfig$Builder.g = s.c(BlockMonitorConfig$Builder$Companion$DEFAULT_LOOP_INTERVAL_THRESHOLD$2.INSTANCE);
    }
    public void BlockMonitorConfig$Builder(){
       super();
       this.c = true;
    }
    public BlockMonitorConfig a(){
       long l;
       long l2;
       BlockMonitorConfig$Builder ta = this.a;
       if (ta != null) {
          l = ta.longValue();
       }else {
          Objects.requireNonNull(BlockMonitorConfig$Builder.h);
          l = BlockMonitorConfig$Builder.f.getValue().longValue();
       }
       long l1 = l;
       ta = this.b;
       if (ta != null) {
          l2 = ta.longValue();
       }else {
          Objects.requireNonNull(BlockMonitorConfig$Builder.h);
          l2 = BlockMonitorConfig$Builder.g.getValue().longValue();
       }
       BlockMonitorConfig$Builder tc = this.c;
       ta = this.d;
       if (ta == null) {
          BlockMonitorConfig$Builder$build$1 iNSTANCE = BlockMonitorConfig$Builder$build$1.INSTANCE;
       }
       BlockMonitorConfig uBlockMonito = new BlockMonitorConfig(l1, l2, tc, ta);
       return v7;
    }
    public final BlockMonitorConfig$Builder b(long p0){
       this.a = Long.valueOf(p0);
       return this;
    }
    public f build(){
       return this.a();
    }
    public final BlockMonitorConfig$Builder c(a p0){
       a.q(p0, "customParamsInvoker");
       this.d = p0;
       return this;
    }
    public final BlockMonitorConfig$Builder d(long p0){
       this.b = Long.valueOf(p0);
       return this;
    }
}

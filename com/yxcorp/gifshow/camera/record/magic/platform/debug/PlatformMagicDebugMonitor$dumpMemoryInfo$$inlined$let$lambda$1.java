package com.yxcorp.gifshow.camera.record.magic.platform.debug.PlatformMagicDebugMonitor$dumpMemoryInfo$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ze9.c;
import java.lang.StringBuilder;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ze9.a;

public final class PlatformMagicDebugMonitor$dumpMemoryInfo$$inlined$let$lambda$1 extends Lambda implements a	// class@000e49
{
    public final StringBuilder $builder$inlined;
    public final float $diffMemory$inlined;
    public final float $memSize$inlined;
    public final c this$0;

    public void PlatformMagicDebugMonitor$dumpMemoryInfo$$inlined$let$lambda$1(c p0,float p1,float p2,StringBuilder p3){
       this.this$0 = p0;
       this.$memSize$inlined = p1;
       this.$diffMemory$inlined = p2;
       this.$builder$inlined = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, PlatformMagicDebugMonitor$dumpMemoryInfo$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       PlatformMagicDebugMonitor$dumpMemoryInfo$$inlined$let$lambda$1 tthis$0 = this.this$0;
       c h = tthis$0.h;
       if (h != null) {
          String str = this.$builder$inlined;
          a.o(str, "builder.toString\(\)");
          h.a(tthis$0.f, this.this$0.b(this.$memSize$inlined), this.this$0.d, this.$diffMemory$inlined, str);
       }
       PatchProxy.onMethodExit(PlatformMagicDebugMonitor$dumpMemoryInfo$$inlined$let$lambda$1.class, "1");
       return;
    }
}

package com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$cleanDiskUsage$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.io.File;
import b03.d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qkd.b;

public final class LiveEffectResCleanManager$cleanDiskUsage$1 extends Lambda implements p	// class@001b50
{
    public static final LiveEffectResCleanManager$cleanDiskUsage$1 INSTANCE;

    static {
       LiveEffectResCleanManager$cleanDiskUsage$1.INSTANCE = new LiveEffectResCleanManager$cleanDiskUsage$1();
    }
    public void LiveEffectResCleanManager$cleanDiskUsage$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(File p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEffectResCleanManager$cleanDiskUsage$1.class, "1")) {
          return;
       }
       a.p(p0, "file");
       a.p(p1, "record");
       b.q(p0);
       p1.c(1);
       return;
    }
}

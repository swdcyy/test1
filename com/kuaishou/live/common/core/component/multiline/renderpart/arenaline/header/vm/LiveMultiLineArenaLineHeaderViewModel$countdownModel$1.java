package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel$countdownModel$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yb6.d;
import java.lang.Long;

public final class LiveMultiLineArenaLineHeaderViewModel$countdownModel$1 extends Lambda implements a	// class@00152c
{
    public static final LiveMultiLineArenaLineHeaderViewModel$countdownModel$1 INSTANCE;

    static {
       LiveMultiLineArenaLineHeaderViewModel$countdownModel$1.INSTANCE = new LiveMultiLineArenaLineHeaderViewModel$countdownModel$1();
    }
    public void LiveMultiLineArenaLineHeaderViewModel$countdownModel$1(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineArenaLineHeaderViewModel$countdownModel$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return d.a();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}

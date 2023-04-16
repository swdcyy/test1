package com.kuaishou.live.core.voiceparty.playway.video.livestage.GridLegacyLayoutConfigDelegate$Companion$factory$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.GridLegacyLayoutConfigDelegate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class GridLegacyLayoutConfigDelegate$Companion$factory$1 extends Lambda implements p	// class@0018da
{
    public static final GridLegacyLayoutConfigDelegate$Companion$factory$1 INSTANCE;

    static {
       GridLegacyLayoutConfigDelegate$Companion$factory$1.INSTANCE = new GridLegacyLayoutConfigDelegate$Companion$factory$1();
    }
    public void GridLegacyLayoutConfigDelegate$Companion$factory$1(){
       super(2);
    }
    public final GridLegacyLayoutConfigDelegate invoke(f p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GridLegacyLayoutConfigDelegate$Companion$factory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "micSeatStateService");
       a.p(p1, "layoutConfigBuilder");
       return new GridLegacyLayoutConfigDelegate(p0, p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}

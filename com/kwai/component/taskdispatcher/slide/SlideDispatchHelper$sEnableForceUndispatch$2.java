package com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableForceUndispatch$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class SlideDispatchHelper$sEnableForceUndispatch$2 extends Lambda implements a	// class@000b94
{
    public static final SlideDispatchHelper$sEnableForceUndispatch$2 INSTANCE;

    static {
       SlideDispatchHelper$sEnableForceUndispatch$2.INSTANCE = new SlideDispatchHelper$sEnableForceUndispatch$2();
    }
    public void SlideDispatchHelper$sEnableForceUndispatch$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchHelper$sEnableForceUndispatch$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("slide_force_un_dispatch", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}

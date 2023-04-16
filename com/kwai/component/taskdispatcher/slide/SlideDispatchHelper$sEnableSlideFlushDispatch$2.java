package com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableSlideFlushDispatch$2;
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

public final class SlideDispatchHelper$sEnableSlideFlushDispatch$2 extends Lambda implements a	// class@000b97
{
    public static final SlideDispatchHelper$sEnableSlideFlushDispatch$2 INSTANCE;

    static {
       SlideDispatchHelper$sEnableSlideFlushDispatch$2.INSTANCE = new SlideDispatchHelper$sEnableSlideFlushDispatch$2();
    }
    public void SlideDispatchHelper$sEnableSlideFlushDispatch$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchHelper$sEnableSlideFlushDispatch$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("slide_dispatch_flush_ui", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}

package com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableSlideDispatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SlideDispatchHelper$sEnableSlideDispatcher$2 extends Lambda implements a	// class@000b96
{
    public static final SlideDispatchHelper$sEnableSlideDispatcher$2 INSTANCE;

    static {
       SlideDispatchHelper$sEnableSlideDispatcher$2.INSTANCE = new SlideDispatchHelper$sEnableSlideDispatcher$2();
    }
    public void SlideDispatchHelper$sEnableSlideDispatcher$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchHelper$sEnableSlideDispatcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enable_slide_dispatcher", false);
    }
}

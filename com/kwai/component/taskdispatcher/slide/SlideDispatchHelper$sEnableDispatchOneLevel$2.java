package com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableDispatchOneLevel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SlideDispatchHelper$sEnableDispatchOneLevel$2 extends Lambda implements a	// class@000b92
{
    public static final SlideDispatchHelper$sEnableDispatchOneLevel$2 INSTANCE;

    static {
       SlideDispatchHelper$sEnableDispatchOneLevel$2.INSTANCE = new SlideDispatchHelper$sEnableDispatchOneLevel$2();
    }
    public void SlideDispatchHelper$sEnableDispatchOneLevel$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchHelper$sEnableDispatchOneLevel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("sEnableDispatchOneLevel", false);
    }
}

package com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableDispatchPresenterGroup$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SlideDispatchHelper$sEnableDispatchPresenterGroup$2 extends Lambda implements a	// class@000b93
{
    public static final SlideDispatchHelper$sEnableDispatchPresenterGroup$2 INSTANCE;

    static {
       SlideDispatchHelper$sEnableDispatchPresenterGroup$2.INSTANCE = new SlideDispatchHelper$sEnableDispatchPresenterGroup$2();
    }
    public void SlideDispatchHelper$sEnableDispatchPresenterGroup$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchHelper$sEnableDispatchPresenterGroup$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("LaunchOpt2022DispatchPresenterGroup", false);
    }
}

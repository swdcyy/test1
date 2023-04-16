package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;

public final class LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6 extends Lambda implements l	// class@000979
{
    public static final LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6 INSTANCE;

    static {
       LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6.INSTANCE = new LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6();
    }
    public void LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6.class, "1")) {
          return;
       }
       a.p(p0, "e");
       j0.b("LiveAudienceAdNeoPendantPresenter", "report neo countdown failed", p0);
       return;
    }
}

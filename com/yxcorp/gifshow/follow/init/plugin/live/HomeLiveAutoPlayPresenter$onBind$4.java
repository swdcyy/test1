package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$onBind$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import sw5.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class HomeLiveAutoPlayPresenter$onBind$4 extends FunctionReferenceImpl implements l	// class@0010c6
{

    public void HomeLiveAutoPlayPresenter$onBind$4(HomeLiveAutoPlayPresenter p0){
       super(1, p0, HomeLiveAutoPlayPresenter.class, "onEventMainThreadNearbyNotify", "onEventMainThreadNearbyNotify\(Lcom/kwai/feature/api/social/nearby/event/NearbyAutoPlayEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLiveAutoPlayPresenter$onBind$4.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onEventMainThreadNearbyNotify(p0);
       return;
    }
}

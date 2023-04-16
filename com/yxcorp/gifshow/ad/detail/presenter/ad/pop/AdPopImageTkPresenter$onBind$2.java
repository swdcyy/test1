package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import ujc.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class AdPopImageTkPresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@001604
{

    public void AdPopImageTkPresenter$onBind$2(AdPopImageTkPresenter p0){
       super(1, p0, AdPopImageTkPresenter.class, "onHomeSplashStateEvent", "onHomeSplashStateEvent\(Lcom/yxcorp/gifshow/splash/event/HomeSplashStateEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPopImageTkPresenter$onBind$2.class, "1")) {
          return;
       }
       this.receiver.onHomeSplashStateEvent(p0);
       return;
    }
}

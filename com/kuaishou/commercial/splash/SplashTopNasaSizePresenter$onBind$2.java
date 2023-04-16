package com.kuaishou.commercial.splash.SplashTopNasaSizePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import ujc.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class SplashTopNasaSizePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@001594
{

    public void SplashTopNasaSizePresenter$onBind$2(SplashTopNasaSizePresenter p0){
       super(1, p0, SplashTopNasaSizePresenter.class, "onHomeSplashStateEvent", "onHomeSplashStateEvent\(Lcom/yxcorp/gifshow/splash/event/HomeSplashStateEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashTopNasaSizePresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onHomeSplashStateEvent(p0);
       return;
    }
}

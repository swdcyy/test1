package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$onBind$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import ujc.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class SplashNasaSlidePlayPagePresenter$onBind$4 extends FunctionReferenceImpl implements l	// class@001588
{

    public void SplashNasaSlidePlayPagePresenter$onBind$4(SplashNasaSlidePlayPagePresenter p0){
       super(1, p0, SplashNasaSlidePlayPagePresenter.class, "onHomeSplashStateEvent", "onHomeSplashStateEvent\(Lcom/yxcorp/gifshow/splash/event/HomeSplashStateEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter$onBind$4.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onHomeSplashStateEvent(p0);
       return;
    }
}

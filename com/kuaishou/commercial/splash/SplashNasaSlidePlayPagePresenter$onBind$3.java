package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.x;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class SplashNasaSlidePlayPagePresenter$onBind$3 extends FunctionReferenceImpl implements l	// class@001587
{

    public void SplashNasaSlidePlayPagePresenter$onBind$3(SplashNasaSlidePlayPagePresenter p0){
       super(1, p0, SplashNasaSlidePlayPagePresenter.class, "onHomeSplashStateEvent", "onHomeSplashStateEvent\(Lcom/yxcorp/gifshow/commercial/event/SplashEyemaxEnterDetail;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onHomeSplashStateEvent(p0);
       return;
    }
}
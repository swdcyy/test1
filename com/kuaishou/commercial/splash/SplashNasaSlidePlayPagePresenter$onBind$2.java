package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.h;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class SplashNasaSlidePlayPagePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@001586
{

    public void SplashNasaSlidePlayPagePresenter$onBind$2(SplashNasaSlidePlayPagePresenter p0){
       super(1, p0, SplashNasaSlidePlayPagePresenter.class, "onEyemaxSplashShowEvent", "onEyemaxSplashShowEvent\(Lcom/yxcorp/gifshow/commercial/event/EyemaxSplashShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onEyemaxSplashShowEvent(p0);
       return;
    }
}

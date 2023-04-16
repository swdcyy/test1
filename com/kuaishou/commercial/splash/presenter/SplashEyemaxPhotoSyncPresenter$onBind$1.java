package com.kuaishou.commercial.splash.presenter.SplashEyemaxPhotoSyncPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.commercial.splash.presenter.SplashEyemaxPhotoSyncPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import bz.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import yx.j0;
import com.yxcorp.gifshow.entity.QPhoto;

public final class SplashEyemaxPhotoSyncPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0015ce
{

    public void SplashEyemaxPhotoSyncPresenter$onBind$1(SplashEyemaxPhotoSyncPresenter p0){
       super(1, p0, SplashEyemaxPhotoSyncPresenter.class, "syncPhotoWithEvent", "syncPhotoWithEvent\(Lcom/kuaishou/commercial/splash/event/SplashEyemaxPhotoSyncEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashEyemaxPhotoSyncPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, SplashEyemaxPhotoSyncPresenter.class, "3")) {
          Object[] objArray = new Object[0];
          j0.f("SplashPhotoSyncPresenter", "sync photo with event", objArray);
          treceiver.P8(p0.a);
       }
       return;
    }
}

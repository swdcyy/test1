package com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosScreenCleanPresenter$registerPlayEndEvent$1;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import i19.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSession;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSessionState;
import msd.a;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosScreenCleanPresenter$registerPlayEndEvent$1$clearScreen$1;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosScreenCleanPresenter$registerPlayEndEvent$1$resumeScreen$1;

public final class ThanosScreenCleanPresenter$registerPlayEndEvent$1 implements ScreenCleanController	// class@0016bd
{
    public final q a;

    public void ThanosScreenCleanPresenter$registerPlayEndEvent$1(q p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       q obj = PatchProxy.apply(null, this, ThanosScreenCleanPresenter$registerPlayEndEvent$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.z;
       boolean b = (obj != null)? obj.b(): false;
       return b;
    }
    public boolean b(){
       q obj = PatchProxy.apply(null, this, ThanosScreenCleanPresenter$registerPlayEndEvent$1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.z;
       boolean b = (obj != null)? obj.c(): true;
       return b;
    }
    public ScreenCleanSessionState c(){
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, ThanosScreenCleanPresenter$registerPlayEndEvent$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.z;
       if (obj != null) {
          objArray = obj.f();
       }
       return objArray;
    }
    public void d(boolean p0,int p1,a p2){
       if (PatchProxy.isSupport(ThanosScreenCleanPresenter$registerPlayEndEvent$1.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, ThanosScreenCleanPresenter$registerPlayEndEvent$1.class, "2")) {
          return;
       }
       a.p(p2, "callback");
       q x = this.a.x;
       if (x == null) {
          a.S("mFullWebViewIsShowing");
       }
       if (a.g(x.get(), Boolean.TRUE)) {
          return;
       }else {
          this.a.S8(false);
          q z = this.a.z;
          if (z != null) {
             ScreenCleanSession.e(z, p0, new ThanosScreenCleanPresenter$registerPlayEndEvent$1$clearScreen$1(p2), 0, 4, null);
          }
          return;
       }
    }
    public void e(boolean p0,a p1){
       ThanosScreenCleanPresenter$registerPlayEndEvent$1 oregisterPla = ThanosScreenCleanPresenter$registerPlayEndEvent$1.class;
       if (PatchProxy.isSupport(oregisterPla) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oregisterPla, "1")) {
          return;
       }
       a.p(p1, "callback");
       this.a.S8(true);
       q z = this.a.z;
       if (z != null) {
          z.g(p0, new ThanosScreenCleanPresenter$registerPlayEndEvent$1$resumeScreen$1(p1));
       }
       return;
    }
}

package com.kuaishou.commercial.splash.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gz.x1;
import erd.g;
import crd.b;
import wkd.b;
import tjc.c;
import tjc.b;
import java.lang.StringBuilder;
import iz.a;
import yx.j0;
import com.kuaishou.commercial.splash.presenter.j$a;
import im8.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.Boolean;

public class j extends PresenterV2	// class@0015f4
{
    public f p;
    public f q;
    public long r;
    public long s;
    public boolean t;

    public void j(){
       super();
    }
    public void E8(){
       j oj = j.class;
       if (PatchProxy.applyVoid(null, this, oj, "2")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (!PatchProxy.applyVoidOneRefs(activity, this, oj, "4")) {
          this.X7(activity.m().subscribe(new x1(this)));
       }
       b uob = b.a(-1608526086).a();
       if (uob != null) {
          Object[] objArray = new Object[0];
          j0.f("SplashClientPresenter", "log get data "+a.a(uob), objArray);
       }
       this.p.set(new j$a(this));
       return;
    }
    public long P8(){
       Object obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.s - null > 0) {
          return ((SystemClock.elapsedRealtime() - this.s) + this.r);
       }
       return this.r;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.q.get().booleanValue();
       Object[] objArray = new Object[0];
       j0.f("SplashClientPresenter", "hasSplashLeft hasToken: "+b, objArray);
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.x8("SPLASH_AD_LOG");
       this.q = this.x8("HAS_TOKEN");
       return;
    }
}

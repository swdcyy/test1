package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$c;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import tkd.b;
import tkd.d;
import fp5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import o56.f;
import android.os.Bundle;
import java.lang.Runnable;
import ekd.k1;

public final class PictureInPicturePresenter$c implements ActivityContext$b	// class@0016b3
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$c(PictureInPicturePresenter p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter$c.class, "3")) {
          return;
       }
       a.d(this, p0);
       o oo = o.C();
       StringBuilder str = "onActivityResume ";
       String name = (p0 != null)? p0.getClass().getName(): null;
       Object[] objArray = new Object[0];
       oo.w("PictureInPicturePresent", str+name, objArray);
       int i = 0x31a55ac8;
       if (d.a(i).s0(this.b.getActivity()) && (!f.b(this.b.getActivity()) && this.b.D != null)) {
          d.a(i).YO(this.b.getActivity());
       }
    label_006d :
       return;
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter$c.class, "1")) {
          return;
       }
       a.e(this);
       PictureInPicturePresenter$c tb = this.b;
       tb.E = true;
       k1.m(tb.M);
       k1.r(this.b.M, 500);
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter$c.class, "2")) {
          return;
       }
       a.f(this);
       this.b.E = false;
       return;
    }
}

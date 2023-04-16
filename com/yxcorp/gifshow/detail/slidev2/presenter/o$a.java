package com.yxcorp.gifshow.detail.slidev2.presenter.o$a;
import jta.e;
import com.yxcorp.gifshow.detail.slidev2.presenter.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import xe5.r;
import android.view.View;
import bf5.q;
import xe5.t;
import java.lang.Boolean;
import brd.y;

public class o$a implements e	// class@0019ca
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void b(int p0,int p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       if (uoa.F == p0 && uoa.G == p1) {
          return;
       }
       uoa.F = p0;
       uoa.G = p1;
       o k = uoa.K;
       k.C = b5.a(uoa.getActivity());
       o r = this.a.r;
       if (r != null) {
          float f = 0;
          r.setTranslationX(f);
          this.a.r.setTranslationY(f);
       }
       o$a ta = this.a;
       float f1 = ta.P8();
       ta.H.p0(k, ta.F, ta.G, f1, this.a.J.h);
       this.a.E.onNext(Boolean.TRUE);
       return;
    }
}

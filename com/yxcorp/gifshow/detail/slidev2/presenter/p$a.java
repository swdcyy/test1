package com.yxcorp.gifshow.detail.slidev2.presenter.p$a;
import jta.e;
import com.yxcorp.gifshow.detail.slidev2.presenter.p;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import xe5.r;
import xe5.s;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import android.view.View;
import bf5.q;
import xe5.p;
import java.lang.Boolean;
import brd.y;

public class p$a implements e	// class@0019cc
{
    public final p a;

    public void p$a(p p0){
       this.a = p0;
       super();
    }
    public void b(int p0,int p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.H = p0;
       uoa.I = p1;
       p0.C = b5.a(this.a.getActivity());
       p x = this.a.x;
       if (x != null) {
          float f = 0;
          x.setTranslationX(f);
          this.a.x.setTranslationY(f);
       }
       p$a ta = this.a;
       ta.J.c(ta.H, ta.P8(), this.a.R8(), this.a.N.h);
       this.a.G.onNext(Boolean.TRUE);
       return;
    }
}

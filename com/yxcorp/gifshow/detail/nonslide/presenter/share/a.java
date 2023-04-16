package com.yxcorp.gifshow.detail.nonslide.presenter.share.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import z2a.b;
import erd.g;
import crd.b;
import lnc.b9;
import zhc.a;

public class a extends PresenterV2	// class@0015db
{
    public b p;
    public a q;
    public Boolean r;

    public void a(){
       super();
       this.r = Boolean.FALSE;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = RxBus.f.f(b.class).observeOn(d.a).subscribe(new b(this));
       return;
    }
    public void H8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "4")) {
          b9.a(this.p);
          this.r = Boolean.TRUE;
          uoa = this.q;
          if (uoa != null) {
             uoa.h();
          }
       }
       return;
    }
    public void P8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = Boolean.TRUE;
       a tq = this.q;
       if (tq != null) {
          tq.h();
       }
       return;
    }
}

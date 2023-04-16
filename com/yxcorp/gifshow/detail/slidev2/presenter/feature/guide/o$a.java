package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import fv5.a;
import j8a.m1;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class o$a extends a	// class@00199f
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "1")) {
          return;
       }
       o$a tb = this.b;
       tb.L = false;
       tb.R8();
       this.b.Y8();
       this.b.H = false;
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "2")) {
          return;
       }
       o$a tb = this.b;
       tb.L = true;
       long l = tb.O.i().longValue();
       if (!l - null) {
          this.b.a9();
       }else {
          o$a tb1 = this.b;
          tb1.X7(tb1.A.subscribe(new m1(this, l)));
       }
       return;
    }
}

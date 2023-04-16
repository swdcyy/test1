package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e8a.d1;

public final class OppoPreventBurnInHelper$a extends a	// class@001922
{
    public final OppoPreventBurnInHelper b;

    public void OppoPreventBurnInHelper$a(OppoPreventBurnInHelper p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInHelper$a.class, "2")) {
          return;
       }
       this.b.f(false);
       k1.m(this.b.d());
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInHelper$a.class, "1")) {
          return;
       }
       this.b.f(true);
       if (this.b.h.isResumed()) {
          k1.r(this.b.d(), this.b.c().b2.a);
       }
       return;
    }
}

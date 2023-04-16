package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e8a.d1;
import e8a.e1;
import ekd.k1;

public final class OppoPreventBurnInHelper$b implements Runnable	// class@001923
{
    public final OppoPreventBurnInHelper b;

    public void OppoPreventBurnInHelper$b(OppoPreventBurnInHelper p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInHelper$b.class, "1")) {
          return;
       }
       OppoPreventBurnInHelper$b tb = this.b;
       OppoPreventBurnInHelper f = tb.f;
       float f1 = (tb.b())? 0: this.b.c().b2.b;
       f.a(f1);
       tb = this.b;
       tb.a = tb.b() ^ 0x01;
       k1.r(this, this.b.c().b2.a);
       return;
    }
}

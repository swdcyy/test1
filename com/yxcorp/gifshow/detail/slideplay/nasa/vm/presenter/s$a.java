package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.s$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.r;
import ok.h;

public class s$a extends a	// class@001832
{
    public b b;
    public final s c;

    public void s$a(s p0){
       this.c = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, s$a.class, "2")) {
          return;
       }
       b9.a(this.b);
       Object[] objArray1 = new Object[0];
       o.C().w("SlidePlayScreenVMPresenter", "接收不到清屏事件了"+this.c.p.getUserName(), objArray1);
       s x = this.c.x;
       if (x != null) {
          objArray = x.n(x.a0());
       }
       s$a tc = this.c;
       tc.X8(tc.p);
       this.c.X8(objArray);
       PatchProxy.onMethodExit(s$a.class, "2");
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, s$a.class, "1")) {
          return;
       }
       s$a tc = this.c;
       tc.X8(tc.p);
       this.b = b9.c(this.b, new r(this));
       Object[] objArray = new Object[0];
       o.C().w("SlidePlayScreenVMPresenter", "可以接收清屏事件了"+this.c.p.getUserName(), objArray);
       this.c.Z8(0);
       PatchProxy.onMethodExit(s$a.class, "1");
       return;
    }
}

package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$b;
import jta.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.Integer;

public class j$b extends a	// class@00181b
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       boolean b;
       if (PatchProxy.isSupport2(j$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, j$b.class, "1")) {
          return;
       }
       j$b ta = this.a;
       if (ta.p == null || ta.M == null) {
          PatchProxy.onMethodExit(j$b.class, "1");
          return;
       }else if(!p0 - 0x3f800000){
          b = true;
       }else {
          b = false;
       }
       ta.Y8(b, Integer.valueOf(1));
       PatchProxy.onMethodExit(j$b.class, "1");
       return;
    }
}

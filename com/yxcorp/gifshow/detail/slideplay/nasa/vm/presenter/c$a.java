package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.c$a;
import jta.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;

public class c$a extends a	// class@001811
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       if (PatchProxy.isSupport2(c$a.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, c$a.class, "1")) {
          return;
       }
       this.a.P8(p0);
       PatchProxy.onMethodExit(c$a.class, "1");
       return;
    }
}

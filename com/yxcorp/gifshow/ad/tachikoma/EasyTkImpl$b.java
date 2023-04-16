package com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl$b;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;

public final class EasyTkImpl$b implements q	// class@0017fd
{
    public final EasyTkImpl a;
    public final q b;

    public void EasyTkImpl$b(EasyTkImpl p0,q p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EasyTkImpl$b.class, "2")) {
          return;
       }
       a.p(p0, "e");
       EasyTkImpl$b tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       Object[] objArray = new Object[0];
       j0.c("EasyTkImpl", "template render failed : "+p0.getMessage(), objArray);
       PatchProxy.onMethodExit(EasyTkImpl$b.class, "2");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoidWithListener(null, this, EasyTkImpl$b.class, "1")) {
          return;
       }
       EasyTkImpl$b tb = this.b;
       if (tb != null) {
          tb.b();
       }
       Object[] objArray = new Object[0];
       j0.f("EasyTkImpl", "template render success : ", objArray);
       PatchProxy.onMethodExit(EasyTkImpl$b.class, "1");
       return;
    }
}

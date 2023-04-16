package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$d;
import tw6.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class j$d implements e	// class@00181d
{
    public final j a;

    public void j$d(j p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport2(j$d.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, j$d.class, "2")) {
          return;
       }
       if (this.a.W8()) {
          this.a.Y8(false, Integer.valueOf(5));
       }
       PatchProxy.onMethodExit(j$d.class, "2");
       return;
    }
    public void b(int p0){
       if (PatchProxy.isSupport2(j$d.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, j$d.class, "1")) {
          return;
       }
       if (this.a.W8()) {
          this.a.Y8(true, Integer.valueOf(5));
       }
       PatchProxy.onMethodExit(j$d.class, "1");
       return;
    }
}

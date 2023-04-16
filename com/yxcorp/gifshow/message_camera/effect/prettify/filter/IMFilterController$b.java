package com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$b;
import j16.b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import java.lang.Object;
import j16.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import dc5.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$b$a;
import java.lang.Runnable;
import ekd.k1;

public final class IMFilterController$b implements b	// class@001dc4
{
    public final FilterConfig a;
    public final long b;
    public final IMFilterController c;

    public void IMFilterController$b(FilterConfig p0,long p1,IMFilterController p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(int p0,float p1){
       a.b(this, p0, p1);
    }
    public final void onComplete(int p0){
       if (PatchProxy.isSupport2(IMFilterController$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, IMFilterController$b.class, "1")) {
          return;
       }
       c.g("IMFilterController", "download last filter success : "+this.a.mFilterName);
       k1.o(new IMFilterController$b$a(this));
       PatchProxy.onMethodExit(IMFilterController$b.class, "1");
       return;
    }
    public void onError(int p0){
       a.a(this, p0);
    }
}

package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig;
import hib.b;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$a;
import nsd.u;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$lifecycleListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$eventListener$2;
import p0c.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$eventListener$2$a;
import d1c.e;
import iib.d;
import d1c.c;
import o0c.d;

public final class IMFilterOptionConfig implements b	// class@001dbb
{
    public final p a;
    public final p b;
    public final IMFilterController c;
    public static final IMFilterOptionConfig$a d;

    static {
       IMFilterOptionConfig.d = new IMFilterOptionConfig$a(null);
    }
    public void IMFilterOptionConfig(IMFilterController p0,BaseFragment p1){
       a.p(p0, "filterController");
       a.p(p1, "prettifyFragment");
       super();
       this.c = p0;
       this.a = s.c(new IMFilterOptionConfig$lifecycleListener$2(p1));
       this.b = s.c(new IMFilterOptionConfig$eventListener$2(this, p1));
    }
    public void a(Object p0){
       this.b(p0);
    }
    public void b(c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMFilterOptionConfig iMFilterOpti = IMFilterOptionConfig.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, iMFilterOpti, "3")) {
          return;
       }
       a.p(p0, "option");
       p0.m(R.layout.arg_RES_7f0d11a3);
       p0.j(false);
       p0.l(false);
       p0.q(true);
       p0.i(true);
       IMFilterOptionConfig$eventListener$2$a uoeventListe = PatchProxy.apply(null, this, iMFilterOpti, "2");
       if (uoeventListe == patchProxyRe) {
          uoeventListe = this.b.getValue();
       }
       p0.o(uoeventListe);
       p0.n(this.c.d());
       Object obj = PatchProxy.apply(null, this, iMFilterOpti, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.a.getValue();
       }
       p0.p(obj);
       return;
    }
}

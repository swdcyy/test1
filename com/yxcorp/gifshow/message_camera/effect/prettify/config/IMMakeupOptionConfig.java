package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig;
import hib.b;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$a;
import nsd.u;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$lifecycleListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$eventListener$2;
import p0c.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p0c.f$c;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import o0c.d;
import i1c.c;

public final class IMMakeupOptionConfig implements b	// class@001dc1
{
    public final p a;
    public final p b;
    public final IMMakeupController c;
    public static final IMMakeupOptionConfig$a d;

    static {
       IMMakeupOptionConfig.d = new IMMakeupOptionConfig$a(null);
    }
    public void IMMakeupOptionConfig(IMMakeupController p0,BaseFragment p1){
       a.p(p0, "makeupController");
       a.p(p1, "prettifyFragment");
       super();
       this.c = p0;
       this.a = s.c(new IMMakeupOptionConfig$lifecycleListener$2(this, p1));
       this.b = s.c(new IMMakeupOptionConfig$eventListener$2(this, p1));
    }
    public void a(Object p0){
       this.b(p0);
    }
    public void b(f p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMMakeupOptionConfig iMMakeupOpti = IMMakeupOptionConfig.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, iMMakeupOpti, "3")) {
          return;
       }
       a.p(p0, "option");
       p0.x(true);
       p0.u(new f$c(true, false));
       p0.t(MakeupKey.IM_CHAT);
       d uod = PatchProxy.apply(null, this, iMMakeupOpti, "1");
       if (uod == patchProxyRe) {
          uod = this.a.getValue();
       }
       p0.r(uod);
       Object obj = PatchProxy.apply(null, this, iMMakeupOpti, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b.getValue();
       }
       p0.q(obj);
       p0.n(true);
       p0.o(true);
       p0.s(R.layout.arg_RES_7f0d12da);
       p0.C(R.layout.arg_RES_7f0d119c);
       p0.w(R.layout.arg_RES_7f0d1198);
       p0.y(R.layout.arg_RES_7f0d12dc);
       p0.v(R.layout.arg_RES_7f0d119c);
       return;
    }
}

package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig;
import hib.b;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$a;
import nsd.u;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$beautyEventListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$lifecycleListener$2;
import p0c.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q0c.y1;
import l0c.c;
import cib.a;
import lnc.s6;
import java.util.List;
import q0c.a;
import java.util.Objects;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import u0c.a;
import s0c.d;
import h16.n;
import o0c.d;

public final class IMBeautyOptionConfig implements b	// class@001db5
{
    public long a;
    public final p b;
    public final p c;
    public final IMBeautyController d;
    public static final IMBeautyOptionConfig$a e;

    static {
       IMBeautyOptionConfig.e = new IMBeautyOptionConfig$a(null);
    }
    public void IMBeautyOptionConfig(IMBeautyController p0,BaseFragment p1){
       a.p(p0, "beautyController");
       a.p(p1, "prettifyFragment");
       super();
       this.d = p0;
       this.b = s.c(new IMBeautyOptionConfig$beautyEventListener$2(this, p1));
       this.c = s.c(new IMBeautyOptionConfig$lifecycleListener$2(this, p1));
    }
    public void a(Object p0){
       this.b(p0);
    }
    public void b(a p0){
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMBeautyOptionConfig iMBeautyOpti = IMBeautyOptionConfig.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, iMBeautyOpti, "3")) {
          return;
       }
       a.p(p0, "option");
       y1 oy1 = y1.h();
       a.o(oy1, "BeautyVersionManager.instance\(\)");
       c uoc = oy1.f();
       a.o(uoc, "BeautyVersionManager.instance\(\).postBeautyVersion");
       p0.B(uoc);
       boolean b = true;
       int i = (a.b())? 2: 1;
       p0.T(i);
       if (s6.f()) {
          list = a.f();
          a.o(list, "BeautifyConfigHelper.get¡­utifyPreDownloadExpList\(\)");
          p0.A(list);
       }else {
          list = a.c();
          a.o(list, "BeautifyConfigHelper.getBeauifyResourceList\(\)");
          p0.A(list);
       }
       p0.X(b);
       p0.G(b);
       p0.F(b);
       p0.U(b);
       p0.C(R.layout.arg_RES_7f0d0a71);
       p0.P(R.layout.arg_RES_7f0d0a73);
       p0.K(R.layout.arg_RES_7f0d0a75);
       p0.E(R.layout.arg_RES_7f0d119a);
       p0.I(b);
       p0.H(b);
       IMBeautyOptionConfig td = this.d;
       Objects.requireNonNull(td);
       Object[] objArray = PatchProxy.apply(null, td, IMBeautyController.class, "5");
       if (objArray != patchProxyRe) {
       }else {
          IMBeautyController f = td.f;
          BeautifyConfig uBeautifyCon = (f != null)? f.f(): null;
          if (uBeautifyCon == null || uBeautifyCon.mId != -1) {
             objArray = uBeautifyCon;
          }else {
             objArray = null;
          }
       }
       p0.R(objArray);
       p0.J(false);
       d uod = PatchProxy.apply(null, this, iMBeautyOpti, "1");
       if (uod == patchProxyRe) {
          uod = this.b.getValue();
       }
       p0.N(uod);
       p0.M(this.d.d());
       Object obj = PatchProxy.apply(null, this, iMBeautyOpti, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = this.c.getValue();
       }
       p0.O(obj);
       return;
    }
}

package com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.init.module.v;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.init.module.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.yxcorp.gifshow.init.module.z;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.init.module.x;
import erd.g;
import crd.b;
import eda.l;
import sxa.h;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import retrofit2.q;
import com.yxcorp.retrofit.e;
import bk5.k;
import ak5.a$a;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule$4;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule$3;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule$2;
import com.yxcorp.gifshow.init.module.u;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule$1;
import ak5.a;
import ak5.j;
import android.app.Application;
import o56.a;
import java.util.Objects;
import ok5.a;
import tk5.a;
import im8.d;
import im8.e;
import android.content.Context;
import ekd.e0;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kwai.emotionsdk.util.ActivityContext;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import android.app.Application$ActivityLifecycleCallbacks;
import jk5.b;
import jk5.d;
import ak5.g;
import java.util.concurrent.Future;
import f97.a;
import ak5.a$b;
import ak5.i;
import java.lang.RuntimeException;

public class EmotionPluginInitModule extends a	// class@00197f
{
    public static final x q;
    public static final x r;

    static {
       EmotionPluginInitModule.q = Suppliers.a(v.b);
       EmotionPluginInitModule.r = Suppliers.a(w.b);
    }
    public void EmotionPluginInitModule(){
       super();
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule.class, "2");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 13;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(EmotionPluginInitModule.class, "7");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EmotionPluginInitModule.class, "4")) {
          return;
       }
       e.g(z.b, "EmotionPluginInitModule");
       PatchProxy.onMethodExit(EmotionPluginInitModule.class, "4");
       return;
    }
    public void n(){
       a l;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, EmotionPluginInitModule.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new x(this));
       f.g(l.class, mAIN).subscribe(new h(this));
       k ok = new k();
       ok.b = "/rest/n/emotion/package/list/v2";
       ok.c = "/rest/n/emotion/favorite/list";
       ok.d = "/rest/n/emotion/favorite/delete";
       ok.e = "/rest/n/emotion/favorite/changeOrder";
       ok.f = "n/emotion/favorite/upload/image";
       ok.g = "/rest/n/emotion/favorite/add";
       ok.h = "/rest/n/emotion/favorite/upload/imageUri";
       ok.i = "/rest/n/emotion/package/info/detail";
       ok.j = "n/emotion/search/weshine";
       a$a uoa = new a$a();
       uoa.h = e.a(b.a(-1961311520).a(RouteType.HTTPS, d.b));
       uoa.b = new EmotionPluginInitModule$4(this);
       uoa.d = new EmotionPluginInitModule$3(this);
       uoa.g = ok;
       uoa.c = new EmotionPluginInitModule$2(this);
       uoa.i = u.b;
       uoa.m = new EmotionPluginInitModule$1(this);
       a uoa1 = PatchProxy.apply(objArray, uoa, a$a.class, "1");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          a$a.a(uoa.d, " mSelectPhoto");
          a$a.a(uoa.g, " server path");
          a$a.a(uoa.g.g, " server path");
          a$a.a(uoa.g.e, " server path");
          a$a.a(uoa.g.d, " server path");
          a$a.a(uoa.g.c, " server path");
          a$a.a(uoa.g.i, " server path");
          a$a.a(uoa.g.b, " server path");
          a$a.a(uoa.g.j, " server path");
          a$a.a(uoa.g.f, " server path");
          a$a.a(uoa.g.h, " server path");
          a$a.a(uoa.b, " uid callback");
          uoa1 = new a(uoa);
       }
       j oj = j.o();
       Application uApplication = a.b();
       Objects.requireNonNull(oj);
       if (!PatchProxy.applyVoidTwoRefs(uApplication, uoa1, oj, j.class, "2")) {
          if (uApplication != null && uoa1 != null) {
             oj.b = uoa1;
             l = uoa1.l;
             if (l != null) {
                a.a = l;
             }
             e.g(new a());
             e0.b(uApplication);
             if (!Fresco.hasBeenInitialized()) {
                Fresco.initialize(uApplication);
             }
             ActivityContext uActivityCon = ActivityContext.d();
             Objects.requireNonNull(uActivityCon);
             if (!PatchProxy.applyVoidOneRefs(uApplication, uActivityCon, ActivityContext.class, "12")) {
                ProcessLifecycleOwner.get().getLifecycle().addObserver(uActivityCon);
                uApplication.registerActivityLifecycleCallbacks(uActivityCon);
                uActivityCon.f = uApplication.getApplicationContext();
             }
             l = uoa1.k;
             if (!PatchProxy.applyVoidOneRefs(l, objArray, b.class, "1")) {
                if (l == null) {
                   d uod = new d();
                }
                b.a = l;
             }
             a.f(new g(uApplication, uoa1));
             if (uoa1.a() == null) {
                uoa1.d = new i(oj);
             }
          }else {
             throw new RuntimeException("init error. application or config is null");
          }
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule.class, "1");
       return;
    }
}

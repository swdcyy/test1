package com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.initmodule.FoundationInfoInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Application;
import o56.a;
import qb7.a;
import d76.c;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import f97.a;
import com.kwai.framework.initmodule.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.exceptionhandler.safemode.e;
import c97.d;
import h97.i;
import d76.f;
import d76.g;
import x97.n;
import h97.g;
import g97.d;
import g97.e;
import x97.b;
import h97.d;
import x97.a;
import h97.j;
import com.kwai.middleware.azeroth.AzerothConfig;
import c97.a;
import z1.k;
import y97.a;
import c97.b;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.Azeroth2;
import l76.k;
import k76.a;
import q97.c;
import g76.a;
import h76.b;
import j76.j;
import i76.a;
import m76.a;
import f76.a;
import com.kwai.framework.initmodule.AzerothInitModule$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import d76.d;
import erd.g;
import crd.b;
import eda.l;
import d76.e;
import java.lang.Throwable;

public class AzerothInitModule extends a	// class@000b71
{
    public static final int q;

    public void AzerothInitModule(){
       super();
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, AzerothInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, AzerothInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{FoundationInfoInitModule.class};
       return Lists.e(obj);
    }
    public void n(){
       Azeroth2 b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AzerothInitModule.class, "2")) {
          return;
       }
       Application uApplication = a.b();
       Objects.requireNonNull(a.c);
       a.b = new c(uApplication);
       a.e = a.t().d("async_enable_elastic", false);
       a.c = a.a;
       if (SystemUtil.L(uApplication)) {
          Objects.requireNonNull(e.p());
       }
       d uod = d.a();
       g og = PatchProxy.apply(objArray, this, AzerothInitModule.class, "5");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(this, new f(this));
       }
       Objects.requireNonNull(uod);
       Application context = og.getCommonParams().getContext();
       uod.a = og;
       uod.b = og.getCommonParams();
       uod.c = new d();
       uod.d = new e();
       b uob = b.b();
       Objects.requireNonNull(uob);
       a uoa = new a(uob);
       d.a().c().b("azeroth", uoa);
       AzerothConfig uAzerothConf = new AzerothConfig(new a(uod, og));
       uAzerothConf.b = uod.b.isDebugMode();
       a uoa1 = new a();
       uoa1.a = uod.b.T();
       uoa1.b = og.c();
       uoa1.c = new b(uod);
       a.q(uoa1, "config");
       uAzerothConf.c = uoa1;
       b = Azeroth2.B;
       Objects.requireNonNull(b);
       a.q(context, "context");
       a.q(uAzerothConf, "config");
       b.w(context, uAzerothConf);
       k ok = new k();
       Objects.requireNonNull(b);
       a.q(ok, "logger");
       Azeroth2.j = ok;
       a uoa2 = new a();
       Objects.requireNonNull(b);
       a.q(uoa2, "factory");
       Azeroth2.w = uoa2;
       c uoc = uoa2.create();
       a.h(uoc, "factory.create\(\)");
       Azeroth2.i = uoc;
       uoa2 = new a();
       Objects.requireNonNull(b);
       a.q(uoa2, "crashHandler");
       Azeroth2.n = uoa2;
       b uob1 = new b();
       Objects.requireNonNull(b);
       a.q(uob1, "downloader");
       Azeroth2.m = uob1;
       j oj = new j();
       Objects.requireNonNull(b);
       a.q(oj, "link");
       Azeroth2.k = oj;
       uoa2 = new a();
       Objects.requireNonNull(b);
       a.q(uoa2, "switch");
       Azeroth2.o = uoa2;
       uoa2 = new a();
       Objects.requireNonNull(b);
       a.q(uoa2, "uiManager");
       Azeroth2.q = uoa2;
       uoa2 = new a();
       Objects.requireNonNull(b);
       a.q(uoa2, "abTest");
       Azeroth2.p = uoa2;
       AzerothInitModule$a uoa3 = new AzerothInitModule$a(this);
       Objects.requireNonNull(b);
       a.q(uoa3, "loader");
       Azeroth2.r = uoa3;
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new d(this));
       f.g(l.class, mAIN).subscribe(new e(this));
       return;
    }
}

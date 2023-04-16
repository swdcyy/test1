package com.yxcorp.gifshow.growth.uninstall.UninstallAppDetainmentInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import ara.d;
import erd.g;
import crd.b;
import zca.r;
import ara.b;
import zca.p;
import ara.c;
import wh5.c;
import com.yxcorp.gifshow.growth.uninstall.a;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import ara.e;

public class UninstallAppDetainmentInitModule extends TTIInitModule	// class@001583
{
    public static final int q;

    public void UninstallAppDetainmentInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, UninstallAppDetainmentInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallAppDetainmentInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, UninstallAppDetainmentInitModule.class, "3")) {
          RxBus f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          f.g(l.class, mAIN).subscribe(new d(this));
          f.g(r.class, mAIN).subscribe(new b(this));
          f.g(p.class, mAIN).subscribe(new c(this));
       }
       if (!c.b()) {
          e.g(a.b, "UninstallAppDetainmentInitModule");
       }
       return;
    }
    public void onSafeLockEvent(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallAppDetainmentInitModule.class, "6")) {
          return;
       }
       e.b();
       return;
    }
}

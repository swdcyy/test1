package com.yxcorp.gifshow.init.module.PreDeserializerInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.init.module.PreDeserializerInitModule$onForeground$1;
import java.lang.Runnable;
import t45.c;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import pt7.a;
import zk0.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import zk0.b;
import erd.g;
import crd.b;
import eda.n;
import zk0.c;
import zk0.a;
import zk0.d;

public final class PreDeserializerInitModule extends a	// class@00199a
{

    public void PreDeserializerInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void i0(){
       if (PatchProxy.applyVoidWithListener(null, this, PreDeserializerInitModule.class, "3")) {
          return;
       }
       c.a(PreDeserializerInitModule$onForeground$1.b);
       PatchProxy.onMethodExit(PreDeserializerInitModule.class, "3");
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, PreDeserializerInitModule.class, "1")) {
          return;
       }
       String str = "2";
       if (!PatchProxy.applyVoidWithListener(objArray, this, PreDeserializerInitModule.class, str)) {
          a.b();
          PatchProxy.onMethodExit(PreDeserializerInitModule.class, str);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, e.class, "5")) {
          RxBus f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          f.g(l.class, mAIN).subscribe(b.b);
          f.g(n.class, mAIN).subscribe(c.b);
          f.g(a.class, mAIN).subscribe(d.b);
       }
       PatchProxy.onMethodExit(PreDeserializerInitModule.class, "1");
       return;
    }
    public int priority(){
       return 100;
    }
}
